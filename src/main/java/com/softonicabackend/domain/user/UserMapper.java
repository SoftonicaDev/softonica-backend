package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.UserRegisterResponseDto;

class UserMapper {

    static UserRegisterResponseDto mapToResponseDto(UserEntity user){
        return new UserRegisterResponseDto(user.getUsername(),
                user.getEmail());
    }
}
