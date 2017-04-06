package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait UIEvent[T] extends SyntheticEvent[T] {
  var detail: Double = js.native
  var view: AbstractView = js.native
}