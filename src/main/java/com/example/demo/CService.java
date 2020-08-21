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
public class CService {
    private final CRepository cRepository;

    public List<C> all() {
        return cRepository.findAll();
    }
}
