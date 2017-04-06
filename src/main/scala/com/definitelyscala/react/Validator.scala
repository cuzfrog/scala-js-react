package com.definitelyscala.react

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Validator[T] extends js.Object {
  def apply(`object`: T, key: String, componentName: String, rest: js.Any*): Error | Null = js.native
}