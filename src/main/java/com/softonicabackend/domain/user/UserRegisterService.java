package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.UserRegisterDto;
import com.softonicabackend.domain.user.dto.UserRegisterResponseDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class UserRegisterService implements UserRegistration{

    private final UserRepository userRepository;
    @Override
    public UserRegisterResponseDto registerUser(UserRegisterDto userRegisterDto) {
        return null;
    }
}
