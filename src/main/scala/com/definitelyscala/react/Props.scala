package com.definitelyscala.react

import scala.scalajs.js
import com.definitelyscala.react.React._

@js.native
trait Props[T] extends js.Object {
  var children: ReactNode = js.native
  var key: Key = js.native
  var ref: Ref[T] = js.native
}