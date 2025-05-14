package com.be.winery_app.controller;

import com.be.winery_app.dto.CustomerDTO;
import com.be.winery_app.service.Impl.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl service;

    @GetMapping("/getAllCustomers")
    public List<CustomerDTO> getAllCustomers() {
        return service.getAllCustomerData();
    }

    @GetMapping("/getCustomerById")
    public CustomerDTO getCustomerById(@Validated @RequestParam(name = "customerId") Integer id) {
        return service.getCustomerObjectById(id);
    }

    @PostMapping("/newCustomer")
    public CustomerDTO createCustomer(@Validated @RequestBody CustomerDTO body) {
        return service.insertNewCustomerObjectData(body);
    }

    @PutMapping("/updateCustomer")
    public CustomerDTO updateCustomer(@Validated @RequestBody CustomerDTO body) {
        return service.updateExistingCustomerObjectData(body);
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public CustomerDTO deleteCustomer(@Validated @PathVariable("id") Integer id) {
        return service.deleteCustomerObjectData(id);
    }
}
