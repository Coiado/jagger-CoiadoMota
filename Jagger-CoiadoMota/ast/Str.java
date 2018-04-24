package ast;

public class Str extends Type {

	private String i;
	private String type;

	public Str(String i) {
		this.i = i;
		this.type = "Str";
	}

	public String value() {
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
