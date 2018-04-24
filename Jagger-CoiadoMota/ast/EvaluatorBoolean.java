package ast;

public class EvaluatorBoolean extends VisitorBoolean<Boolean>{
	
	private  Context c;
	
	private VisitorDouble<Type> ve;
	  
	public EvaluatorBoolean(VisitorDouble<Type> ve){
	    this.ve = ve;
	}
	
	public Boolean visite(True t) {
		return true;
	}
	
	public Boolean visite(False f) {
		return false;
	  }

	public Boolean visite(Equal eq) throws Exception {
		String t1 = (eq.op1()).accepter(this.ve).getType();
		String t2 = (eq.op2()).accepter(this.ve).getType();
		  //Type Checker
		if (t1.equals("Double")&&t2.equals("Double")) {
			Double o1 = (Double)eq.op1().accepter(this.ve).value();
			Double o2 = (Double)eq.op2().accepter(this.ve).value();
			return o1.equals(o2);
		}else {if(t1.equals("Str")&&t2.equals("Str")) {
			String o1 = (String)eq.op1().accepter(this.ve).value();
			String o2 = (String)eq.op2().accepter(this.ve).value();
			return o1.equals(o2);
		}else {if(t1.equals("Bool")&&t2.equals("Bool")) {
			Boolean o1 = (Boolean)eq.op1().accepter(this.ve).value();
			Boolean o2 = (Boolean)eq.op2().accepter(this.ve).value();
			return o1.equals(o2);	
		}
			
		}
			throw new Error("Not valid operation");
		}
		
	}
  

	public Boolean visite(Notequal neq) throws Exception {
		String t1 = (neq.op1()).accepter(this.ve).getType();
		String t2 = (neq.op2()).accepter(this.ve).getType();
		//Type Checker
		if (t1.equals("Double")&&t2.equals("Double")) {
			Double o1 = (Double)neq.op1().accepter(this.ve).value();
			Double o2 = (Double)neq.op2().accepter(this.ve).value();
			return !o1.equals(o2);
		}else {if(t1.equals("Str")&&t2.equals("Str")) {
			String o1 = (String)neq.op1().accepter(this.ve).value();
			String o2 = (String)neq.op2().accepter(this.ve).value();
			return !o1.equals(o2);
		}else {if(t1.equals("Bool")&&t2.equals("Bool")) {
			Boolean o1 = (Boolean)neq.op1().accepter(this.ve).value();
			Boolean o2 = (Boolean)neq.op2().accepter(this.ve).value();
			return !o1.equals(o2);	
		}
			
		}
			throw new Error("Not valid operation");
		}
	}
  
    public Boolean visite(Lequal leq) throws Exception {
    		String t1 = (leq.op1()).accepter(this.ve).getType();
		String t2 = (leq.op2()).accepter(this.ve).getType();
		  //Type Checker
		if (t1.equals("Double")&&t2.equals("Double")) {
			Double o1 = (Double)leq.op1().accepter(this.ve).value();
			Double o2 = (Double)leq.op2().accepter(this.ve).value();
			return (o1 <= o2);
		}else {if(t1.equals("Str")&&t2.equals("Str")) {
			String o1 = (String)leq.op1().accepter(this.ve).value();
			String o2 = (String)leq.op2().accepter(this.ve).value();
			int test = o1.compareTo(o2);
			return (test<=0);
		}
			throw new Error("Not valid operation");
		}
    }
  
    public Boolean visite(Gequal geq) throws Exception {
    		String t1 = (geq.op1()).accepter(this.ve).getType();
		String t2 = (geq.op2()).accepter(this.ve).getType();
		  //Type Checker
		if (t1.equals("Double")&&t2.equals("Double")) {
			Double o1 = (Double)geq.op1().accepter(this.ve).value();
			Double o2 = (Double)geq.op2().accepter(this.ve).value();
			return (o1 >= o2);
		}else {if(t1.equals("Str")&&t2.equals("Str")) {
			String o1 = (String)geq.op1().accepter(this.ve).value();
			String o2 = (String)geq.op2().accepter(this.ve).value();
			int test = o1.compareTo(o2);
			return (test>=0);
		}
			throw new Error("Not valid operation");
		}
    }
  
    public Boolean visite(Greater g) throws Exception {
    		String t1 = (g.op1()).accepter(this.ve).getType();
		String t2 = (g.op2()).accepter(this.ve).getType();
		  //Type Checker
		if (t1.equals("Double")&&t2.equals("Double")) {
			Double o1 = (Double)g.op1().accepter(this.ve).value();
			Double o2 = (Double)g.op2().accepter(this.ve).value();
			return (o1 > o2);
		}else {if(t1.equals("Str")&&t2.equals("Str")) {
			String o1 = (String)g.op1().accepter(this.ve).value();
			String o2 = (String)g.op2().accepter(this.ve).value();
			int test = o1.compareTo(o2);
			return (test>0);
		}
			throw new Error("Not valid operation");
		}
    }

    public Boolean visite(Lower l) throws Exception {
    		String t1 = (l.op1()).accepter(this.ve).getType();
		String t2 = (l.op2()).accepter(this.ve).getType();
		  //Type Checker
		if (t1.equals("Double")&&t2.equals("Double")) {
			Double o1 = (Double)l.op1().accepter(this.ve).value();
			Double o2 = (Double)l.op2().accepter(this.ve).value();
			return (o1 < o2);
		}else {if(t1.equals("Str")&&t2.equals("Str")) {
			String o1 = (String)l.op1().accepter(this.ve).value();
			String o2 = (String)l.op2().accepter(this.ve).value();
			int test = o1.compareTo(o2);
			return (test<0);
		}
			throw new Error("Not valid operation");
		}
    }
    
    public Boolean visite(AritBool ab) throws Exception {
    		String t1 = (ab.op1()).accepter(this.ve).getType();
		//Type Checker
    		if(t1.equals("Double")) {
    			Double o = (Double)ab.op1().accepter(this.ve).value();
    		  	if(o.equals(1.0)) {
    		  		return true; 
    		  	}else {
    		  		return false;
    		    }
    		}else {if(t1.equals("Str")) {
    			String o = (String)ab.op1().accepter(this.ve).value();
    		  	if(o.equals("1")) {
    		  		return true; 
    		  	}else {
    		  		return false;
    		    }}
    			throw new Error("Not valid operation");
    		}
    	  
    }
    
    public Context context(){return c;}
}
