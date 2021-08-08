object Main extends App {

  def traditionalDecoration() = {
    val tp = new ThirdPartyApi()
    tp.doSth()

    val decorator = new TraditionalDecorator(tp)
    decorator.doSthSpecial()

    println(s"side-effect: prop2=${tp.prop2}")
  }

  def scala2Decoration() = {
    import Scala2Decorator.plugin

    val tp = new ThirdPartyApi()
    tp.doSth()
    tp.doSthSpecial()

    println(s"side-effect: prop2=${tp.prop2}")
  }

  println("Traditional Decoration")
  traditionalDecoration()
  println()

  println("Scala 2 Decoration")
  scala2Decoration()
  println()

}
