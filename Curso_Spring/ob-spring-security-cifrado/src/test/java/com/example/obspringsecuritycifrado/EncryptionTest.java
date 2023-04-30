package com.example.obspringsecuritycifrado;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

public class EncryptionTest {

    /**
     * BCrypt es un algoritmo que genera su propio salt de 16 bytes
     *
     * EL resultado de cifrar con BCrypt sera un string de 60 caracteres
     *
     * $a version
     * $10 fuerza (valor que va de 4 a 31, por defecto vale 10)
     * Los 22 siguientes caracteres son el salt generado
     */
    @Test
    void bcryptTest(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode("admin");
        System.out.println(hashedPassword);

        boolean matches = passwordEncoder.matches("admin", "$2a$10$Q1eL.hu9ktn5P4DROzOZ9.i4zxM/Sh/6CfaB/9KMM6vmI6aImhI1m");
        System.out.println(matches);
    }

    @Test
    void bcryptCheckMultiplePasswords(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        for (int i = 0; i<30; i++){
            System.out.println(passwordEncoder.encode("admin"));
        }
    }

    @Test
    void pbkdf2() {
        Pbkdf2PasswordEncoder passwordEncoder = new Pbkdf2PasswordEncoder();
        for (int i = 0; i<30; i++){
            System.out.println(passwordEncoder.encode("admin"));
        }
    }

    @Test
    void argon() {
        Argon2PasswordEncoder passwordEncoder = new Argon2PasswordEncoder();
        for (int i = 0; i<30; i++){
            System.out.println(passwordEncoder.encode("admin"));
        }
    }

    @Test
    void scrypt() {
        SCryptPasswordEncoder passwordEncoder = new SCryptPasswordEncoder();
        for (int i = 0; i<30; i++){
            System.out.println(passwordEncoder.encode("admin"));
        }
    }

    @Test
    void springPasswordEncoders(){
        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put("bcrypt", new BCryptPasswordEncoder());
        encoders.put("pbkdf2", new Pbkdf2PasswordEncoder());
        encoders.put("argon2", new Argon2PasswordEncoder());
        encoders.put("scrypt", new SCryptPasswordEncoder());

        PasswordEncoder passwordEncoder = new DelegatingPasswordEncoder("bcrypt", encoders);

        String hashedPassword = passwordEncoder.encode("admin");
        System.out.println(hashedPassword);
    }
}
