package com.definitelyscala.react

import com.definitelyscala.react.React.ValidationMap

import scala.scalajs.js

@js.native
trait StatelessComponent[P] extends js.Object {
  def apply(props: P, context: js.Any): ReactElement[js.Any] = js.native
  var propTypes: ValidationMap[P] = js.native
  var contextTypes: ValidationMap[js.Any] = js.native
  var defaultProps: P = js.native
  var displayName: String = js.native
}
