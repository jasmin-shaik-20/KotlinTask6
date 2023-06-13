//try-catch blocks


fun test(a: Int, b: Int) :Any {
    return try {
        a/b
    }
    catch(e:Exception){
        "Divide by zero not allowed"
    }


}

//finally block
fun show (a: Int, b: Int) {
    try {
        val data = a/b
        println(data)
    } catch (e: NullPointerException) {
        println(e)
    } finally {
        println("finally block always executes")
    }
}

//multiple catch blocks
fun display() {
    try {
        val a = IntArray(5)
        a[6] = 7
    } catch (e: ArithmeticException) {
        println("arithmetic exception catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outofbounds exception")
    } catch (e: Exception) {
        println("parent exception class")
    }
}


    //throw Keyword
fun secure(password: String) {
    if (password.length < 6)
        throw ArithmeticException("Password is too short")
    else
        println("Strong password")
}

fun main(args: Array<String>):Unit {

    var result1 = test(10,2  )
    println(result1)
    var result = test(10,0 )
    println(result)
    secure("abcdefg")
    show(10,5)
    display()

}