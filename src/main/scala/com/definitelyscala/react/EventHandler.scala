package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait EventHandler[E <: SyntheticEvent[_]] extends js.Object {
  def apply(event: E): Unit = js.native
}
