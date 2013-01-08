package code.snippet

import net.liftweb.util._
import Helpers._

class Page2 {
  def render = {
    val list = 1 to 4
    ".lista *" #> list.map(i => {
      <div style="border:1px #ccc solid;">
        <h3>title { i }</h3>
        <lift:lazy-load>
          <div class={ "lift:Page4?param=elem" + i.toString } style="width:100px;height:100px">
            <div class="page4"></div>
          </div>
        </lift:lazy-load>
      </div>
    })
  }
}