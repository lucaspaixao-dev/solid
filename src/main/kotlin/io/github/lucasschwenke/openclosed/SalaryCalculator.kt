package io.github.lucasschwenke.openclosed

import java.math.BigDecimal

interface SalaryCalculator {
    fun calculate(salary: BigDecimal): BigDecimal
}

class FullTimeEmployeeSalary : SalaryCalculator {
    override fun calculate(salary: BigDecimal): BigDecimal = salary.add(BigDecimal(200))
}

class ProjectEmployeeSalary : SalaryCalculator {
    override fun calculate(salary: BigDecimal): BigDecimal = salary.add(BigDecimal(100))
}

class TraineeEmployeeSalary : SalaryCalculator {
    override fun calculate(salary: BigDecimal): BigDecimal = salary.add(BigDecimal(30))
}

fun main() {
   val calculatorTypesMap = mapOf(
       EmployeeType.FULL_TIME to FullTimeEmployeeSalary(),
       EmployeeType.PROJECT to ProjectEmployeeSalary(),
       EmployeeType.TRAINEE to TraineeEmployeeSalary()
   )

    val employee = Employee(
        type = EmployeeType.FULL_TIME,
        salary = BigDecimal(400)
    )

    val newSalary = calculatorTypesMap[employee.type]?.run { this.calculate(employee.salary) }
        ?: print("The employee does not have a new salary calculation.")

    print("The new employee's salary is $newSalary")
}