package ast;

public class Sub extends Bin {

    public Sub(Exp op1, Exp op2) {
        super(op1, op2);
    }
    
    public <T> T accepter(VisitorDouble<T> v) throws Exception {
        return v.visite(this);
    }
    
    public String getType() {
		return op1.getType();
    }

}
