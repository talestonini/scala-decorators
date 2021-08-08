sealed class ThirdPartyApi {

  val prop: String = "foo"
  var otherProp: String = "bar"

  def doSth() = println(s"doing something with $prop")
  def doSthElse() = println(s"doing something else with $prop")
  def doAnotherThing() = println(s"doing another thing with $prop")

}
