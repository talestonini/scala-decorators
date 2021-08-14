package decorator.scala3

import com.acme._

extension (tps: ThirdPartyStuff)

  def doSthMoreSpecial() = {
    println(s"doing something even more special with ${tps.prop}, the Scala 3 way")
    tps.otherProp = "baz"
  }
