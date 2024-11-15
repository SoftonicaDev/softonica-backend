package com.softonicabackend.domain.user.dto;

public record GetLoggedUserDto(
        String username,
        String password
){
}