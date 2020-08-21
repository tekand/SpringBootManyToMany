package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class D {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    @ManyToMany(mappedBy = "ds")
    @JsonIgnore
    List<C> cs;
}
