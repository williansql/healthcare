package com.fofapps.healthcare.address;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String street;

    @Column
    private Integer number;

    @Column
    private String neighborhood;

    @Column
    private String zipCode;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String country;

    // ... getters and setters
}
