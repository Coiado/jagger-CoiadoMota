package ast;

public abstract class Iteration extends Instruction {

	private ExpBoolean cond;
	private Instruction i1;
	  
	public Iteration(ExpBoolean cond, Instruction i1){
	    this.cond = cond;
	    this.i1 = i1;
	}
	    
	public ExpBoolean cond(){ return cond; }
	public Instruction i1(){ return i1; }
}
