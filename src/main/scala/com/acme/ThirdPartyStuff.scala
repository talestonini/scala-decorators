package com.acme

sealed class ThirdPartyStuff {

  val prop: String = "foo"
  var otherProp: String = "bar"

  def doSth() = println(s"doing something with $prop")
  def doSthElse() = println(s"doing something else")
  def doAnotherThing() = println(s"doing another thing with $otherProp")

}
