package com.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class SecurityConfiguration {
    // InMemory User로 인증하기
    public UserDetailsManager userDetailsManager() {
        UserDetails userDetails = User.withDefaultPasswordEncoder() // 더이상 사용되지 않음
                .username("user")
                .password("1111")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(userDetails);
    }
}
