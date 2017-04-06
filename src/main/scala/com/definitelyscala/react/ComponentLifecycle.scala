package com.definitelyscala.react

import scala.scalajs.js

@js.native
trait ComponentLifecycle[P, S] extends js.Object {
  def componentWillMount(): Unit = js.native
  def componentDidMount(): Unit = js.native
  def componentWillReceiveProps(nextProps: P, nextContext: js.Any): Unit = js.native
  def shouldComponentUpdate(nextProps: P, nextState: S, nextContext: js.Any): Boolean = js.native
  def componentWillUpdate(nextProps: P, nextState: S, nextContext: js.Any): Unit = js.native
  def componentDidUpdate(prevProps: P, prevState: S, prevContext: js.Any): Unit = js.native
  def componentWillUnmount(): Unit = js.native
}
