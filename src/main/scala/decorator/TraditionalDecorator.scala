package decorator

import com.acme._

class TraditionalDecorator(tps: ThirdPartyStuff) {

  def doSth() = tps.doSth()
  def doSthElse() = tps.doSthElse()
  def doAnotherThing() = tps.doAnotherThing()

  def doSthSpecial() = {
    println(s"doing something special with ${tps.prop}, the traditional way")
    tps.otherProp = "baz"
  }

}
