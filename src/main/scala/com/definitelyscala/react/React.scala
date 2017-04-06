package com.definitelyscala.react

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|
@js.native
@js.annotation.JSGlobal("React")
object React extends js.Object {
  //
  // React Elements
  // ----------------------------------------------------------------------
  type ReactType = String | ComponentClass[js.Any] | StatelessComponent[js.Any]
  type Key = String | Double
  type Ref[T] = String | js.Function1[T, Any]
  type ComponentState = js.Any | Unit
  type CElement[P, T <: Component[P, ComponentState]] = ComponentElement[P, T]
  type ClassicElement[P] = CElement[P, ClassicComponent[P, ComponentState]]
  //
  // Factories
  // ----------------------------------------------------------------------
  type CFactory[P, T <: Component[P, ComponentState]] = ComponentFactory[P, T]
  type ClassicFactory[P] = CFactory[P, ClassicComponent[P, ComponentState]]
  //
  // React Nodes
  // http://facebook.github.io/react/docs/glossary.html
  // ----------------------------------------------------------------------
  type ReactText = String | Double
  type ReactChild = ReactElement[js.Any] | ReactText
  // Should be Array<ReactNode> but type aliases cannot be recursive
  type ReactFragment = js.Any | js.Array[ReactChild | js.Array[js.Any] | Boolean]
  type ReactNode = ReactChild | ReactFragment | Boolean | Null | Unit
  //
  // Top Level API
  // ----------------------------------------------------------------------
  def createClass[P, S](spec: ComponentSpec[P, S]): ClassicComponentClass[P] = js.native
  def createFactory[P <: DOMAttributes[T], T <: Element](`type`: String): DOMFactory[P, T] = js.native
  def createFactory[P](`type`: SFC[P]): SFCFactory[P] = js.native
  def createFactory[P](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, ComponentState]] = js.native
  def createFactory[P, T <: Component[P, ComponentState], C <: ComponentClass[P]](`type`: ClassType[P, T, C]): CFactory[P, T] = js.native
  def createFactory[P](`type`: ComponentClass[P]): Factory[P] = js.native
  def createElement[P <: DOMAttributes[T], T <: Element](`type`: String, props: ClassAttributes[T], children: ReactNode*): DOMElement[P, T] = js.native
  def createElement[P](`type`: SFC[P], props: Attributes, children: ReactNode*): SFCElement[P] = js.native
  def createElement[P](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]], props: ClassAttributes[ClassicComponent[P, ComponentState]], children: ReactNode*): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def createElement[P, T <: Component[P, ComponentState], C <: ComponentClass[P]](`type`: ClassType[P, T, C], props: ClassAttributes[T], children: ReactNode*): CElement[P, T] = js.native
  def createElement[P](`type`: ComponentClass[P], props: Attributes, children: ReactNode*): ReactElement[P] = js.native
  def cloneElement[P <: DOMAttributes[T], T <: Element](element: DOMElement[P, T], props: ClassAttributes[T], children: ReactNode*): DOMElement[P, T] = js.native
  def cloneElement[P <: Q, Q](element: SFCElement[P], props: Q, children: ReactNode*): SFCElement[P] = js.native
  def cloneElement[P <: Q, Q, T <: Component[P, ComponentState]](element: CElement[P, T], props: Q, children: ReactNode*): CElement[P, T] = js.native
  def cloneElement[P <: Q, Q](element: ReactElement[P], props: Q, children: ReactNode*): ReactElement[P] = js.native
  def isValidElement[P](`object`: js.Any): ReactElement[P] = js.native
  var DOM: ReactDOM = js.native
  var PropTypes: ReactPropTypes = js.native
  var Children: ReactChildren = js.native
  var version: String = js.native
  //
  // Component API
  // ----------------------------------------------------------------------
  type ReactInstance = Component[js.Any, js.Any] | Element
  // Base component for plain JS classes
  //
  // Class Interfaces
  // ----------------------------------------------------------------------
  type SFC[P] = StatelessComponent[P]
  /**
   * We use an intersection type to infer multiple type parameters from
   * a single argument, which is useful for many top-level API defs.
   * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
   */
  type ClassType[P, T <: Component[P, ComponentState], C <: ComponentClass[P]] = C
  //
  // Component Specs and Lifecycle
  // ----------------------------------------------------------------------
  //
  // Event System
  // ----------------------------------------------------------------------
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type ReactEventHandler[T] = EventHandler[SyntheticEvent[T]]
  type ClipboardEventHandler[T] = EventHandler[ClipboardEvent[T]]
  type CompositionEventHandler[T] = EventHandler[CompositionEvent[T]]
  type DragEventHandler[T] = EventHandler[DragEvent[T]]
  type FocusEventHandler[T] = EventHandler[FocusEvent[T]]
  type FormEventHandler[T] = EventHandler[FormEvent[T]]
  type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]
  type KeyboardEventHandler[T] = EventHandler[KeyboardEvent[T]]
  type MouseEventHandler[T] = EventHandler[MouseEvent[T]]
  type TouchEventHandler[T] = EventHandler[TouchEvent[T]]
  type UIEventHandler[T] = EventHandler[UIEvent[T]]
  type WheelEventHandler[T] = EventHandler[WheelEvent[T]]
  type AnimationEventHandler[T] = EventHandler[AnimationEvent[T]]
  type TransitionEventHandler[T] = EventHandler[TransitionEvent[T]]
  //
  // Props / DOM Attributes
  // ----------------------------------------------------------------------
  /**
   * @deprecated. This was used to allow clients to pass `ref` and `key`
   * to `createElement`, which is no longer necessary due to intersection
   * types. If you need to declare a props object before passing it to
   * `createElement` or a factory, use `ClassAttributes<T>`:
   *
   * ```ts
   * var b: Button;
   * var props: ButtonProps & ClassAttributes<Button> = {
   *     ref: b => button = b, // ok!
   *     label: "I'm a Button"
   * };
   * ```
   */
  // See CSS 3 CSS-wide keywords https://www.w3.org/TR/css3-values/#common-keywords
  // See CSS 3 Explicit Defaulting https://www.w3.org/TR/css-cascade-3/#defaulting-keywords
  // "all CSS properties can accept these values"
  type CSSWideKeyword = String | String | String
  // See CSS 3 <percentage> type https://drafts.csswg.org/css-values-3/#percentages
  type CSSPercentage = String
  // See CSS 3 <length> type https://drafts.csswg.org/css-values-3/#lengths
  type CSSLength = Double | String
  // This interface is not complete. Only properties accepting
  // unitless numbers are listed here (see CSSProperty.js in React)
  // this list is "complete" in that it contains every SVG attribute
  // that React supports, but the types can be improved.
  // Full list here: https://facebook.github.io/react/docs/dom-elements.html
  //
  // The three broad type categories are (in order of restrictiveness):
  //   - "number | string"
  //   - "string"
  //   - union of string literals
  //
  // DOM
  // ----------------------------------------------------------------------
  //
  // PropTypes
  // ----------------------------------------------------------------------
  type ValidationMap[T] = js.Any
}
