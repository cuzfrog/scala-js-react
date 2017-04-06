package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._

@js.native
trait ComponentElement[P, T <: Component[P, ComponentState]] extends ReactElement[P] {
  var ref: Ref[T] = js.native
}
