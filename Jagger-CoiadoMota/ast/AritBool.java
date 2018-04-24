package ast;

public class AritBool extends ExpBoolean {

	protected Exp op;
	private String type;

	public AritBool(Exp op) {
	    this.op = op;
	    this.type = op.getType();
	}
	
	  
	public Exp op1() {
	    return op;
	}
	
	public String getType() {
	    return this.type;
	}
	
	public <T> T accepter(VisitorBoolean<T> v) throws Exception {
        return v.visite(this);
    }

}
