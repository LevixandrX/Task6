fun main() {
    println("Эта программа принимает две различные цифры от 0 до 9 и пытается создать из них нечетное число.")
    println("Нечетное число создается, если одна из введенных цифр нечетная и стоит на последнем месте.")
    println("Если обе цифры четные, создание нечетного числа невозможно.")

    while (true) {
        println("Введите первую цифру:")
        val digit1 = readlnOrNull()?.toIntOrNull()

        println("Введите вторую цифру:")
        val digit2 = readlnOrNull()?.toIntOrNull()

        if (digit1 == null || digit2 == null || digit1 !in 0..9 || digit2 !in 0..9) {
            println("Ошибка: Введите корректные цифры от 0 до 9.")
            continue
        }

        if (digit1 == digit2) {
            println("Ошибка: Введите две разные цифры.")
            continue
        }

        if (digit1 % 2 != 0) {
            println("Создано нечетное число: ${digit2}$digit1")
        } else if (digit2 % 2 != 0) {
            println("Создано нечетное число: ${digit1}$digit2")
        } else {
            println("Создать нечетное число невозможно")
        }

        break
    }
}