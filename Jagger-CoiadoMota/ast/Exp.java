package ast;

public abstract class Exp {

	public abstract <T> T accepter(VisitorDouble<T> v) throws Exception;
	public abstract String getType();
}
