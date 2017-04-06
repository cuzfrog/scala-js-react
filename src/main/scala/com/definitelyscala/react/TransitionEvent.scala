package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait TransitionEvent[T] extends SyntheticEvent[T] {
  var propertyName: String = js.native
  var pseudoElement: String = js.native
  var elapsedTime: Double = js.native
}