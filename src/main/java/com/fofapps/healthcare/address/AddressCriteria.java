package com.fofapps.healthcare.address;

import org.springframework.data.jpa.domain.Specification;

public class AddressCriteria {

    private static String street;

    public Specification<Address> createSpecification(AddressCriteria criteria) {
        Specification<Address> specs = Specification.where(null);
        if (criteria.street != null)
            specs = specs.or(AddressCriteria.searchByStreet(criteria.street));
        return specs;
    }

    private static Specification<Address> searchByStreet(String name) {
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.like(
                        criteriaBuilder.lower(root.get("street")), "%" + street.toLowerCase() + "%"));
    }
}
