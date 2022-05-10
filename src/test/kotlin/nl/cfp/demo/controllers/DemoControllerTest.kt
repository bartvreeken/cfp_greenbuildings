package nl.cfp.demo.controllers

import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import nl.cfp.demo.models.Building
import nl.cfp.demo.services.DemoService
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
internal class DemoControllerTest {

    @MockK
    private lateinit var demoService: DemoService

    @InjectMockKs
    private lateinit var demoController: DemoController

    @Test
    fun `test the overview`() {

        every { demoService.getBuildings() } returns listOf(Building("Villa"), Building("2-onder-een-kap"))

        val result = demoController.showBuildingOverview()

        assertThat(result.size, `is`(2))
    }
}