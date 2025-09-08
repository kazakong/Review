package day4

import kotlin.math.abs

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val N = input.readLine().toIntOrNull() ?: throw Throwable("Invalid int N")
    if (N !in 3..100) throw Throwable("out of range 3..100 N :$N")
    val list = mutableListOf<Int>()
    var i = 1
    while (i in 1..N) {
        val V = input.readLine().toIntOrNull() ?: throw Throwable("Invalid int V")
        if (V !in -1000_000_000..1000_000_000) throw Throwable("out of range -1m..1m V:$V")
        list.add(V)
        i++
    }
    list.sort()
    val size = mutableListOf<Double>()
    for (i in 1..<list.lastIndex){
        size.add(abs (list[i + 1] - list[i - 1]).toDouble() / 2.0)

        size.sort()
        println("%.lf".format(size[0]))