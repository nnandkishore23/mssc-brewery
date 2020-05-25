package com.dxc.msscbrewery.services;

import com.dxc.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID beerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Nitin Sharma")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID beerId, CustomerDto beerDto) {
      log.info("IN UPDATE CUSTOMER");
    }

    @Override
    public void deleteCustomer(UUID beerId) {
       log.info("IN DELETE CUSTOMER");
    }
}
