package bootstrap.liftweb

import net.liftweb._
import net.liftweb.util._
import net.liftweb.util.Helpers._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb.sitemap._
import net.liftweb.sitemap.Loc._
import net.liftweb.http.LiftRulesMocker.toLiftRules
import net.liftweb.util.Vendor.valToVender
import net.liftweb.http.js.jquery.JqJsCmds.ModalDialog

class Boot {

  def boot {

    // where to search snippet
    LiftRules.addToPackages("code")

    val entries = Menu(Loc("Home", List("index"), "Home")) ::
      Menu(Loc("Page 1", List("page1"), "Page1")) ::
      Menu(Loc("Page 2", List("page2"), "Page2")) ::
      Menu(Loc("Page 3", List("page3"), "Page3")) ::
      Menu(Loc("Error", List("error"), "Error", Hidden)) :: Nil

    LiftRules.setSiteMap(SiteMap(entries: _*))

    //Show the spinny image when an Ajax call starts
    LiftRules.ajaxStart = Full(() => LiftRules.jsArtifacts.show("ajax-loader").cmd)

    // Make the spinny image go away when it ends
    LiftRules.ajaxEnd = Full(() => LiftRules.jsArtifacts.hide("ajax-loader").cmd)

    // Force the request to be UTF-8
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))

    LiftRules.jsArtifacts = net.liftweb.http.js.jquery.JQueryArtifacts

    // Use HTML5 for rendering
    LiftRules.htmlProperties.default.set((r: Req) => new Html5Properties(r.userAgent))

    LiftRules.exceptionHandler.prepend {
      case (mode, req, ex) => RedirectResponse("/error")
    }
  }

}