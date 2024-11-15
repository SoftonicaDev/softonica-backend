package com.softonicabackend.infrastructure.user.controller;

import com.softonicabackend.domain.user.UserFacade;
import com.softonicabackend.domain.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/users")
@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
class UserController {

    private final UserFacade userFacade;

    @GetMapping("/get-current-user")
    public ResponseEntity<UserResponseDto> getCurrentUser(@AuthenticationPrincipal UserDetails principal) {
        String username = principal.getUsername();
        UserResponseDto userResponseDto = userFacade.findUserByUsername(username);
        return ResponseEntity.ok(userResponseDto);
    }

}
