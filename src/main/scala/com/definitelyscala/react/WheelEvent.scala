package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait WheelEvent[T] extends MouseEvent[T] {
  var deltaMode: Double = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
}