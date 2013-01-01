package code.snippet

import net.liftweb.util._
import Helpers._
import code.services.Service

class Tab2 {
  def render = {
    Service.testFunction
    val delay = 1000L + randomLong(10000)
    Thread.sleep(delay)
    ".lista *" #> "Tab2"
  }
}