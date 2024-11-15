package com.softonicabackend.infrastructure.user.controller;

import com.softonicabackend.domain.user.UserFacade;
import com.softonicabackend.domain.user.dto.GetLoggedUserDto;
import com.softonicabackend.domain.user.dto.UserRegisterDto;
import com.softonicabackend.domain.user.dto.UserRegisterResponseDto;
import com.softonicabackend.domain.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/users")
@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
class UserController {

    private final UserFacade userFacade;

    @GetMapping("/me")
     ResponseEntity<GetLoggedUserDto> getCurrentUser(@AuthenticationPrincipal UserDetails principal) {
        String username = principal.getUsername();
        GetLoggedUserDto userResponseDto = userFacade.findUserByUsername(username);
        return ResponseEntity.ok(userResponseDto);
    }

    @PostMapping()
    ResponseEntity<UserRegisterResponseDto>register(@RequestBody UserRegisterDto userRegisterDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userFacade.register(userRegisterDto));
    }

}
