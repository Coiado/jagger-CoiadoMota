package ast;

public abstract class Bin extends Exp {

  protected Exp op1;
  protected Exp op2;

  public Bin(Exp op1, Exp op2) {
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
