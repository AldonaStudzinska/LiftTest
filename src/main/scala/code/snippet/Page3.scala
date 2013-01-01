package code.snippet

import net.liftweb.util._
import Helpers._

class Page3 {
  def render = {
    throw new Exception("exception")
    ".lista *" #> "Page 3"
  }
}