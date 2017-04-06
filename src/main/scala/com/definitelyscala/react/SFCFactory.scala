package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._

@js.native
trait SFCFactory[P] extends js.Object {
  def apply(props: Attributes, children: ReactNode*): SFCElement[P] = js.native
}