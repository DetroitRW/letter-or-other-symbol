import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите код символа: ")
    val n = reader.nextInt()

    val a = "a".toInt()
    val z = "z".toInt()
    val A = "A".toInt()
    val Z = "Z".toInt()


    if (a <= n <= z || A <= n <= Z) {
    print("Это буква", Char(n))
    }
    else {
    print("Это не буква, а символ", Char(n))
    }
}

