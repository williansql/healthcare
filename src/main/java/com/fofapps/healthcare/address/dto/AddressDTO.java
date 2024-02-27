package com.fofapps.healthcare.address.dto;

import lombok.Data;

@Data
public class AddressDTO {

    private Long id;

    private String street;

    private Integer number;

    private String neighborhood;

    private String zipCode;

    private String city;

    private String state;

    private String country;

    // ... constructors
}
