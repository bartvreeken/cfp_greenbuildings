package nl.cfp.demo.services

import nl.cfp.demo.models.Building
import org.springframework.stereotype.Service

@Service
class DemoService {

    fun getBuildings() : List<Building> {

        return listOf(Building("Het Zandkasteel"), Building("De Schoen"), Building("De entree"), Building("Acanthus"))

    }
}