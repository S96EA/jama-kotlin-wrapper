import Jama.Matrix
import java.util.*


operator fun Matrix.get(i: Int): DoubleArray = this.array[i]

operator fun Matrix.get(rowRange: IntRange, columnRange: IntRange): Matrix = getMatrix(rowRange.first, rowRange.last
        , columnRange.first, columnRange.last)

operator fun Matrix.get(rowRange: IntRange, j0: Int, j1: Int): Matrix = getMatrix(rowRange.first, rowRange.last,
        j0, j1)

operator fun Matrix.get(i0: Int, i1: Int, columnRange: IntRange): Matrix = getMatrix(i0, i1, columnRange.first, columnRange.last)

operator fun Matrix.get(rowArr: IntArray, columnArr: IntArray): Matrix = getMatrix(rowArr, columnArr)

operator fun Matrix.get(i0: Int, i1: Int, columnArr: IntArray): Matrix = getMatrix(i0, i1, columnArr)

operator fun Matrix.get(rowArr: IntArray, j0: Int, j1: Int): Matrix = getMatrix(rowArr, j0, j1)

fun Matrix.getMatrix(rowRange: IntRange, columnRange: IntRange): Matrix = this[rowRange, columnRange]

fun Matrix.getMatrix(rowRange: IntRange, j0: Int, j1: Int) = this[rowRange, j0, j1]

fun Matrix.getMatrix(i0: Int, i1: Int, columnRange: IntRange) = this[i0, i1, columnRange]

operator fun Matrix.set(rowRange: IntRange, columnRange: IntRange, matrix: Matrix) {
    setMatrix(rowRange.first, rowRange.last, columnRange.first, columnRange.last, matrix)
}

operator fun Matrix.set(rowRange: IntRange, j0: Int, j1: Int, matrix: Matrix) {
    setMatrix(rowRange.first, rowRange.last, j0, j1, matrix)
}

operator fun Matrix.set(i0: Int, i1: Int, columnRange: IntRange, matrix: Matrix) {
    setMatrix(i0, i1, columnRange.first, columnRange.last, matrix)
}

operator fun Matrix.set(rowArr: IntArray, columnArr: IntArray, matrix: Matrix) {
    setMatrix(rowArr, columnArr, matrix)
}

operator fun Matrix.set(rowArr: IntArray, j0: Int, j1: Int, matrix: Matrix) {
    setMatrix(rowArr, j0, j1, matrix)
}

operator fun Matrix.set(i0: Int, i1: Int, columnArr: IntArray, matrix: Matrix) {
    setMatrix(i0, i1, columnArr, matrix)
}

fun Matrix.setMatrix(rowRange: IntRange, columnRange: IntRange, matrix: Matrix) {
    this[rowRange, columnRange] = matrix
}

fun Matrix.setMatrix(rowRange: IntRange, j0: Int, j1: Int, matrix: Matrix) {
    this[rowRange, j0, j1] = matrix
}

fun Matrix.setMatrix(i0: Int, i1: Int, columnRange: IntRange, matrix: Matrix) {
    this[i0, i1, columnRange] = matrix
}

operator fun Matrix.unaryPlus() = this

operator fun Matrix.unaryMinus() = this.uminus()

fun Matrix.print() {
    for (i in 0 until this.rowDimension) {
        println(Arrays.toString(this[i]))
    }
}


fun main(args: Array<String>) {
    var matrix = Matrix.random(5, 5)
    matrix.print()
    println("============")
}