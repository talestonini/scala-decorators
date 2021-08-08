extension (tp: ThirdPartyApi)

  def doSthMoreSpecial() = {
    println(s"doing something even more special with ${tp.prop}, the Scala 3 way")
    tp.otherProp = "baz"
  }
