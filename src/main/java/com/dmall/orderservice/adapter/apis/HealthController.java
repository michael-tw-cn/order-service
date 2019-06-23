package com.dmall.orderservice.adapter.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String health() {
        return LocalDateTime.now().toString();
    }
}
