package com.softonicabackend.domain.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class UserBeanConfiguration {

    @Bean
    UserRegisterService userRegisterService(UserRepository userRepository) {
        return new UserRegisterService(userRepository);
    }
}
