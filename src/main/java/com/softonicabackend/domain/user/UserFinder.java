package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.UserResponseDto;

public interface UserFinder {

    UserResponseDto getLoggedUser(String username);

}
