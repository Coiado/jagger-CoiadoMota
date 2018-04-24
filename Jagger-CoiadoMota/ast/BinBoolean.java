package ast;

public abstract class BinBoolean extends ExpBoolean {

  protected Exp op1;
  protected Exp op2;

  public BinBoolean(Exp op1, Exp op2) {
    this.op1 = op1;
    this.op2 = op2;
  }
  
  public Exp op1() {
      return op1;
  }

  public Exp op2() {
      return op2;
  }

}
