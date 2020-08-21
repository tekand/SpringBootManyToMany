package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Tekan <david.tekan@sap.com>
 * @project demo
 */
@Service
@RequiredArgsConstructor
public class AService {
    private final ARepository aRepository;

    public List<A> all() {
        return aRepository.findAll();
    }
}
