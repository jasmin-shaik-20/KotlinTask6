

//public
class X {
    var int = 10
}

public class B {
    var int2 = 20
    fun display() {
        println("Accessible everywhere")
    }
}

//private
private class A {
    private val int = 10
    fun display()
    {
        println(int)
        println("Accessing int successful")
    }
}


//protected
open class Person{
    protected var num=10

}
class Person1:Person()
{
    fun display()
    {
        println(num)
    }

}


//internal
internal class student{
    internal var number=10
    internal fun show()
    {
        println(number)
    }
}



fun main(args: Array<String>){
    var a = A()
    a.display()
    var b=X()
    println(b.int)
    var c=B()
    c.display()
    var d=Person1()
    d.display()
    var e=student()
    println(e.number)
    e.show()



}