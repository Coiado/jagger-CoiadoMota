package ast;

public class Print extends Instruction {

	private ExpBoolean exp;
	  
	public Print(ExpBoolean exp){
	    this.exp = exp;
	}
	
	

	public <T> T accepter(VisitorInstruction<T> vi) throws Exception{
	    return vi.visite(this);
	}
	  
	public ExpBoolean exp(){ return exp;}

}
