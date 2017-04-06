package com.definitelyscala.react

import com.definitelyscala.react.React.ValidationMap

import scala.scalajs.js

@js.native
trait ComponentClass[P] extends js.Object {
  var propTypes: ValidationMap[P] = js.native
  var contextTypes: ValidationMap[js.Any] = js.native
  var childContextTypes: ValidationMap[js.Any] = js.native
  var defaultProps: P = js.native
  var displayName: String = js.native
}
