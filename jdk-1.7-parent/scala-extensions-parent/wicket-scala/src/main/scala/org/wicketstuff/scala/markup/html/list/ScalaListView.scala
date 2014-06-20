package org.wicketstuff.scala.markup.html.list

import org.apache.wicket.markup.html.list.{ListView, ListItem}
import org.apache.wicket.model.IModel
import org.apache.wicket.model.util.ListModel
import org.wicketstuff.scala.ScalaMarkupContainer

/**
 *
 */
class ScalaListView[T](id:String, list: IModel[java.util.List[T]], populateItemFunc:(ListItem[T]) ⇒ Unit)
  extends ListView[T](id, list)
  with ScalaMarkupContainer {

  def this(id:String, list: java.util.List[T], populateItemFunc:(ListItem[T]) ⇒ Unit) =
    this(id, new ListModel[T](list), populateItemFunc)

  override def populateItem(li:ListItem[T]) = populateItemFunc(li)
}
