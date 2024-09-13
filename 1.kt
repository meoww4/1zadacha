fun main() {
    println("Введите строку для подсчета количества подряд идущих одинаковых символов:")
    val input = readLine() ?: ""

    if (input.isEmpty()) {
        println("Ошибка: Введена пустая строка.")
        return
    }

    val result = StringBuilder()
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            result.append(input[i - 1])
            if (count > 1) result.append(count)
            count = 1
        }
    }
    result.append(input.last())
    if (count > 1) result.append(count)

    println("Результат: $result")
}
