package day2

fun main(){
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()
    val a3 = input.readLine().toIntOrNull() ?:throw Throwable("invalid int a3")
    if (a3 in 0..100)throw Throwable("out of range  0..100 r:$a3")
    val a2 = input.readLine().toIntOrNull() ?:throw Throwable("invalid int a2")
    if (a2 in 0..100)throw Throwable("out of range  0..100 r:$a2")
    val a1 = input.readLine().toIntOrNull() ?:throw Throwable("invalid int a1")
    if (a1 in 0..100)throw Throwable("out of range  0..100 r:$a1")
    val b3 = input.readLine().toIntOrNull() ?:throw Throwable("invalid int b3")
    if (b3 in 0..100)throw Throwable("out of range  0..100 r:$b3")
    val b2 = input.readLine().toIntOrNull() ?:throw Throwable("invalid int b2")
    if (b2 in 0..100)throw Throwable("out of range  0..100 r:$b2")
    val b1 = input.readLine().toIntOrNull() ?:throw Throwable("invalid int b1")
    if (b1 in 0..100)throw Throwable("out of range  0..100 r:$b1")

    val scoreA = a1 + (a2 * 2) + (a3 * 3)
    val scoreB = b1 + (b2 * 2) + (b3 * 3)
    val result = when {
        scoreA > scoreB -> "A"
        scoreA < scoreB -> "B"
        else -> "T"
    }
        output.write(result)
    }

//내가 작성 했던 코드
//*
//package s02

//fun main() {

  //  val Applethree = readLine()!!.toInt()*3
    //val Appletwo = readLine()!!.toInt() *2
    //val Appleone = readLine()!!.toInt() *1
    //val Bananathree = readLine()!!.toInt()*3
    //val Bananatwo = readLine()!!.toInt()*2
    //val Bananaone = readLine()!!.toInt()*1
    //val scoreA = ( Applethree + Appletwo +  Appleone)
    //val scoreB = (Bananathree +  Bananatwo +  Bananaone)

    //if (scoreA > scoreB) {
    //    println('A')
    //} else if (scoreB > scoreA) {
    //    println('B')
    //} else {
    //    println('T')
    //}
//}




