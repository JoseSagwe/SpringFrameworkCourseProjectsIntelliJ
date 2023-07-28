package com.joseph.OAuth;

import org.springframework.context.annotation.Configuration;

@Configuration
public class OauthSecurityConfiguration {

    @Bean
    @Order(SecurityProperties.BASIC_AUTH_ORDER)
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        // http.authorizeHttpRequests().anyRequest().authenticated();
        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());

        //http.formLogin();
        //http.httpBasic();
        http.oauth2Login(Customizer.withDefaults());
        return http.build();
    }
}
