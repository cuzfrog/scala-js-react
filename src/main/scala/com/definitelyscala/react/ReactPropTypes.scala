package com.definitelyscala.react

import com.definitelyscala.react.React.ValidationMap

import scala.scalajs.js

@js.native
trait ReactPropTypes extends js.Object {
  var any: Requireable[js.Any] = js.native
  var array: Requireable[js.Any] = js.native
  var bool: Requireable[js.Any] = js.native
  var func: Requireable[js.Any] = js.native
  var number: Requireable[js.Any] = js.native
  var `object`: Requireable[js.Any] = js.native
  var string: Requireable[js.Any] = js.native
  var node: Requireable[js.Any] = js.native
  var element: Requireable[js.Any] = js.native
  def instanceOf(expectedClass: js.Any): Requireable[js.Any] = js.native
  def oneOf(types: js.Array[js.Any]): Requireable[js.Any] = js.native
  def oneOfType(types: js.Array[Validator[js.Any]]): Requireable[js.Any] = js.native
  def arrayOf(`type`: Validator[js.Any]): Requireable[js.Any] = js.native
  def objectOf(`type`: Validator[js.Any]): Requireable[js.Any] = js.native
  def shape(`type`: ValidationMap[js.Any]): Requireable[js.Any] = js.native
}
