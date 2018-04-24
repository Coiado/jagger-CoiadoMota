package ast;

public class PPDouble extends VisitorDouble<String>  {
  
  private  Context c;
	  
  public PPDouble(Context c){
	 this.c =c;
  }
  
  public String visite(Num n) {
	return Double.toString(n.value());
  }
	
  public String visite(Variable v){
	    return v.name();
  }
  public String visite(Div d) throws Exception {
    return "(" + d.op1().accepter(this) + " / " + d.op2().accepter(this) +")";
  }
  

  public String visite(Add a) throws Exception {
    return "("+ a.op1().accepter(this) +" + "+ a.op2().accepter(this) +")";
  }

  public String visite(Mul m) throws Exception {
    return "("+ m.op1().accepter(this) +" * "+ m.op2().accepter(this) +")";
  }

  public String visite(Sub s) throws Exception {
    return "("+ s.op1().accepter(this) +" - "+ s.op2().accepter(this) +")";
  }
  
  public String visite(Minus mi) throws Exception {
	    return "(" +" - " + mi.op().accepter(this) +")";
  }
  
  public String visite(Plus p) throws Exception {
	    return "(" +" + " + p.op().accepter(this) +")";
  }
  
  public Context context(){return c;}
  
  
  public String visite(Str str) {
	  return "(" +str.value()+ ")";
	    
  }
  
  public String visite(Bool b) {
	  if(b.value()){
		  return "true";
	  }else {
		  return "false";
	  }
	    
  }
  
}
