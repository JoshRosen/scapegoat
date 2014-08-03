package com.sksamuel.scapegoat.inspections.matching

import com.sksamuel.scapegoat.{Inspection, InspectionContext, Inspector}

/** @author Stephen Samuel */
class PartialFunctionInsteadOfMatch extends Inspection {

  def inspector(context: InspectionContext): Inspector = new Inspector(context) {
    override def traverser = new context.Traverser {

      import context.global._

      override def inspect(tree: Tree): Unit = {
        tree match {
          case _ =>
        }
        continue(tree)
      }
    }
  }
}