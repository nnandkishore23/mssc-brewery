package com.dxc.msscbrewery.services;

import com.dxc.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID beerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID beerId, CustomerDto beerDto);

    void deleteCustomer(UUID beerId);
}
