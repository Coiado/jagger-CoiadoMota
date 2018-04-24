package ast;

public class Greater extends BinBoolean {
	private String type;

	public Greater(Exp op1, Exp op2) {
        super(op1, op2);
        this.type = "Bool";
    }
	
	public String getType() {
		  return this.type;
	}
    
    public <T> T accepter(VisitorBoolean<T> v) throws Exception {
        return v.visite(this);
    }
}
