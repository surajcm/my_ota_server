package com.github.surajcm.online.travel.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests { authz ->
                authz
                    .requestMatchers("/actuator/health", "/actuator/info").permitAll()
                    // Sandbox: NDC endpoints and API docs are open so test tooling can reach them.
                    .requestMatchers("/", "/ndc/**").permitAll()
                    .requestMatchers("/swagger-ui/**", "/swagger-ui.html", "/v3/api-docs/**").permitAll()
                    .anyRequest().authenticated()
            }
            .httpBasic { }
            .csrf { it.disable() } // Disable CSRF for REST API - enable if serving web forms

        return http.build()
    }
}
