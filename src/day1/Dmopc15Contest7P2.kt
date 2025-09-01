package day1

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()
    val n = input.readLine()
    var count = 0
    var isWordStart = false

    for (c in n) {
        if (c == ' ') {
            isWordStart = false
        } else if (c != ' ') {
            isWordStart = true
            count++
        }
    }
    output.write("$count")
    output.flush()
}