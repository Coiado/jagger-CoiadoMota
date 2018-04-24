package ast;

public class EvaluatorInstruction extends VisitorInstruction<Context>{
	
	private VisitorDouble<Type> vi;
	private VisitorBoolean<Boolean> vb;
	
	public EvaluatorInstruction(VisitorDouble<Type> vi, VisitorBoolean<Boolean> vb){
	    this.vi = vi;
	    this.vb = vb;
	}
	
	public Context context(){
	    return this.vi.context();
	}
	
	public Context visite(While w) throws Exception{
	    if(w.cond().accepter(this.vb))
	      new Sequence(w.i1(), new While(w.cond(),w.i1())).accepter(this);
	    
	    return this.vi.context();
	}
	
	public Context visite(Sequence s) throws Exception{
	    s.i1().accepter(this);
	    s.i2().accepter(this);
	    return this.vi.context();
	  }
	
	public Context visite(Affectation a) throws Exception{
//	    Double i =(Double)a.exp().accepter(this.vi).value();
//	    vi.context().write(a.v().name(),i);
	    return this.vi.context();
	 }
	
	public Context visite(Ifthenelse i) throws Exception{
		i.cond().accepter(this);
		
		String t1 =i.i1().exp().getType();
		String t2 =i.i2().exp().getType();
		if(t1.equals(t2)) {
			if(i.cond().exp().accepter(vb)) {
				i.i1().accepter(this);
				i.setExp(i.i1().exp());
			}
			else { if(i.i2() != null) {
				i.i2().accepter(this);
				i.setExp(i.i2().exp());
			}}
			
			 return this.vi.context();
		}else {
			throw new Error("Not valid operation");
		}
		
		
	    
	}
	
	public Context visite(Print a) throws Exception{
		if(a.exp().getType().equals("Bool")) {
			String pprinter = a.exp().accepter(new PPBoolean(new PPDouble(vi.context())));
			System.out.println(pprinter+" => "+a.exp().accepter(this.vb));
		}
		if(a.exp().getType().equals("Double")|a.exp().getType().equals("Str")) {
			String pprinter = a.exp().op1().accepter(new PPDouble(vi.context()));
			System.out.println("print"+pprinter+" => "+a.exp().op1().accepter(this.vi).value());
		}
	    return this.vi.context();
	}
	
	public Context visite(For pour) throws Exception{
	    new Sequence(
	      pour.init(),
	      new While(
	        pour.cond(),
	        new Sequence(
	          pour.i1(),
	          pour.inc()))).accepter(this);
	    
	    return this.vi.context();
	}
	
	public Context visite(BasicInstruction bi) throws Exception{
		bi.exp().accepter(this.vb);
	    
	    return this.vi.context();
	}

}	
