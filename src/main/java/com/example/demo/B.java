package com.example.demo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
public class B {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    @Builder.Default
    @ManyToMany(mappedBy = "bs")
    @JsonBackReference
    @EqualsAndHashCode.Exclude
    Set<A> as = new HashSet<>();
}
