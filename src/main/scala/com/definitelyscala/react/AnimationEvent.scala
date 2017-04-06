package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait AnimationEvent[T] extends SyntheticEvent[T] {
  var animationName: String = js.native
  var pseudoElement: String = js.native
  var elapsedTime: Double = js.native
}