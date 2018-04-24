package ast;

public class Div extends Bin {

    public Div(Exp op1, Exp op2) {
        super(op1, op2);
    }

    public <T> T accepter(VisitorDouble<T> v) throws Exception {
        return v.visite(this);
    }
    
    public String getType() {
		if(op1.getType().equals(op2.getType())) {
			return op1.getType();
		}else {
			throw new Error("Not valid operation");
		}
    }
}
