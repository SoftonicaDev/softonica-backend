package com.softonicabackend.domain.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
class UserBeanConfiguration {

    @Bean
    UserFacade userFacade(UserRegistration userRegistration, UserFinderService userFinderService){
        return new UserFacade(userRegistration, userFinderService);
    }

    @Bean
    UserRegisterService userRegisterService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return new UserRegisterService(userRepository,passwordEncoder);
    }

    @Bean
    UserFinderService userFinderService(UserRepository userRepository){
        return new UserFinderService(userRepository);
    }
}
