package ast;

public class Num extends Type {

	private Double i;
	private String type;

	public Num(Double i) {
		this.i = i;
		this.type = "Double";
	}

	public Double value() {
		return i;
	}

	public <T> T accepter(VisitorDouble<T> v) {
		return v.visite(this);
	}
	
	@Override
	public String getType() {
		return this.type;
	}
	
}
