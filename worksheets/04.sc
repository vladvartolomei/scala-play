// courtesy of Rock the JVM

/**
 * Collections
*/

// lists
val aList = List(1, 2, 3, 4, 5)
println(aList.head)
println(aList.tail)

val aPrepended = 0 :: aList
println(aPrepended)

val extendedList = 0 +: aList :+ 6
println(extendedList)

// sequences
val aSeq: Seq[Int] = Seq(1, 2, 3, 4, 5)
println(aSeq)
println( aSeq.apply(2))
println( aSeq(2))

// vectors - fast Seq impl
val vect = Vector(1, 2, 4, 5)

// sets = no dupes
val aSet = Set(1, 2, 3, 4, 5)
val setHas6 = aSet.contains(6)
println(setHas6)

val anAddeSet = aSet + 6
println( anAddeSet.contains(6))

val aRemSet = aSet - 3
println(aRemSet)

// ranges
val aRange = 1 to 1000
val twoByTwo = aRange.map(_ * 2).toList

// tuples
val aTupl = (1, 2, 3, 4, "and smth")
println( aTupl._5 )

// maps
val aMap: Map[String, Int] = Map(
  ("key1", 12),
  "key2" -> 31
)

val weirdOnes = "zzz" -> 3
println(weirdOnes)

val weirdOnesZ = "zzz" -> 3 -> "aaaa" -> 14 -> weirdOnes -> 1
println(weirdOnesZ)
