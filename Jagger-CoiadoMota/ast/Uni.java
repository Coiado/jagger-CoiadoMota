package ast;

public abstract class Uni extends Exp {

	protected Exp op;

	  public Uni(Exp op) {
	    this.op = op;
	  }
	  
	  public Exp op() {
	      return op;
	  }
	  
}
