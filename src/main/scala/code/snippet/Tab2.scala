package code.snippet

import net.liftweb.util._
import Helpers._
import code.services.Service
import net.liftweb.http.S
import net.liftweb.common.Logger
import net.liftweb.http.js.JsCmds.RedirectTo
import net.liftweb.http.RedirectResponse
import net.liftweb.http.js.JsCmds.Script
import scala.xml.Text

class Tab2 extends Logger{
  def render = {
    try {
      Service.testFunction
      val delay = 1000L + randomLong(10000)
      Thread.sleep(delay)
      ".lista *" #> "Tab2"
    } catch {
      case e: Exception => {
        error("Tab2 snippet")
        ".lista *" #> (Text("Error") ++ Script(RedirectTo("error")))
        //RedirectTo("error")
        //RedirectResponse("error")
        //S.redirectTo("error")
      }
    }
  }
}