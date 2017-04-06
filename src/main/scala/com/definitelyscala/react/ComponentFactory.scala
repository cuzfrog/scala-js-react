package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._

@js.native
trait ComponentFactory[P, T <: Component[P, ComponentState]] extends js.Object {
  def apply(props: ClassAttributes[T], children: ReactNode*): CElement[P, T] = js.native
}