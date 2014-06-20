package org.wicketstuff.scala.markup.html.form

import org.apache.wicket.markup.html.form.TextField
import org.apache.wicket.model.IModel
import org.wicketstuff.scala.ScalaMarkupContainer
import org.wicketstuff.scala.model.Fodel

/**
 *
 */
class ScalaTextField[T](id: String, model: IModel[T])
  extends TextField[T](id, model)
  with ScalaMarkupContainer {

  def this(id:String, getter: ⇒ T, setter:(T) ⇒ Unit) = this(id, new Fodel[T](getter, setter))
}
