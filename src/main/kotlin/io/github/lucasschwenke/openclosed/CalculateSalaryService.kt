package io.github.lucasschwenke.openclosed

import java.math.BigDecimal

fun main() {
    val employee = Employee(type = EmployeeType.FULL_TIME, salary = BigDecimal(400))
    CalculateSalaryService.calculate(employee)
}

object CalculateSalaryService {

    fun calculate(employee: Employee) {
        when(employee.type) {
            EmployeeType.FULL_TIME -> print(
                "The new salary is ${employee.salary.add(BigDecimal(200))}"
            )
            EmployeeType.PROJECT -> print(
                "The new salary is ${employee.salary.add(BigDecimal(100))}"
            )
            EmployeeType.TRAINEE -> print(
                "The new salary is ${employee.salary.add(BigDecimal(30))}"
            )
        }
    }
}

data class Employee(
    val type: EmployeeType,
    val salary: BigDecimal = BigDecimal.ZERO
)

enum class EmployeeType {
    FULL_TIME,
    PROJECT,
    TRAINEE
}
