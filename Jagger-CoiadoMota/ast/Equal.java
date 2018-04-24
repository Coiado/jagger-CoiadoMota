package ast;

public class Equal extends BinBoolean {
	

	private String type;

	public Equal(Exp op1, Exp op2) {
        super(op1, op2);
        this.type = "Bool";
    }
    
	public String getType() {
		if(op1.getType().equals(op2.getType())) {
			return op1.getType();
		}else {
			throw new Error("Not valid operation");
		}
	}
	
    public <T> T accepter(VisitorBoolean<T> v) throws Exception {
        return v.visite(this);
    }
}
