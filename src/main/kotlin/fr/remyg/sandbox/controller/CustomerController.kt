package fr.remyg.sandbox.controller

import fr.remyg.sandbox.repository.CustomerRepository
import fr.remyg.sandbox.entity.Customer
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController(val customerRepository: CustomerRepository) {

    @RequestMapping("random", method = arrayOf(RequestMethod.GET))
    fun randomCustomer(): List<Customer> {
        var c = Customer(ObjectId(), "James", "Garfield")
        customerRepository.insert(c)
        return customerRepository.findByLastName("Garfield")
    }

    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun findAll(): List<Customer> {
        return customerRepository.findAll()
    }

}