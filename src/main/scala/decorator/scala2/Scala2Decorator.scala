package decorator.scala2

import com.acme._

object Scala2Decorator {

  implicit def converter(tps: ThirdPartyStuff): Scala2Decorator =
    Scala2Decorator(tps)

}

class Scala2Decorator(tps: ThirdPartyStuff) {

  def doSthSpecial() = {
    println(s"doing something special with ${tps.prop}, the Scala 2 way")
    tps.otherProp = "baz"
  }

}
