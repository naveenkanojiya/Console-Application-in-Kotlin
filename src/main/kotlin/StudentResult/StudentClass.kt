package StudentResult

fun main() {

    val studentList = arrayListOf<Marks>()

    for (item in 1..3) {
        println("Enter Your Name")
        val a = readln()
        println("Enter Marks of S1")
        val b = readln()
        val ss1 = b.toInt()

        println("Enter Marks of S2")
        val c = readln()
        val ss2 = c.toInt()

        println("Enter Marks of S3")
        val d = readln()
        val ss3 = c.toInt()

        println("Enter Marks of S4")
        val e = readln()
        val ss4 = c.toInt()

        println("Enter Marks of S5")
        val f = readln()
        val ss5 = c.toInt()

        val total = ss1 + ss2 + ss3 + ss4 + ss5
        val pr = total / 5


        studentList.add(
            Marks(
                name = a,
                s1 = ss1,
                s2 = ss2,
                s3 = ss3,
                s4 = ss4,
                s5 = ss5,
                total = total,
                pr = pr.toDouble()
            )
        )
    }
    println("-------------------------------------------------------\n")
    for (data in studentList){
    print("${data.name}:${data.s1}${data.s2}" +
            " ${data.s3} ${data.s4} ${data.s5} " +
            "Total :${data.total}" +
            " PR : ${data.pr}")
    println()
    }
}