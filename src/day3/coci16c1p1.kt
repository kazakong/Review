package day3

import kotlin.coroutines.coroutineContext

fun main(){
    val input = System.in.bufferedReader()
    val out = System.out.bufferedWriter()
    val X = input.readLine().toIntOrNull()?: throw Throwable("Invalid int X")
    if(X !in 1..100) throw Throwable("out of range 1..100 X :$X")
    val N = input.readLine().toIntOrNull()?: throw Throwable("Invalid int N")
    if (N !in 1..100) throw Throwable("out of range 1..100 N:$N")

    var availbleData = X
    var i = 1
    while (i in 1..N){
        val p = input.readLine().toIntOrNull()?: throw Throwable("Invalid int p")
        if (p !in 1..100) throw Throwable("out of range 1..100 p:$p")
        availbleData -= p
        if(availbleData < 0)  throw Throwable("availbleData < 0 :$availbleData")
        availbleData += X
        i++
    }
}output.write($availbleData)

//처음 작성했던 코드
//
//fun main () {
//
//    val x = readLine()!!.toInt()
//    val n = readLine()!!.toInt()
//
//    for (i in 0 until x || i in 0 < until n) {
//        var used = 0
//        repeat(n) {
//            used += readLine()!!.toInt()
//        }
//        val result = x * (n + 1) - used
//        println(result)
//
//
//    }
//}