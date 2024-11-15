package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.GetLoggedUserDto;
import com.softonicabackend.domain.user.dto.UserResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

interface UserRepository extends JpaRepository<UserEntity, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Optional<UserResponseDto> findByUsername(String nickname);
    @Query("SELECT new com.softonicabackend.domain.user.dto.GetLoggedUserDto(u.username, u.password) FROM UserEntity u WHERE u.username = :username")
    Optional<GetLoggedUserDto> findUsernameAndPasswordByNickname(String username);
}
