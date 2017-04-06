package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait CompositionEvent[T] extends SyntheticEvent[T] {
  var data: String = js.native
}