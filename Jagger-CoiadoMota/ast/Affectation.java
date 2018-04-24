package ast;

public class Affectation extends Instruction {

	private Variable v;
	private ExpBoolean expb;

	public Affectation(Variable v, ExpBoolean exp){
	    this.v = v;
	    this.expb =  new True();
	}

	public <T> T accepter(VisitorInstruction<T> vi) throws Exception{
	    return vi.visite(this);
	}
	  
	  
	public Variable v(){ return v; }
	public ExpBoolean exp(){ return expb;}

}
