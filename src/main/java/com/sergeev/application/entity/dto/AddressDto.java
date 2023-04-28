package com.sergeev.application.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for exclude Lazy field from mapping
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class AddressDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idAddress;
    private String city;
    private String street;
}
