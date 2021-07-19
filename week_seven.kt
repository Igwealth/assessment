//**2. Given a random non-negative number, you have to return the
digits of this number within an array in reverse order. Example:
348597 => [7,9,5,8,4,3]
258 => [8,5,2] */

import java.util.Arrays

fun main(args: Array<String>) {
    var exampleArray: IntArray = intArrayOf(3,4,8,5,9,7)
    var reversedArray = exampleArray.reversedArray()

    println(Arrays.toString(reversedArray))
}
