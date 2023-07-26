package com.joseph.springsecurity.basicAuthentication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class BasicAuthSecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//        Authorizing Http Requests

        http.authorizeHttpRequests(
                auth -> {
                    auth.anyRequest().authenticated();
                });

//        Disabling Session by making itr stateless

        http.sessionManagement(
                session ->
                        session.sessionCreationPolicy(
                                SessionCreationPolicy.STATELESS)
        );

        //Disabling Form Login

        //http.formLogin();

        //Enabling Basic Auth Pop up
        http.httpBasic(withDefaults());

        //Disabling CSRF

        http.csrf(csrf -> csrf.disable());

        //Enable html frames that is used in H2 database(disabled by spring security)

        http.headers().frameOptions().sameOrigin();

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailService() {

        var user = User.withUsername("joseph")
                .password("{noop}1234")
                .roles("USER")
                .build();


        var admin = User.withUsername("admin")
                .password("{noop}1234")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }


//    To get database schema ready for data population
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION)
                .build();
    }

}


//Using Enum in the code
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    public enum UserRole {
//        USER,
//        ADMIN
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.withUsername("user")
//                .password("{noop}1234")
//                .roles(UserRole.USER.name())
//                .build();
//
//        UserDetails admin = User.withUsername("admin")
//                .password("{noop}1234")
//                .roles(UserRole.ADMIN.name())
//                .build();
//
//        return new InMemoryUserDetailsManager(user, admin);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/admin/**").hasRole(UserRole.ADMIN.name())
//                .antMatchers("/**").hasRole(UserRole.USER.name())
//                .and()
//                .formLogin()
//                .and()
//                .httpBasic();
//    }
//}

