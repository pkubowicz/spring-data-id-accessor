package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@SpringBootApplication
@EnableReactiveMongoRepositories
class Application

data class User(
    val id: String? = null,
    val flags: Map<String, Any>, // change this to <String, String> and test will start passing
)

interface UserRepository : ReactiveMongoRepository<User, String>
