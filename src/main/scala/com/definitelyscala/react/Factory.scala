package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._

@js.native
trait Factory[P] extends js.Object {
  def apply(props: Attributes, children: ReactNode*): ReactElement[P] = js.native
}