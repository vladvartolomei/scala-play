println("Play with worksheets")
println("Even more")
val a = 42
print(a)
val b = false
print(b)

val c = 'c'
print(c)

val d = "cabprin"
print(d)

val e = s"The meaning is $d"
print(e)

// if-expression that evaluates to String
val ifExpr1 = if (a > 45) d else e
print(ifExpr1)

// if-expression that evaluates to Any
val ifExpr2 = if (a > 45) d else b
print(ifExpr2)

//code blocks
val codeBlock = {
  val localVal = 555

  localVal + 3
}

//define functions
def mySimpleExprFunc(x :Int, y :String):String = y + " " + x

def factorial(x :Int):Int = {
  if (x <= 1) 1
  else x * factorial(x-1)
}

// 5! = 120
factorial(5)

// don't iterate - recurse ( fold? )

//the Unit ret type
// -> could be considered a side effect

def myUnitFunc() :Unit = {
  println("No return value - just nasty/required side effects")
}

myUnitFunc