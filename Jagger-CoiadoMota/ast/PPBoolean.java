package ast;

public class PPBoolean extends VisitorBoolean<String>  {
  
  private  Context c;
  
  private VisitorDouble<String> ve;
  
  public PPBoolean(VisitorDouble<String> ve){
    this.ve = ve;
  }
	  
  
  public String visite(Equal eq) throws Exception {
	    return "("+ eq.op1().accepter(this.ve) +" == "+ eq.op2().accepter(this.ve) +")";
  }
  
  public String visite(Notequal neq) throws Exception {
	    return "("+ neq.op1().accepter(this.ve) +" != "+ neq.op2().accepter(this.ve) +")";
  }
  
  public String visite(Lequal leq) throws Exception{
	    return "("+ leq.op1().accepter(this.ve) +" <= "+ leq.op2().accepter(this.ve) +")";
  }
  
  public String visite(Gequal geq) throws Exception{
	    return "("+ geq.op1().accepter(this.ve) +" >= "+ geq.op2().accepter(this.ve) +")";
  }
  
  public String visite(Greater g)  throws Exception{
	    return "("+ g.op1().accepter(this.ve) +" > "+ g.op2().accepter(this.ve) +")";
  }
  
  public String visite(Lower l) throws Exception {
	    return "("+ l.op1().accepter(this.ve) +" < "+ l.op2().accepter(this.ve) +")";
  }
  
  public Context context(){return c;}

  public String visite(True t) {
	return "true";
  }
  
  public String visite(False f) {
		return "false";
  }
  
  public String visite(AritBool ab) throws Exception {
	    return "("+ ab.op1().accepter(this.ve) +")";
	    
  }
  
}
