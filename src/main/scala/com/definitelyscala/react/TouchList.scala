package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait TouchList extends js.Object {
  @js.annotation.JSBracketAccess
  def apply(index: Double): Touch = js.native
  @js.annotation.JSBracketAccess
  def update(index: Double, v: Touch): Unit = js.native
  var length: Double = js.native
  def item(index: Double): Touch = js.native
  def identifiedTouch(identifier: Double): Touch = js.native
}