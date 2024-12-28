```scala
class MyClass(val name: String) {
  private var _value: Int = 0 // Private mutable variable

  def value: Int = _value

  def value_=(newValue: Int): Unit = {
    if (newValue >= 0) {
      _value = newValue
    } else {
      throw new IllegalArgumentException("Value must be non-negative")
    }
  }
}

object Main extends App {
  val myInstance = new MyClass("Example")
  myInstance.value = 10
  println(myInstance.value) // Output: 10

  try {
    myInstance.value = -5 // This will throw an exception
  } catch {
    case e: IllegalArgumentException => println(e.getMessage) // Output: Value must be non-negative
  }
}
```