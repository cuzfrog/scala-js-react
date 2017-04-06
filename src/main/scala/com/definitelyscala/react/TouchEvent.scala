package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait TouchEvent[T] extends SyntheticEvent[T] {
  var altKey: Boolean = js.native
  var changedTouches: TouchList = js.native
  var ctrlKey: Boolean = js.native
  def getModifierState(key: String): Boolean = js.native
  var metaKey: Boolean = js.native
  var shiftKey: Boolean = js.native
  var targetTouches: TouchList = js.native
  var touches: TouchList = js.native
}