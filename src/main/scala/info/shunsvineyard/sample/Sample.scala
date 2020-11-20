package info.shunsvineyard.sample

object Sample extends Greeting with App {
  println(greeting)
}

trait Greeting { lazy val greeting: String = "hello" }
