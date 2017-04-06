package com.definitelyscala.react

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ComponentSpec[P, S] extends Mixin[P, S] {
  def render(): ReactElement[js.Any] | Null = js.native
  @js.annotation.JSBracketAccess
  def apply(propertyName: String): js.Any = js.native
  @js.annotation.JSBracketAccess
  def update(propertyName: String, v: js.Any): Unit = js.native
}