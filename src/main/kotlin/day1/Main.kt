import java.io.File

fun main() {
    val exempleInput = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
    println(calculateParte1(exempleInput))

    val input = readInput("day1.txt").map(String::toInt)
    newExercise()
    println(calculateParte1(input))

    newExercise()

    println(calculateParte2(input))
}

fun calculateParte1(input: List<Int>) : Int {
    var count = 0
    var prev = input.first()
    input.drop(1).forEach { current ->
        if(current > prev){
            ++count
        }
        prev = current
    }
    return count
}

fun calculateParte2(input: List<Int>): Int {
    val sums = input.windowed(3).map { it.sum() }
    return calculateParte1(sums)
}

fun readInput(file: String): List<String> {
    return File(Thread.currentThread().contextClassLoader.getResource(file).file)
        .readLines()
}

fun newExercise() {
    println()
    println("--------------> New exercise <--------------")
}




