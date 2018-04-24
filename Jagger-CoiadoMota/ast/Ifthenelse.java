package ast;

public class Ifthenelse extends Instruction {

	protected Instruction cond;
	protected Instruction i1;
	protected Instruction i2;
	public ExpBoolean exp;

	public Ifthenelse(Instruction cond,Instruction i1,Instruction i2){
	   this.cond = cond;
	   this.i1 = i1;
	   this.i2 = i2;
	   this.exp = new False();
	}

	public Ifthenelse(Instruction cond,Instruction i1){
	    this(cond,i1,null);
	}
	  

	public <T> T accepter(VisitorInstruction<T> vi) throws Exception{
	   return vi.visite(this);
	}
	  
	public Instruction cond(){ return cond; }
	public Instruction i1(){ return i1; }
	public Instruction i2(){ return i2; }
	public ExpBoolean exp(){ return exp; }
	public void setExp(ExpBoolean exp){ this.exp=exp; }

}
