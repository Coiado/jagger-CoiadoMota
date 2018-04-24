package ast;

public class Sequence extends Instruction {

	private Instruction i1;
	private Instruction i2;
	private ExpBoolean exp;

	public Sequence(Instruction i1, Instruction i2){
	  this.i1 = i1;
	  this.i2 = i2;
	  this.exp = new True();
	}

	public <T> T accepter(VisitorInstruction<T> vi) throws Exception{
	    return vi.visite(this);
	}
	  
	public Instruction i1(){ return i1; }
	  
	public Instruction i2(){ return i2; }
	public ExpBoolean exp(){ return exp; }

}
