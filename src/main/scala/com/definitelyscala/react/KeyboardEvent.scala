package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait KeyboardEvent[T] extends SyntheticEvent[T] {
  var altKey: Boolean = js.native
  var charCode: Double = js.native
  var ctrlKey: Boolean = js.native
  def getModifierState(key: String): Boolean = js.native
  var key: String = js.native
  var keyCode: Double = js.native
  var locale: String = js.native
  var location: Double = js.native
  var metaKey: Boolean = js.native
  var repeat: Boolean = js.native
  var shiftKey: Boolean = js.native
  var which: Double = js.native
}