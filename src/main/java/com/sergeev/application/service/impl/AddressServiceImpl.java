package com.sergeev.application.service.impl;

import com.sergeev.application.entity.Address;
import com.sergeev.application.entity.dto.AddressDto;
import com.sergeev.application.repository.AddressRepository;
import com.sergeev.application.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for use transaction
 */
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    @Override
    @Transactional
    public Address findById(Integer id) {
        return addressRepository.findById(id);
    }

    @Override
    @Transactional
    public AddressDto findByIdWithoutLazy(Integer id) {
        return addressRepository.findByIdWithoutLazy(id);
    }

}
