package ua.goit.customerdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.customerdata.models.Customer;
import ua.goit.customerdata.repository.PhoneNumberRepository;
import ua.goit.customerdata.service.CustomerService;

import java.util.List;

@Controller
public class CustomerController {
    private final CustomerService customerService;
    private final PhoneNumberRepository repository;

    @Autowired
    public CustomerController(CustomerService customerService, PhoneNumberRepository repository) {
        this.customerService = customerService;
        this.repository = repository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        List<Customer> customerList = customerService.findAll();

        return new ModelAndView("index", "listCustomer", repository.findAll());
    }
}
