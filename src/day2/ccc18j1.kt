package day2

fun main(){
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()
    val n1 = input.readLine()
    if(n1.length !=1 || in "0123456789")throw Throwable ("invalid int n1 :$n1")
    val n2 = input.readLine()
    if(n2.length !=1 || in "0123456789")throw Throwable ("invalid int n2 :$n2")
    val n3 = input.readLine()
    if(n3.length !=1 || in "0123456789")throw Throwable ("invalid int n3 :$n3")
    val n4 = input.readLine()
    if(n4.length !=1 || in "0123456789")throw Throwable ("invalid int n4 :$n4")

    val result = if (n1 in "89" && n4 in "89" && n2==n3) "ignore" else "answer"

}
}
}
}