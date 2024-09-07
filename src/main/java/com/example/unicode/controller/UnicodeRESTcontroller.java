package com.example.unicode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UnicodeRESTcontroller {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i){
        char c = (char)i;
        return "unicode=" + i + "char=" + c;
    }

    @GetMapping("/character/{c}")
    public String charToUnicode(@PathVariable char c){
        int i = c;
        return "unicode=" + i + "char=" + c;
    }

    @GetMapping("/range/{c}/{i}")
    public List<String> rangeUnicode(@PathVariable char c, @PathVariable int i){
        int unicode = c;
        int max = unicode + i;
        List<String> lst = new ArrayList<>();
        for (int n = unicode; n < max; n++){
            lst.add("character=" + (char) n + " unicode=" + n);
        }
        return lst;
    }
}
