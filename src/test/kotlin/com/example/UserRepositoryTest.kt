package com.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserRepositoryTest(private val userRepository: UserRepository) {

    @Test
    fun insertsUser() {
        userRepository.deleteAll().block()
        val inserted = userRepository.save(
            User(
                flags = mapOf("foo" to "bar"),
                id = null
            )
        ).block()!!

        assertThat(inserted.id).isNotBlank()
    }
}
