/* Generated By:JJTree: Do not edit this line. ASTMemberValue.java */

package net.sourceforge.pmd.ast;

public class ASTMemberValue extends SimpleNode {
  public ASTMemberValue(int id) {
    super(id);
  }

  public ASTMemberValue(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
