package com.example.demo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
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
public class A {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    @Builder.Default
    @ManyToMany
    @JsonManagedReference
    @EqualsAndHashCode.Exclude
    Set<B> bs = new HashSet<>();

}
