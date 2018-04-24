package ast;

public class BasicInstruction extends Instruction {

	
	public ExpBoolean exp;

	public BasicInstruction(ExpBoolean expb){
	   this.exp = expb;
	}
	  

	public <T> T accepter(VisitorInstruction<T> vi) throws Exception{
	   return vi.visite(this);
	}
	  
	public ExpBoolean exp(){ return this.exp; }


}
