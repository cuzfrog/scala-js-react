package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait Requireable[T] extends Validator[T] {
  var isRequired: Validator[T] = js.native
}