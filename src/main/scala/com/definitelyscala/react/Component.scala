package com.definitelyscala.react

import com.definitelyscala.react.React.ReactInstance

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
@js.annotation.JSGlobal("React.Component")
class Component[P, S] protected () extends ComponentLifecycle[P, S] {
  def this(props: P = js.native, context: js.Any = js.native) = this()
  def setState[K](f: js.Function2[S, P, S | K], callback: js.Function0[Any]): Unit = js.native
  def setState[K](state: S | K, callback: js.Function0[Any]): Unit = js.native
  def forceUpdate(callBack: js.Function0[Any] = js.native): Unit = js.native
  def render(): JSX.Element | Null = js.native
  // Props<T> is now deprecated, which means that the `children`
  // property is not available on `P` by default, even though you can
  // always pass children as variadic arguments to `createElement`.
  // In the future, if we can define its call signature conditionally
  // on the existence of `children` in `P`, then we should remove this.
  var props: P = js.native
  var state: S = js.native
  var context: js.Any = js.native
  var refs: js.Dictionary[ReactInstance] = js.native
}
