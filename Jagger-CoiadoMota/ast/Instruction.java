package ast;

public abstract class Instruction {
	
	public abstract <T> T accepter(VisitorInstruction<T> vi) throws Exception;
	public abstract ExpBoolean exp();
}
