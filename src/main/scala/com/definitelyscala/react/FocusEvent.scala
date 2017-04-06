package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait FocusEvent[T] extends SyntheticEvent[T] {
  var relatedTarget: EventTarget = js.native
}