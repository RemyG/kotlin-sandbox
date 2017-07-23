package fr.remyg.sandbox.repository

import fr.remyg.sandbox.entity.Customer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : MongoRepository<Customer, String> {

    fun findByFirstName(firstName: String): Customer

    fun findByLastName(lastName: String): List<Customer>

}