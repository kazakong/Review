package day2

fun main(){
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()
    val n1 = input.readLine()
    if(n1.length != 1 || in "0123456789")throw Throwable ("invalid int n1 :$n1")
    val n2 = input.readLine()
    if(n2.length != 1 || in "0123456789")throw Throwable ("invalid int n2 :$n2")
    val n3 = input.readLine()
    if(n3.length != 1 || in "0123456789")throw Throwable ("invalid int n3 :$n3")
    val n4 = input.readLine()
    if(n4.length != 1 || in "0123456789")throw Throwable ("invalid int n4 :$n4")

    val result = if (n1 in "89" && n4 in "89" && n2 == n3) "ignore" else "answer"
    output.write(result)}


// 내가 작성 했던 코드
//*fun main() {
//    val telenumber = readLine()!!
//
//
//    if (telenumber.length == 4 && telenumber.all { it.isDigit() }) {
//        val firstDigit = telenumber[0]
//        val secondDigit = telenumber[1]
//        val thirdDigit = telenumber[2]
//        val lastDigit = telenumber[3]
//
//
//        if ((firstDigit == '8' || firstDigit == '9') && secondDigit == thirdDigit && (lastDigit == '8' || lastDigit == '9')) {
//            println(telenumber)
//        } else {
//            println("ignore")
//        }
//    } else {
//        println("answer")
//    }
