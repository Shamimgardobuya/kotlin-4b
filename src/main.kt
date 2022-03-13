fun main(){
    numbers(arrayOf(3, 45, 65, 23, 31))

    somebody(arrayOf("John",35,"Maggie",4.0F,2.1,"Josh",2.0F,"Sabrina"))
   mercy('a','e','i','o','u')
  //  var charArray = arrayOf('a','e','i','o','u')
  //  println(charArray.toString())

}





fun numbers(itemsArray:Array<Int>):Int{
    var prod = 3
    itemsArray.forEach { mine ->
        prod *= mine
   println(prod)
    }

    return prod


}
fun somebody(melInt:Array<Any>):Float{
    var sum = 0.0F
    melInt.forEach { kili->
        if(kili is Float){
            sum+=kili
            println(sum)
        }

    }
     return sum
}
fun mercy(palt1:Char,palt2:Char,palt3:Char,palt4:Char,palt5:Char):String{

    var charArray = arrayOf(palt1,palt2,palt3,palt4,palt5)
    println(charArray.contentToString())
    return charArray.contentToString()

}