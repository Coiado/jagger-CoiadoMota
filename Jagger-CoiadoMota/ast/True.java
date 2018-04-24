package ast;

public class True extends ExpBoolean {

	public <T> T accepter(VisitorBoolean<T> v){
	    return v.visite(this);
	}
	
	public Exp op1() {
		return new Num(1.0);
	}
	
	public String getType() {
		return "Bool";
	}
	

}
