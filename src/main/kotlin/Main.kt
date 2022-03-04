fun main() {
    stringWord()
    val statement = person("Yasmin", 55)
    println(statement)
    val sentence = wordLength("I study in Lovelace class")
    println(sentence)
    condition("Sara")
}

fun stringWord(){
    val word = "AkiraChix"
    val characters = word[0].toString() + word[2] + word[3]
    println(characters)
}
fun person(name:String, age:Int):String{
    val statement = "Hi my name is $name and I am $age years old"
    return statement
}

fun wordLength(wrd:String): Int{
    val sentence = wrd.length
    return sentence


}

fun condition(name:String) {
    if (name.equals("Yasmin")){
            println("That's me")
    } else
    println("I don't know who that is")
}