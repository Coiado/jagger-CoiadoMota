package ast;

public abstract class ExpBoolean {
	  public abstract <T> T accepter(VisitorBoolean<T> v) throws Exception;
	  public abstract Exp op1();
	  public abstract String getType();
}
