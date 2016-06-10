//1.3 Work with values, variables and fundamental data types
//Variable type is inferenced(變數的形態參考):
val answer = 8 * 5 + 2
answer
//Can specify type after name(可以在變數名稱後指定型態):
var greeting:String = null //這邊null可以是任何形態
greeting = "bye"
// val 是 immutable 沒辦法指定
//例如:answer = 99 會出現compiler error
// var 是mutable 可以重新指定
var response = 42
response = 43
response
//但是仍然是強形態因為如果指定不同型態會出現錯誤
//例如: response = "hello"
//Everything is an object:
1.to(10)

//Augmented by > 100 methods in StringOps(有超過100種方法可以操作字串):
"Hello".intersect("world")
//Big number are actually usable:
val x:BigInt = 1234567890
x * x * x * x
//可以用空白當作呼叫方法
1.to(10)
1 to 10
//運算子也都是方法
val result = 1.+(10)
//Scala has both functions and methods:
//例子
import scala.math._
sqrt(2) // A function
BigInt.probablePrime(100,scala.util.Random) // a method
//Methods without parameters usually don't use ():
"Hello".distinct
"Hello".length
"Hello"(4) //Yields "o"
"Hello".apply(4) //Same as above
//lab1
//b
val a = 6*7
//c
a
//d a = 43 wrong
//e
// val b; wrong
//f
val b: BigInt = 6 * 7
//g
b.pow(1000)

//lab2
//a
import scala.math._
//b
sqrt(10)
//c
1.to(10)
//d
1.to(10).map(sqrt(_))
//apply to all element sqrt
//e
6.*(7)

//lab3
//b
"Mississippi".distinct
//d
"Rhine".permutations
//e
"Rhine".permutations.toArray
//f
"ABC".sum // Char
('A' + 'B' + 'C').toChar //Char

"A".toInt
"ABC".sum.toInt