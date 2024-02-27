package com.fofapps.healthcare.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> findAll(Pageable pageable) {
        return addressService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Address findById(@PathVariable Long id) {
        return addressService.findById(id);
    }

    @PostMapping
    public Address save(@RequestBody Address address) {
        return addressService.save(address);
    }

    @PutMapping("/{id}")
    public Address update(@RequestBody Address address, @PathVariable Long id) {
        return addressService.update(address, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        addressService.delete(id);
    }
}
