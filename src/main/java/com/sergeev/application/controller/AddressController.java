package com.sergeev.application.controller;

import com.sergeev.application.entity.Address;
import com.sergeev.application.entity.dto.AddressDto;
import com.sergeev.application.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/address")
@AllArgsConstructor
public class AddressController {
    private AddressService addressService;

    @GetMapping(value = "/true/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable("id") int id) {
        Address address = addressService.findById(id);
        return new ResponseEntity<>(address, OK);
    }
    @GetMapping(value = "/false/{id}")
    public ResponseEntity<AddressDto> getAddressByIdWithoutProxy(@PathVariable("id") int id) {
        AddressDto addressDto = addressService.findByIdWithoutLazy(id);
        return new ResponseEntity<>(addressDto, OK);
    }
}
