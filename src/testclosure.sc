// 對 doSome 來說，x 是 bound variable
def doSome() = {
  val x = 10
  // 對 f 來說，x 是 free variable，y 是 bound variable
  val f = (y: Int) => x + y
  f
}

//val foo = doSome()
//println(foo(20))    // 顯示 30
//println(foo(30))    // 顯示 40
//
//def doOther() = {
//  var x = 10
//  val f = x + (_ : Int)  // 佔位字元語法
//  x = 100
//  f
//}
//
//val foo = doOther()
//println(foo(20))      // 顯示 120
//println(foo(30))      // 顯示 130

var sum = 0
val arr = Array(1, 2, 3, 4, 5)
arr.foreach(sum += _)
println(sum)               // 顯示 15

def doOther() = {
  var x = 10
  val f = () => { x -= 1; x }
  f
}

val f1 = doOther()
val f2 = doOther()

println(f1())    // 顯示 9
println(f2())    // 顯示？

def doSome(x: Int) = (a: Int) => x + a

val f3 = doSome(100)    // 閉包綁定的是該次呼叫時所建立的x參數
val f4 = doSome(200)    // 閉包綁定的是該次呼叫時所建立的x參數
println(f3(10))    // 顯示 110
println(f4(10))    // 顯示 210

def toOneByRow(array: Array[Array[Int]]) = {
  toOne(array, _ * array(0).length + _)
}

def toOneByColumn(array: Array[Array[Int]]) = {
  toOne(array, _ + _ * array.length)
}

def toOne(array: Array[Array[Int]], index: (Int, Int) => Int) = {
  val arr = new Array[Int](array.length * array(0).length)
  for(row <- 0 until array.length; column <- 0 until array(0).length) {
    arr(index(row, column)) = array(row)(column)
  }
  arr
}