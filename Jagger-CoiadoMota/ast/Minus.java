package ast;

public class Minus extends Uni {

	public Minus(Exp op) {
        super(op);
    }

    public <T> T accepter(VisitorDouble<T> v) throws Exception {
        return v.visite(this);
    }
    
    public String getType() {
    		return op.getType();	
    }
}
