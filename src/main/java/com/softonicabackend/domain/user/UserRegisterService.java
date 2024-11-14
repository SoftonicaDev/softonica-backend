package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.UserRegisterDto;
import com.softonicabackend.domain.user.dto.UserRegisterResponseDto;
import com.softonicabackend.domain.user.exception.UserAlreadyExistException;
import com.softonicabackend.domain.user.exception.UserExceptionMessages;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class UserRegisterService implements UserRegistration {

    private final UserRepository userRepository;

    @Override
    public UserRegisterResponseDto registerUser(UserRegisterDto userRegisterDto) {
        validateUsernameAndEmailUniqueness(userRegisterDto.username(), userRegisterDto.email());
        UserEntity userToSave = createUserObject(userRegisterDto);
        UserEntity savedUser = userRepository.save(userToSave);
        return UserMapper.mapToResponseDto(savedUser);
    }

    UserEntity createUserObject(UserRegisterDto userRegisterDto) {
        /*
    Jak bedizesz dawac Bcrypta to zrob to w infra zeby tam hashowalo haslo
     */
        return new UserEntity(userRegisterDto.username(),
                userRegisterDto.email(),
                userRegisterDto.password());
    }

    void validateUsernameAndEmailUniqueness(String username, String email) {
        isUsernameExist(username);
        isEmailExist(email);
    }

    void isUsernameExist(String username) {
        if (userRepository.existsByUsername(username)) {
            throw new UserAlreadyExistException(UserExceptionMessages.
                    USER_WITH_GIVEN_USERNAME_ALREADY_EXIST.getMessage());
        }
    }

    void isEmailExist(String email) {
        if (userRepository.existsByEmail(email)) {
            throw new UserAlreadyExistException(UserExceptionMessages.
                    EMAIL_ALREADY_TAKEN.getMessage());
        }
    }
}
