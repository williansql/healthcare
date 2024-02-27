package com.fofapps.healthcare.address;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> findAll(Pageable pageable) {
        return addressRepository.findAll(pageable).getContent();
    }

    public Address findById(Long id) {
        return addressRepository.findById(id).orElseThrow(() -> new RuntimeException("Address not found"));
    }

    public Address save(Address addressDTO) {
        Address address = new Address();
        BeanUtils.copyProperties(addressDTO, address);
        return addressRepository.save(address);
    }

    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    public Address update(Address id, Long addressDTO) {
        Address address = findById(id.getId());
        BeanUtils.copyProperties(addressDTO, address);
        return addressRepository.save(address);
    }

}
