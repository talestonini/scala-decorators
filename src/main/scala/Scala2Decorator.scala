case class Scala2Decorator(tp: ThirdPartyApi) {

  def doSthSpecial() = {
    println(s"doing something special with ${tp.prop}, the Scala 2 way")
    tp.prop2 = "baz"
  }

}

object Scala2Decorator {

  implicit def plugin(tp: ThirdPartyApi): Scala2Decorator =
    Scala2Decorator(tp)

}
