package code.snippet

import net.liftweb.util._
import Helpers._
import net.liftweb.http.S

class Page4 {
  val param = S.attr("param") openOr("not defined")
  def render = {
    ".page4 *" #> param
  }
}