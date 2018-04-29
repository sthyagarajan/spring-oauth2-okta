package com.sjsu.groceryonthefly.onlinecart;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@EnableOAuth2Sso
@SpringBootApplication
@RestController
public class OnlineCartApplication {

        public static void main(String[] args) {
            SpringApplication.run(OnlineCartApplication.class, args);
        }

        @GetMapping("/")
        public String getMessageOfTheDay(Principal principal, Model model) {
           return principal.getName().concat(" is the person who is logged in");
        }

}
