package com.softonicabackend.domain.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class UserBeanConfiguration {

    @Bean
    UserFacade userFacade(UserRegistration userRegistration, UserFinderService userFinderService){
        return new UserFacade(userRegistration, userFinderService);
    }

    @Bean
    UserRegisterService userRegisterService(UserRepository userRepository) {
        return new UserRegisterService(userRepository);
    }

    @Bean
    UserFinderService userFinderService(UserRepository userRepository){
        return new UserFinderService(userRepository);
    }
}
