case class TraditionalDecorator(tp: ThirdPartyApi) {

  def doSth() = tp.doSth()
  def doSthElse() = tp.doSthElse()
  def doAnotherThing() = tp.doAnotherThing()

  def doSthSpecial() = {
    println(s"doing something special with ${tp.prop}, the traditional way")
    tp.prop2 = "baz"
  }

}
