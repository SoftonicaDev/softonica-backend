package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.UserResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface UserRepository extends JpaRepository<UserEntity, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Optional<UserResponseDto> findUsernameAndPasswordByNickname(String nickname);


}
