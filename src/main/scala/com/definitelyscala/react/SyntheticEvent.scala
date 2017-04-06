package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait SyntheticEvent[T] extends js.Object {
  var bubbles: Boolean = js.native
  var currentTarget: EventTarget = js.native
  var cancelable: Boolean = js.native
  var defaultPrevented: Boolean = js.native
  var eventPhase: Double = js.native
  var isTrusted: Boolean = js.native
  var nativeEvent: Event = js.native
  def preventDefault(): Unit = js.native
  def isDefaultPrevented(): Boolean = js.native
  def stopPropagation(): Unit = js.native
  def isPropagationStopped(): Boolean = js.native
  def persist(): Unit = js.native
  // If you thought this should be `EventTarget`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
  var target: EventTarget = js.native
  var timeStamp: Double = js.native
  var `type`: String = js.native
}