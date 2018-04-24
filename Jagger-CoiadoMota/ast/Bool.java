package ast;

public class Bool extends Type {

	private Boolean i;
	private String type;

	public Bool(Boolean i) {
		this.i = i;
		this.type = "Bool";
	}

	public Boolean  value() {
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
