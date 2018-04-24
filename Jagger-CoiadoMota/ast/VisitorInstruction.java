package ast;

public abstract class VisitorInstruction<T>  {
	public abstract T visite(Ifthenelse i) throws Exception;
	public abstract T visite(Affectation aff) throws Exception;

	public abstract T visite(While w) throws Exception;
	public abstract T visite(For f) throws Exception; 
	  
	public abstract T visite(Print pr) throws Exception;
	
	public abstract T visite(Sequence s) throws Exception;
	
	public abstract T visite(BasicInstruction s) throws Exception;
	   
	public abstract Context context();
}
