// courtesy of Rock the JVM
// OO
class Person(name :String){
  def apply(age :Int) = println(s"I have aged $age years")
}

val bob = new Person("Bob")
bob.apply(43)
bob(43)

/*
Scala runs on JVM
Functional programming:
- compose functions
- pass functions as args
- return functions as results

 FunctionX
 */

val simpleIncr = new Function1[Int, Int] {
  override def apply(arg :Int): Int = arg + 1
}

simpleIncr.apply(21)
simpleIncr(13)

// all scala functions are instances of these function_x types

val concater = new Function2[String, String, String]{
  override def apply(v1: String, v2: String): String = v1 + v2
}

concater("I love", "Scala")

// syntax sugars
val doubler1 = new Function1[Int, Int]{
  override def apply(arg: Int): Int = 2 * arg
}

doubler1(12)

val doubler2: Function1[Int, Int] = (x :Int) => 2 * x
doubler2(12)

val doubler3: Int => Int = (y :Int) => 2 * y
doubler3(12)

val doubler4 = (z :Int) => 2 * z
doubler4(12)

// higher-order functions: take functions as args/return functions as results
val aMappedList = List(1, 2, 3).map(x => x + 1) // map -> HOF
println(aMappedList)

val aFlatMappedList = List(1,2,3).flatMap(x => List(x, 2 * x))
println(aFlatMappedList)

val aFlatMappedList2 = List(1, 2, 3).flatMap { x=>
  List(x, 3 * x)
}
println(aFlatMappedList2)

val aFilteredList1 = List(1, 2, 3, 4, 5).filter( x => x <= 3)
println(aFilteredList1)

val aFilteredList2 = List(1, 2, 3, 4, 5).filter( _ <= 3)
println(aFilteredList2)

val allPairs = List(1, 2, 3)
  .flatMap(number => List('a', 'b', 'c').map(letter => s"$number-$letter"))
println(allPairs)

// for comprehensions
val alternativePairs = for {
  number <- List(1, 2, 3)
  letter <- List('a', 'b', 'c')
} yield s"$number-$letter"
println(alternativePairs)

// equivalent to the map/flatmap