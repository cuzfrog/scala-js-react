package com.definitelyscala.react

import com.definitelyscala.react.React.ValidationMap

import scala.scalajs.js

@js.native
trait Mixin[P, S] extends ComponentLifecycle[P, S] {
  var mixins: Mixin[P, S] = js.native
  var statics: js.Dictionary[js.Any] = js.native
  var displayName: String = js.native
  var propTypes: ValidationMap[js.Any] = js.native
  var contextTypes: ValidationMap[js.Any] = js.native
  var childContextTypes: ValidationMap[js.Any] = js.native
  def getDefaultProps(): P = js.native
  def getInitialState(): S = js.native
}
