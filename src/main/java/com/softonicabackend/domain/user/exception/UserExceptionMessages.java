package com.softonicabackend.domain.user.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserExceptionMessages {

    USER_WITH_GIVEN_USERNAME_ALREADY_EXIST("username taken"),
    EMAIL_ALREADY_TAKEN("email taken"),
    USER_NOT_FOUND("user not found");
    private final String message;
}
