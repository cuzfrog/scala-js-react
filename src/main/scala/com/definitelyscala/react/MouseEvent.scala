package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait MouseEvent[T] extends SyntheticEvent[T] {
  var altKey: Boolean = js.native
  var button: Double = js.native
  var buttons: Double = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var ctrlKey: Boolean = js.native
  def getModifierState(key: String): Boolean = js.native
  var metaKey: Boolean = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var relatedTarget: EventTarget = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var shiftKey: Boolean = js.native
}