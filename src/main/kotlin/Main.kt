import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Введите код символа: ")
    val n = Char(reader.nextInt())

    if ((n in 'a'..'z') or (n in 'A'..'Z')) {
        print("Это буква: $n")
    } else {
        print("Это не буква, а символ: $n")
    }
//    val reader = Scanner(System.`in`)
//
//    print("Введите код символа: ")
//    val n = reader.nextInt()
//
//    val a = 'a'.code
//    val z = 'z'.code
//    val A = 'A'.code
//    val Z = 'Z'.code
//
//    if ((n in a..z) or (n in A..Z)) {
//        print("Это буква: ${Char(n)}")
//    } else {
//        print("Это не буква, а символ: ${Char(n)}")
//    }
}

