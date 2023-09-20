package SalarySheet

fun main() {
    println("Enter Your Salary?")
    val a=  readln()
    val salary =a.toInt()
    //Salary = 25000

    val DA = salary *0.10
    val MA = 300
    val HRA = salary*0.075
    val PF = salary*0.125

    val grossSalary = salary +DA +HRA+MA

    val netSalary = grossSalary-PF

    println("Salary: $salary")
    println("MA :$MA")
    println("DA :$DA")
    println("HRA :$HRA")
    println("PF :$PF")
    println("Net Salary :$netSalary")
    println("Gross Salary :$grossSalary")

}