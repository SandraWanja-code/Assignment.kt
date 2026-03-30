// Name: Sandra Wanja

 fun main() {

//   =========================
//   SECTION 1: VARIABLES & DATA TYPES
//   =========================

     // Task 1.1
     var studentName = "Alex Morgan"   
     val studentId = 2024001           
     var GPA = 3.75                   
     val isEnrolled = true             
     val middleInitial = 'J'  

    // Task 1.2
    val studentInfo = "Student: $studentName $middleInitial. (ID: $studentId) has GPA $GPA and is enrolled: $isEnrolled"
   println(studentInfo)



    // Task 1.3
    var phoneNumber: String? = null   // nullable variable
    println("Phone Number: ${phoneNumber ?: "No phone number provided"}")

    
     fun main() {
        println(studentInfo)
         println(phoneNumber)
     }
 }

 // =========================
    // SECTION 2: FUNCTIONS
    // =========================
 fun displayMenu() {
     println("=== MENU ===")
     println("1. View Profile")
     println("2. Edit Settings")
     println("3. Logout")
     println("============")
 }
 fun main() {
     displayMenu()
 }

   // task 2.2
 Function to calculate discounted price
   fun calculateDiscount(price: Double, discountPercent: Double): Double {
     return price - (price * discountPercent / 100)
   }
 fun main() {
     val finalPrice = calculateDiscount(1000.0, 20.0)
     println("Discounted Price: $finalPrice")
 }
//   task 2.3
 Function to determine grade based on score
 fun getGrade(score: Int): String {
     return when (score) {
         in 80..100 -> "A"
         in 65..79 -> "B"
         in 50..64 -> "C"
         in 35..49 -> "D"
         else -> "F"
     }
 }
 fun main() {
     println(getGrade(85)) // A
     println(getGrade(70)) // B
     println(getGrade(55)) // C
     println(getGrade(40)) // D
     println(getGrade(20)) // F
 }
//   task 2.4
 Function to check if a number is even
 fun isEven(number: Int): Boolean = number % 2 == 0
 fun main() {
     println(isEven(4)) // true
     println(isEven(7)) // false
 }


 // =========================
    // SECTION 3: Conditional Statement
    // =========================
 Function to check the weather based on temperature
 fun checkWeather(temperature: Int) {
     if (temperature > 30) {
         println("Hot day")
     } else if (temperature in 20..30) {
         println("Perfect weather")
     } else {
         println("Cool day")
     }
 }

 fun main() {
   
     checkWeather(35) 
     checkWeather(25) 
     checkWeather(15) 
 }
// 
// task 3.2
 fun main() {
     val dayOfWeek = "Monday"

     when (dayOfWeek) {
         "Saturday", "Sunday" -> println("Weekend! Time to relax")
         "Monday" -> println("Back to work")
         "Friday" -> println("TGIF!")
         else -> println("Regular weekday")
     }
 }

// task 3.3
 fun main() {
     val trafficLight = "YELLOW"

     val trafficAction = when (trafficLight) {
         "RED" -> "STOP"
         "YELLOW" -> "CAUTION"
         "GREEN" -> "GO"
         else -> "INVALID"
     }

     println(trafficAction)
 }

 // =========================
    // SECTION 4: loops
    // =========================
 fun main() {
     var number = 1
     while (number <=10){
         println(number)
        number++
     }
    
    
 }

// // tsk 4.2
 fun main() {
     var count = 5

     do {
         println("Countdown: $count")
count--
/    } while (count >= 1)

     println("Blast off!")
 }

// task 4.3
 fun main() {
     val shoppingList = listOf("Milk", "Eggs", "Bread", "Butter", "Coffee")

     for ((index, item) in shoppingList.withIndex()) {
         println("[${index + 1}] $item")
     }
 }

// task 4.4
// fun main() {
     // All numbers from 1 to 20 (inclusive)
    println("Numbers 1 to 20 (inclusive):")
     for (num in 1..20) {
         print("$num ")
//     }
//     println("\n")

//     // All numbers from 1 to 20 (excluding 20)
     println("Numbers 1 to 20 (excluding 20):")
     for (num in 1 until 20) {
         print("$num ")
     }
   println("\n")

//     // All even numbers from 2 to 20
     println("Even numbers from 2 to 20:")
     for (num in 2..20 step 2) {
         print("$num ")
     }
     println("\n")

//     // All letters from 'A' to 'Z' (uppercase)
     println("Letters from A to Z:")
     for (letter in 'A'..'Z') {
         print("$letter ")
     }
     println()
 }

 // =========================
    // SECTION 5: 
    // =========================
 an expression is a piece of code that produces a value and one can assign it to a variable
      eg:val sum = 5 + 10  // 5 + 10 is an expression that produces the value 15
     
 A statement is a piece of code that performs an action but does not produce a value. It is executed for printing 
      eg:println("Hello, Kotlin!")  // println() is a statement; it performs an action but does not produce a value

// task 5.2
 fun main() {
     val age = 20

     val status = if (age >= 18) "Adult" else "Minor"

     println(status)
 }

// task 5.3
fun main() {
     val a = 70
     val b = 19

//     // Using if-else as an expression to find the larger number
     val maxNumber = if (a > b) a else b

     println("The larger number is $maxNumber")
 }

// =========================
    // SECTION 6
    // =========================
fun main() {
    // Student data
    val students = listOf(
        "Alice" to 85,
        "Bob" to 42,
        "Charlie" to 67,
        "Diana" to 91,
        "Ethan" to 38
    )

    // 1. Display all students
    displayAllStudents(students)
    
    // 2. Show average score
    val average = getAverageScore(students)
    println("Average Score: $average")
    
    // 3. Show top student
    val topStudent = findTopStudent(students)
    println("Top Student: $topStudent")
    
    // 4. Show classified list
    classifyStudents(students)

    // Bonus: Simple Calculator
    println("\n--- Simple Calculator ---")
    print("Enter first number: ")
    val num1 = readln().toDoubleOrNull() ?: 0.0
    print("Enter second number: ")
    val num2 = readln().toDoubleOrNull() ?: 0.0
    print("Enter operation (+, -, *, /): ")
    val op = readln()
    val result = calculator(num1, num2, op)
    println("Result: $result")
}

// Function to display all students and their scores
fun displayAllStudents(students: List<Pair<String, Int>>) {
    println("\nAll Students:")
    for ((name, score) in students) {
        println("$name -> $score")
    }
}

// Function to calculate average score
fun getAverageScore(students: List<Pair<String, Int>>): Double {
    val total = students.sumOf { it.second }
    return total.toDouble() / students.size
}

// Function to find the top student
fun findTopStudent(students: List<Pair<String, Int>>): String {
    return students.maxByOrNull { it.second }?.first ?: "No students"
}

// Function to classify students using getGrade()
fun classifyStudents(students: List<Pair<String, Int>>) {
    println("\nStudent Grades:")
    for ((name, score) in students) {
        println("Name: $name, Score: $score, Grade: ${getGrade(score)}")
    }
}

// Reusing getGrade function
fun getGrade(score: Int): String = when (score) {
    in 80..100 -> "A"
    in 65..79 -> "B"
    in 50..64 -> "C"
    in 35..49 -> "D"
    else -> "F"
}

// Bonus: Simple Calculator
fun calculator(num1: Double, num2: Double, op: String): String {
    return when (op) {
        "+" -> (num1 + num2).toString()
        "-" -> (num1 - num2).toString()
        "*" -> (num1 * num2).toString()
        "/" -> if (num2 != 0.0) (num1 / num2).toString() else "Error: Division by zero"
        else -> "Invalid operation"
    }
}