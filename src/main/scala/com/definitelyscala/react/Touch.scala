package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait Touch extends js.Object {
  var identifier: Double = js.native
  var target: EventTarget = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
}