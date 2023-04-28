package com.sergeev.application.repository;

import com.sergeev.application.entity.Address;
import com.sergeev.application.entity.dto.AddressDto;

public interface AddressRepository {
    Address findById(Integer id);
    AddressDto findByIdWithoutLazy(Integer id);
}
