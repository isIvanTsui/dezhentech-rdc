package com.dezhentech.test;

import com.dezhentech.common.security.utils.SecurityUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestMain {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("123456");
        System.out.println(encode);
        System.out.println(encoder.matches("123456", encode));
    }
}
