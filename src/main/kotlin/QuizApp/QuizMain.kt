package QuizApp

fun main(args: Array<String>) {

    val listofQuiz =  arrayListOf<Questions>()
    println("Welcome to Quiz App Using Android ")
    var index = 0
    var rightAns =0
    var wrongAns= 0


    listofQuiz.add(
        Questions(
        "What is the capital of France?",
        "London",
        "Pais",
        "Barlin",
        "Marid",
        "London")
    )

    listofQuiz.add(
        Questions(
        "What is the purpose of an Intent in Android?",
        "To display UI",
        "To perform background tasks",
        "To pass data between components",
        "To store data",
        "To perform background tasks")
    )

    listofQuiz.add(
        Questions(
        "Which programming language is used for Android app development?",
        "Java",
        "Kotlin",
        "C++",
        "Python",
        "Kotlin")
    )

    println("Press 1 to start Game")
    println("Press 2 to Exit Game")
    val a =  readln()
    val choose = a.toInt()


    when (choose){
        1->{
           //Quiz

            for (items in listofQuiz){
                println("Question : ${items.Question}")
                println("optionA : ${items.optionA}")
                println("optionB : ${items.optionB}")
                println("optionC : ${items.optionC}")
                println("optionD : ${items.optionD}")
                println("---------------------------------------------")
                println("ENter Your Ans")
                val ans = readln()
                if (ans.equals(items.Ans)){
                    rightAns++
                    println("Ans is Right!!!")
                }else{
                    wrongAns++
                    println("Sorry Your Ans Is Wrong")
                }
            }
            println("Congratulation your Game is Over")
            println("Right Ans is :$rightAns")
            println("Wrong Ans is :$wrongAns")
        }
        2 ->{
            //Exit

        }
        else ->{

        }
    }






}