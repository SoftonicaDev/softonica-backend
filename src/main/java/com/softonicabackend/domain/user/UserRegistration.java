package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.UserRegisterDto;
import com.softonicabackend.domain.user.dto.UserRegisterResponseDto;
import com.softonicabackend.domain.user.dto.UserResponseDto;

interface UserRegistration {

    UserRegisterResponseDto registerUser(UserRegisterDto userRegisterDto);

}
