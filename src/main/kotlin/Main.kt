fun main() {
    println(strArr(arrayOf("Kimani", "eunice", "ann"), "i"))

    println(intArrs(arrayOf(4, 5, 6, 8, 3, 1), arrayOf(3, 6, 7,8, 2)).contentToString())

}
//Write a Kotlin function that takes in an array of strings and
//returns the  count of all strings that contain a given substring
fun strArr(names: Array<String>, substring:String):Int{
    var count = 0
    for (string in names) {
        if (string.contains(substring)) {
            count++

        }
    }
    return count
}
//Write a kotlin function that takes in two arrays of integers and
//returns a new array that contains only the elements that are present in both arrays.
fun intArrs (int1:Array<Int>, int2:Array<Int>):IntArray{
    var emptyArray = mutableListOf<Int>()
    for (int in int1){
        if (int in int2 && int !in emptyArray){
            emptyArray.add(int)
        }
    }
    return emptyArray.toIntArray()

}