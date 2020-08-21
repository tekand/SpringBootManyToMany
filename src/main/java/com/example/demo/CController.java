package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author David Tekan <david.tekan@sap.com>
 * @project demo
 */
@RestController
@RequestMapping("c")
public class CController {
    private final CService cService;

    public CController(CService cService) {
        this.cService = cService;
    }

    @GetMapping("/all")
    public List<C> all() {
        return cService.all();
    }
}

