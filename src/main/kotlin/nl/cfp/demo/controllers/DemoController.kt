package nl.cfp.demo.controllers

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import nl.cfp.demo.models.Building
import nl.cfp.demo.models.CommonResult
import nl.cfp.demo.services.DemoService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(val demoService: DemoService) {

    @GetMapping("/overview")
    @Operation(summary = "Get the overview for ING buildings.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Successful"),
            ApiResponse(responseCode = "500", description = "A technical error occurred.", content = [Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = Schema(implementation = CommonResult::class))])
        ]
    )
    fun showBuildingOverview() : List<Building> {

        return demoService.getBuildings()

    }

}