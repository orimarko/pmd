/* Generated By:JJTree: Do not edit this line. ASTMarkerAnnotation.java */

package net.sourceforge.pmd.ast;

public class ASTMarkerAnnotation extends SimpleNode {
  public ASTMarkerAnnotation(int id) {
    super(id);
  }

  public ASTMarkerAnnotation(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
