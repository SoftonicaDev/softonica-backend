package com.softonicabackend.domain.user.dto;

public record UserRegisterDto(String username,
                              String email,
                              String password) {
}
