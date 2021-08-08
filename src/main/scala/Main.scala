object Main extends App {

  def traditionalDecoration() = {
    val tp = new ThirdPartyApi()
    tp.doSth()

    val decorator = new TraditionalDecorator(tp)
    decorator.doSthSpecial()

    println(s"side-effect: otherProp=${tp.otherProp}")
  }

  def scala2Decoration() = {
    import Scala2Decorator.plugin

    val tp = new ThirdPartyApi()
    tp.doSth()
    tp.doSthSpecial()

    println(s"side-effect: otherProp=${tp.otherProp}")
  }

  def scala3Decoration() = {
    val tp = new ThirdPartyApi()

    tp.doSth()
    tp.doSthMoreSpecial()

    println(s"side-effect: otherProp=${tp.otherProp}")
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
