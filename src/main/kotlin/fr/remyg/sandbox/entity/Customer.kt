package fr.remyg.sandbox.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document
class Customer() {
    @Id lateinit var id: ObjectId
    @Field lateinit var firstName: String
    @Field lateinit var lastName: String
    constructor(id: ObjectId, firstName: String, lastName: String): this() {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
    }
}