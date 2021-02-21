fun main() {

    println("Enter your full name: ")
    val fullName= readLine()!!

    println("Enter Your age: ")
    var age= readLine()!!.toInt()

    println("Enter your phone number: ")
    var number=readLine()!!

    println("Enter your weight in KGS: ")
    var weight:Float =readLine()!!.toFloat()

    println("Which nationality are you? ")
    var citizenship = readLine()!!


    if (citizenship=="Kenyan") {
        println("You are a kenyan, noted")
    }

    if (citizenship!="Kenyan") {
        println("You are not a Kenyan,noted")
    }


    println("Your name is $fullName")
    println("you are $age  years old.")
    println("Your Phone number: $number")
    println("You weigh $weight kgs")
    println("Your nationality is: $number ")

}