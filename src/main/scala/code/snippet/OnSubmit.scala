package code.snippet

/**
 * Created by andreas on 11/7/14.
 */
import net.liftweb._
import http._
import util.Helpers._
import scala.xml.NodeSeq

/**
 * A snippet that binds behavior, functions,
 * to HTML elements
 */
object OnSubmit {
  def render = {
    // define some variables to put our values into
    var name = ""

    // process the form
    def process():Unit = {
        S.redirectTo("/"+name)
    }


    // associate each of the form elements
    // with a function... behavior to perform when the
    // for element is submitted
    "name=name" #> SHtml.onSubmit(name = _) & // set the name
      // when the form is submitted, process the variable
      "type=submit" #> SHtml.onSubmitUnit(process)
  }
}