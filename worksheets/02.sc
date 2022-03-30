class Entity

val dumbEntity = new Entity

println(dumbEntity)

class NamedEntity(val name:String) extends Entity

val namedOne = new NamedEntity("theGenericEntity")
println(namedOne)
println(namedOne.name)

class NoNameEntity(name:String) extends Entity
val nonameOne = new NoNameEntity("noName")
println(nonameOne)

val nonameTwo = new NoNameEntity("noName")

println( nonameOne == nonameTwo)

println( nonameOne.equals(nonameTwo))

val namedEntity1 = new NamedEntity("nomini1")
val namedEntity2 = new NamedEntity("nomini1")

println( namedEntity1 == namedEntity2)
println( namedEntity1.equals(namedEntity2))

//abstract class AbstractEntity {
//  def equals(secondEntity :AbstractEntity) :Boolean
//}

//class ExtendedEntity(val name:String) extends AbstractEntity{
//  def equals(secondEntity:ExtendedEntity): Boolean = {
//    name.equals(secondEntity.name)
//  }
//}

class Animal{
  val age:Int = 0
  def eat(): Unit = println("I'm eating")
}

class Dog(val name:String) extends Animal

val myDog = new Dog("Burbon")

trait Carnivore{
  def eat(animal :Animal):Unit
}

trait Philosopher{
  def ?!(thought :String):Unit
}

// single-class inheritance, multi-trait "mixing"
class Crocodile extends Animal with Carnivore with Philosopher {
  override def eat(animal: Animal): Unit = {
    println("Eating " + animal.getClass)
  }

  override def eat(): Unit = super.eat()

  override def ?!(thought: String): Unit = {
    println(s"Should i be eating now or later? not that $thought")
  }
}

val myCroc = new Crocodile

myCroc.eat(myDog)
myCroc.eat()

myCroc eat myCroc // infix notation, only for methods with 1 arg
myCroc ?! "Is there any life on Mars?"

myCroc.eat()

// operators are methods
val a1 = 1.+(23)
println(a1)

// anonymous classes
val dinosaur = new Carnivore {
  override def eat(animal: Animal): Unit = println("Anonymous carnivore")
}

dinosaur.eat(myCroc)

// singleton object
object MySingleton{
  val value = 3214
  def apply(x :Int) :Int = x+1
}

MySingleton.apply(21)

MySingleton(33)

// case classes - lightweight data structures
/**
 * - sensible equals & hashcode - useful in collections
 * - serialization - simple to encode/decode (because of apply)
 * - pattern matching
 */

// exceptions
try{
  val x:String = null
  x.length
} catch {
  case e: Exception =>
    println("the null string has no length")
} finally {
  //executes no matter what
  println("Finally!")
}

// generics
abstract class MyList[T]{
  def heat: T
  def tail: MyList[T]
}

val aList: List[Int] = List(1,2,3)
val first = aList.head
val rest  = aList.tail

val aStringList: List[String] = List("asd", "bds", "rca")
val firstStr = aStringList.head
val restStr = aStringList.tail

// #1 in Scala you operate with IMMUTABLE values/objects
// any change to an object you return another object
/**
 * Benefits:
 * 1) useful for multithreaded processing
 * 2) helps making sense of the code
  */
val reversedList = aList.reverse // you get a new list

// #2 Scala is closest to OO programming