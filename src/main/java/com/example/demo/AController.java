package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author David Tekan <david.tekan@sap.com>
 * @project demo
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("a")
public class AController {
    private final AService aService;

    @GetMapping("/all")
    public List<A> all() {
        return aService.all();
    }
}
