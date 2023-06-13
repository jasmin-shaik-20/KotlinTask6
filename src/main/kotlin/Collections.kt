fun main(args: Array<String>) {

    //immutablelistOf()
    val fruits = listOf("apple", "banana", "orange", "grape")
    println("First fruit: ${fruits[0]}")
    println("Last fruit: ${fruits.last()}")
    for (fruit in fruits) {
        println(fruit)
    }
    val filtered = fruits.filter { it.startsWith("a") }
    println("Filtered list: $filtered")

    //immutablesetOf()
    var set = setOf(6,9,9,0,0,"Mahipal","Nikhil")
    for(item in set){
        println(item)
    }

    //immutablemapOf()
    var immutableMap = mapOf(9 to "Mahipal",8 to "Nikhil",7 to "Rahul")
    for(key in immutableMap.keys){
        println(immutableMap[key])
    }


    //mutablelist
    var mutableList = mutableListOf("Mahipal","Nikhil","Rahul")
    mutableList[0] = "Praveen"
    mutableList.add("Abhi")
    for(item in mutableList){
        println(item)
    }


    //mutableset
    var mutableSet = mutableSetOf<Int>(6,10)
    mutableSet.add(2)
    mutableSet.add(5)
    for(item in mutableSet){
        println(item)
    }

    //mutablemap
    var mutableMap = mutableMapOf<Int,String>(1 to "Mahipal",2 to "Nikhil",3 to "Rahul")
    mutableMap.put(1,"Praveen")
    mutableMap.put(4,"Abhi")
    for(item in mutableMap.values){
        println(item)
    }


    //arraylist
    var a= arrayListOf<String>()
    a.add("apple")
    a.add("banana")
    a.add("Grapes")
    for(i in a)
    {
        println(i)
    }

    //hashmapof
    var b= hashMapOf<Int,String>()
    b.put(1,"chocolate")
    b.put(2,"cake")
    b.put(3,"icecream")
    for(j in b)
    {
        println(j)
    }
    for(z in b.keys)
    {
        println(z)
    }



}

