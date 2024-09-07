package com.example.unicode.config;

import com.example.unicode.model.Unicode;
import com.example.unicode.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class initData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;


    @Override
    public void run(String... args) throws Exception {

        int maxValue = Character.MAX_VALUE;
        Set<Character> chars = new HashSet<>();

        for (char c = 0; c < maxValue; c++){
            chars.add(c);
        }

        for (char c: chars){
            Unicode unicode = new Unicode();
            unicode.setBogstav(c);
            unicode.setUnicode(c);
            unicodeRepository.save(unicode);
        }


    }
}
