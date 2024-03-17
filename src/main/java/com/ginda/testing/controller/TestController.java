package com.ginda.testing.controller;

import com.ginda.testing.dto.TestDto;
import com.ginda.testing.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private final TestService service;
    public TestController(TestService service) {
        this.service = service;
    }

    @PostMapping(value = {"/data"}, consumes = {"application/json"})
    public ResponseEntity<Void> writeData(@RequestBody TestDto body) {
        service.writeData(body);
        return ResponseEntity.ok().build();
    }
}
