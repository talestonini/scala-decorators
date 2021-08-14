package decorator

import com.acme._
import scala2._
import scala3._

object Main extends App {

  def traditionalDecoration() = {
    val tps = new ThirdPartyStuff()
    tps.doSth()

    val decorator = new TraditionalDecorator(tps)
    decorator.doSthSpecial()

    println(s"side-effect: otherProp=${tps.otherProp}")
  }

  def scala2Decoration() = {
    import Scala2Decorator.converter

    val tps = new ThirdPartyStuff()
    tps.doSth()
    tps.doSthSpecial()

    println(s"side-effect: otherProp=${tps.otherProp}")
  }

  def scala3Decoration() = {
    val tps = new ThirdPartyStuff()

    tps.doSth()
    tps.doSthMoreSpecial()

    println(s"side-effect: otherProp=${tps.otherProp}")
  }

  println("Traditional Decoration")
  println("----------------------")
  traditionalDecoration()
  println()

  println("Scala 2 Decoration")
  println("------------------")
  scala2Decoration()
  println()

  println("Scala 3 Decoration")
  println("------------------")
  scala3Decoration()
  println()

}
