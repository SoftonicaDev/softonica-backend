package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.UserRegisterDto;
import com.softonicabackend.domain.user.dto.UserRegisterResponseDto;
import com.softonicabackend.domain.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class UserFacade {

    private final UserRegistration userRegistration;
    private final UserFinderService userFinderService;

    UserRegisterResponseDto register(UserRegisterDto userRegisterDto){
        return userRegistration.registerUser(userRegisterDto);
    }

    public UserResponseDto findUserByUsername(String username) {
        return userFinderService.getLoggedUser(username);
    }
}
