package ast;

public class While extends Iteration {

	 public ExpBoolean exp;
	 
	 public While(ExpBoolean cond, Instruction i1){
		 super(cond,i1);
		 this.exp = new False();
	 }
		  
	 public <T> T  accepter(VisitorInstruction<T> vi) throws Exception{
		 return vi.visite(this);
	 }
	 
	 public ExpBoolean exp(){ return exp;}

}
