package code.snippet

/**
 * Created by andreas on 11/7/14.
 */
import net.liftweb._
import http._
import net.liftweb.http.js.{JsCmd, JsCmds}
import util.Helpers._
import scala.xml.NodeSeq

/**
  * A snippet that binds behavior, functions,
  * to HTML elements
  */
object OnSubmitAjax {
   def render = {
     // define some variables to put our values into
     var name = ""

     // process the form
     def process():JsCmd = {
       JsCmds.Alert("Hi "+name)
     }


     // associate each of the form elements
     // with a function... behavior to perform when the
     // for element is submitted
       "name=name" #> SHtml.onSubmit(name = _) & // set the name
       // when the form is submitted, process the variable
       "type=submit" #> SHtml.ajaxOnSubmit(process)
   }
 }

object AjaxElement {
  def render = "#pushme [onClick]" #> SHtml.onEvent(s => JsCmds.Alert("Click " + s))
}