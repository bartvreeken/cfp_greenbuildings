package nl.cfp.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["nl.cfp.demo"])
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
