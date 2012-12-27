package code.snippet

import net.liftweb.util._
import Helpers._

class Tab2 {
  def render = {
    val delay = 1000L + randomLong(10000)
    Thread.sleep(delay)
    ".lista *" #> "Tab2"
  }
}