package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._

@js.native
trait ClassAttributes[T] extends Attributes {
  var ref: Ref[T] = js.native
}