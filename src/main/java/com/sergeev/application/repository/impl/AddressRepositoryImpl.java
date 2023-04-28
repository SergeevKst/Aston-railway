package com.sergeev.application.repository.impl;

import com.sergeev.application.entity.dto.AddressDto;
import com.sergeev.application.repository.AddressRepository;
import com.sergeev.application.entity.Address;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * Repository for work with Data base source
 */
@Repository
@RequiredArgsConstructor
public class AddressRepositoryImpl implements AddressRepository {
    private final SessionFactory sessionFactory;

    /**
     * @param id this param can assist you for finding instance
     * @return instance which was found
     */
    @Override
    public Address findById(Integer id) {
        TypedQuery<Address> query = sessionFactory.getCurrentSession()
                .createNamedQuery("Address.getAddressById", Address.class)
                .setParameter("id", id);
        return query.getSingleResult();
    }

    /**
     * @param id this param can assist you for finding instance
     * @return instance which was found without lazy field
     */
    @Override
    public AddressDto findByIdWithoutLazy(Integer id) {
        TypedQuery<Address> query = sessionFactory.getCurrentSession()
                .createNamedQuery("Address.getAddressByIdLazy", Address.class)
                .setParameter("id", id);
        Address address = query.getSingleResult();
        return AddressDto.builder()
                .idAddress(address.getIdAddress())
                .city(address.getCity())
                .street(address.getStreet())
                .build();
    }
}
