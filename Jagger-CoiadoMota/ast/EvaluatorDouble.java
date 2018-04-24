package ast;

public class EvaluatorDouble extends VisitorDouble<Type>{
	
	
private  Context c;
  
  public EvaluatorDouble(Context c){
	    this.c =c;
}
  
  public Type visite(Num n) {
	  if(n.value()==-0.0)
		 return new Num(0.0);
	  else
		 return n;
	    
  }
  
  public Type visite(Str str) {
	  return str;
	    
  }
  
  public Type visite(Bool b) {
	  return b;
	    
  }
  
  public Type visite(Variable v) {
	  return new Num(c.read(v.name()));
	    
  }

  public Type visite(Div d) throws Exception {
	String t1 = (d.op1()).getType();
	String t2 = (d.op2()).getType();
	//Type Checker
	if (t1.equals("Double")&&t2.equals("Double")) {
		if((Double)d.op2().accepter(this).value()==0.0){
	        throw new ArithmeticException("denominator == 0");
	    }
	    Double o1 = (Double)d.op1().accepter(this).value();
	    Double o2 = (Double)d.op2().accepter(this).value();
	    return  new Num(o1/o2);
	}else {
		throw new Error("Not valid operation");
	}
    
  }

  public Type visite(Add a) throws Exception {
	String t1 = (a.op1()).getType();
	String t2 = (a.op2()).getType();
	 //Type Checker
	if (t1.equals("Double")&&t2.equals("Double")) {
		Double o1 = (Double)a.op1().accepter(this).value();
		Double o2 = (Double)a.op2().accepter(this).value();
	    return new Num(o1+o2);
	}else {if(t1.equals("Str")&&t2.equals("Str")) {
		String o1 = (String)a.op1().accepter(this).value();
		String o2 = (String)a.op2().accepter(this).value();
	    return new Str(o1+o2);
	}
		throw new Error("Not valid operation");	
	}
	
  }
  
  public Type visite(Mul m) throws Exception{
	  String t1 = (m.op1()).getType();
	  String t2 = (m.op2()).getType();
	  //Type Checker
	  if (t1.equals("Double")&&t2.equals("Double")) {
		  Double o1 = (Double)m.op1().accepter(this).value();
		  Double o2 = (Double)m.op2().accepter(this).value();
		  if(o1*o2==-0.0)
			return new Num(0.0);
		  else
			return new Num(o1*o2);
	  }else {
			throw new Error("Not valid operation");	
	  }
	  
    
  }
  
  public Type visite(Minus mi)throws Exception {
	  String t = (mi.op()).getType();
	  //Type Checker
	  if (t.equals("Double")) {
		  Double o =  (Double)mi.op().accepter(this).value();
		  return  new Num(-1*o);
	  }else {
			throw new Error("Not valid operation");	
	  }
	  	
  }
  
  public Type visite(Plus p)throws Exception {
	  String t = (p.op()).getType();
	  //Type Checker
	  if (t.equals("Double")) {
		  Double o =  (Double)p.op().accepter(this).value();
		  return  new Num(o);
	  }else {
			throw new Error("Not valid operation");	
	  }
	  	
  }
  
  public Type visite(Sub s) throws Exception{
	  String t1 = (s.op1()).getType();
	  String t2 = (s.op2()).getType();
	  //Type Checker
	  if (t1.equals("Double")&&t2.equals("Double")) {
		  Double o1 = (Double)s.op1().accepter(this).value();
		  Double o2 = (Double)s.op2().accepter(this).value();
		  return  new Num(o1-o2);
	  }else {
			throw new Error("Not valid operation");	
	  }
	  
  }

  public Context context(){return c;}


}
