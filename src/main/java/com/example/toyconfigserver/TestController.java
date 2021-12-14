package com.example.toyconfigserver;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final Environment env;

    @GetMapping("/all")
    public ResponseEntity<List<String>> findAllProperties(){

        return new ResponseEntity<>(Arrays.asList(env.getProperty("token-expire"), env.getProperty("salt")), HttpStatus.OK);
    }
}
