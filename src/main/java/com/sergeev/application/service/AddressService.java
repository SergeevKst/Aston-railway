package com.sergeev.application.service;

import com.sergeev.application.entity.Address;
import com.sergeev.application.entity.dto.AddressDto;

public interface AddressService {
    Address findById(Integer id);
    AddressDto findByIdWithoutLazy(Integer id);
}
