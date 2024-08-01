package com.example.springboot.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurity {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable());
        // this section says allow all pages EXCEPT the ones that are in the AntPathRequestMatcher
        // anything in AntPathRequestMatcher will require the user to be authenticated
        http.authorizeRequests()
                .requestMatchers(
                        new AntPathRequestMatcher("/admin/**"),
                        new AntPathRequestMatcher("/employee/**")).authenticated()
                .anyRequest().permitAll();

        // the loginPage parameter is the actual URL of the login page
        // the loginProcessingUrl is the URL that the form will submit to
        http.formLogin(formLogin -> formLogin
                .loginPage("/account/login")
                .loginProcessingUrl("/account/loginProcessing"));


        // this is the URL that will log a user out
        http.logout(formLogout -> formLogout
                .invalidateHttpSession(true)
                .logoutUrl("/account/logout")
                .logoutSuccessUrl("/"));
        return http.build();






    }

    @Bean(name = "passwordEncoder")
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

}
