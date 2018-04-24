package ast;

public class Plus extends Uni {

	public Plus(Exp op) {
        super(op);
    }

    public <T> T accepter(VisitorDouble<T> v) throws Exception {
        return v.visite(this);
    }
    
    public String getType() {
		return op.getType();
    }

   
}
