package code.snippet

import net.liftweb.util._
import Helpers._

/**
 * Created by andreas on 11/6/14.
 */
object ViewFirst {

  val ul = List(
    "デザイナーフレンドリーテンプレート",
      "Dreamweaver等で開けて修正できる。そのまま※プロダクションに。",
      "Viewにはビジネスロジック一切書かない。",
      "HTML。だけ。"
  )

  def render = ClearClearable &
    "h2 *" #> "View First" &
    ".template *" #> ul

}
