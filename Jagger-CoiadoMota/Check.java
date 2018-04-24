import java.io.ByteArrayInputStream;
import java.io.InputStream;

import ast.*;

public class Check  {
	
	public static Jagger testParser ;
	public static void main(String[] args) throws AssertionError {
		String initialString = "test";
		InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
		testParser = new Jagger(targetStream);
		testOpArit();
		testPrint();
		testIfElse();
		testChaineChar();
		testTypeChecker();
	}
	
	public static void testPrint()
    {
		try {
			Memory m = new Memory();
	  		EvaluatorDouble vi = new EvaluatorDouble(m);
	  		EvaluatorBoolean vb = new EvaluatorBoolean(vi);
			String initialString = "print(1+2*3)";
			InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
			testParser.ReInit(targetStream);
			Instruction a = testParser.inst();
			System.out.println("******* PRINT TEST *******");
			System.out.println("Input: "+initialString);
			System.out.print("Result: ");
			a.accepter(new EvaluatorInstruction(vi,vb));
			System.out.println("\n");
		}catch(Exception e) {
			System.out.println("Error there is an exception");
		}
		
    }
	
	public static void testIfElse()
    {
		try {
			Memory m = new Memory();
	  		EvaluatorDouble vi = new EvaluatorDouble(m);
	  		EvaluatorBoolean vb = new EvaluatorBoolean(vi);
			String initialString = "if if 0 then 1 else 2 then print(1+2) else print(2+3)";
			InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
			testParser.ReInit(targetStream);
			Instruction a = testParser.inst();
			System.out.println("******* IFTHENELSE TEST *******");
			System.out.println("Input: "+initialString);
			System.out.print("Result: ");
			a.accepter(new EvaluatorInstruction(vi,vb));
			System.out.println("\n");
		}catch(Exception e) {
			System.out.println("Error there is an exception");
		}
		
    }
	
	public static void testOpArit()
    {
		try {
			Memory m = new Memory();
	  		EvaluatorDouble vi = new EvaluatorDouble(m);
			String initialString = "(1+2*-3+(1-3-(4)))";
			InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
			testParser.ReInit(targetStream);
			Instruction a = testParser.inst();
			Double test = (Double)a.exp().op1().accepter(vi).value();
			System.out.println("******* ARITMETIC EXPRESSION TEST *******");
			System.out.println("Input: "+initialString);
			System.out.println("Result: "+test);
			if(test.equals(-11.0)) {
				System.out.println("Test Operator Aritimatic pass :)");
			}else {
				System.out.println("Error is not the good value");
			}
			System.out.println("\n");
		}catch(Exception e) {
			System.out.println("Error there is an exception");
		}
		
    }
	
	public static void testChaineChar()
    {
		try {
			Memory m = new Memory();
	  		EvaluatorDouble vi = new EvaluatorDouble(m);
			String initialString = "\"foo\" + \"bar\"";
			InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
			testParser.ReInit(targetStream);
			Instruction a = testParser.inst();
			String test = (String)a.exp().op1().accepter(vi).value();
			System.out.println("******* CHAIN OF CARACTER TEST *******");
			System.out.println("Input: "+initialString);
			System.out.println("Result: "+test);
			if(test.equals("foobar")) {
				System.out.println("Test Operator Aritimatic pass :)");
			}else {
				System.out.println("Error"+test+"is not the good value");
			}
			System.out.println("\n");
		}catch(Exception e) {
			System.out.println("Error there is an exception");
		}
		
    }
	
	public static void testTypeChecker()
    {
		try {
			Memory m = new Memory();
	  		EvaluatorDouble vi = new EvaluatorDouble(m);
	  		EvaluatorBoolean vb = new EvaluatorBoolean(vi);
			String initialString =  "\"1\" = 1";
			InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
			testParser.ReInit(targetStream);
			Instruction a = testParser.inst();
			System.out.println("******* TYPE CHECKER TEST *******");
			System.out.println("Input: "+initialString);
			System.out.print("Result: ");
			a.accepter(new EvaluatorInstruction(vi,vb));
			System.out.println("\n");
		}catch(Throwable e) {
			System.out.println("Not valid Operation");
			System.out.println("\n");
		}
		try {
			Memory m = new Memory();
	  		EvaluatorDouble vi = new EvaluatorDouble(m);
	  		EvaluatorBoolean vb = new EvaluatorBoolean(vi);
			String initialString =  "if 1 then \"1\" else 1";
			InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
			testParser.ReInit(targetStream);
			Instruction a = testParser.inst();
			System.out.println("******* TYPE CHECKER TEST 2 *******");
			System.out.println("Input: "+ initialString);
			System.out.print("Result: ");
			a.accepter(new EvaluatorInstruction(vi,vb));
			System.out.println("\n");
		}catch(Throwable e) {
			System.out.println("Not valid Operation");
			System.out.println("\n");
		}
		
    }
	
	
	
	
	
}
