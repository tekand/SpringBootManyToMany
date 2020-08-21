package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author David Tekan <david.tekan@sap.com>
 * @project demo
 */
public interface DRepository
        extends JpaRepository<D, Long> {
}