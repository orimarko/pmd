/* Generated By:JJTree: Do not edit this line. ASTClassOrInterfaceBody.java */

package net.sourceforge.pmd.ast;

public class ASTClassOrInterfaceBody extends SimpleNode {
  public ASTClassOrInterfaceBody(int id) {
    super(id);
  }

  public ASTClassOrInterfaceBody(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
