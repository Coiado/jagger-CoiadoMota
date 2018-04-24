package ast;

public class For extends Iteration {

	private Instruction init,inc;
	private ExpBoolean exp;
	   
	public For(Instruction init, ExpBoolean cond, Instruction i1, Instruction inc){
	    super(cond,i1);
	    this.init = init;
	    this.inc  = inc;
	  }
	  
	public <T> T  accepter(VisitorInstruction<T> vi) throws Exception{
	    return vi.visite(this);
	}
	  
	public Instruction init(){return init; }
	public Instruction inc(){return inc; }
	public ExpBoolean exp(){ return exp;}
}
