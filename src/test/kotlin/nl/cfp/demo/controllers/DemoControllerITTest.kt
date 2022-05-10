package nl.cfp.demo.controllers

import nl.cfp.demo.DemoApplication
import nl.cfp.demo.models.Building
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.notNullValue
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.ResponseEntity

@SpringBootTest(classes = [DemoApplication::class], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class DemoControllerITTest {

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun `test that service starts`() {

        val result = restTemplate.getForEntity("/overview", List::class.java)


        assertThat(result, notNullValue())
        assertThat(result.body?.size, `is`(4))

    }


}