package com.rest.oauth2.encoding;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EncodingTest {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        System.out.printf("testSecret : %s\n", passwordEncoder.encode("testSecret"));
        System.out.printf("testClientId:testSecret : %s\n", passwordEncoder.encode("testClientId:testSecret"));
        System.out.printf("secondSecret : %s\n", passwordEncoder.encode("secondSecret"));
        System.out.printf("secondApp:secondSecret : %s\n", passwordEncoder.encode("secondApp:secondSecret"));
    }
}
