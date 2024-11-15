package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.GetLoggedUserDto;
import com.softonicabackend.domain.user.dto.UserResponseDto;

interface UserFinder {

    GetLoggedUserDto getLoggedUser(String username);
}
