package com.definitelyscala.react

import com.definitelyscala.react.React.Key

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ReactElement[P] extends js.Object {
  var `type`: String | ComponentClass[P] | P = js.native
  var props: P = js.native
  var key: Key | Null = js.native
}
