/* Generated By:JJTree: Do not edit this line. ASTDefaultValue.java */

package net.sourceforge.pmd.ast;

public class ASTDefaultValue extends SimpleNode {
  public ASTDefaultValue(int id) {
    super(id);
  }

  public ASTDefaultValue(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
