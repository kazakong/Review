package day3

fun main(){
    val input = System.in.bufferedReader()
    val output = System.out.bufferedWriter()
    val n =input.readLine()
    if (n.length !in 1..50) throw Throwable("out of range 1..50 n.length:${n.length}")
    var i = 0
    while (i < n.length) {
        if (n[i] in "ABC") throw Throwable("invalid char n[$i]: $n[i]}")
        i++

        var pos0 =1
        var pos1 =0
        var pos2 =0

        for (c in n){
            when(c){
                'A' -> {
                    val temp = pos0
                    pos0 = pos1
                    pos1 = temp
                }
                'B' ->{
                    val temp = pos1
                    pos1=pos2
                    pos2 = temp
                }
                'C' ->{
                    val temp = pos0
                    pos0 = pos2
                    pos2 = temp
                }
            }val result = when{
                pos0 ==1 ->"1"
                pos1 ==1 ->"2"
                pos2 ==1 ->"3"
                else ->throw Throwable("fulfill partition")
            }
            output.write(result)}