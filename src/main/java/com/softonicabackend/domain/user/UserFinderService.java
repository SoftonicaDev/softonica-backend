package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.UserResponseDto;
import com.softonicabackend.domain.user.exception.UserExceptionMessages;
import com.softonicabackend.domain.user.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class UserFinderService implements UserFinder {

    private final UserRepository userRepository;

    @Override
    public UserResponseDto getLoggedUser(String username) {
         return userRepository.findByUsername(username)
                      .orElseThrow(() -> new UserNotFoundException(UserExceptionMessages.USER_NOT_FOUND.getMessage()));
    }
}
