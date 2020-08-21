package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @author David Tekan <david.tekan@sap.com>
 * @project demo
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class C {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    @ManyToMany
    List<D> ds;

}