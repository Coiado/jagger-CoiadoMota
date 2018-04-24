package ast;

public class Variable extends Exp {

	private String name;
	private String type;
	public  Variable(Context c, String name, Double value){
		this.name = name;
	    c.write(name,value);
	}
	  
	public  Variable(Context c, String name){
	    this(c,name,0.0);
	}
	  
	public String name(){
	    return name;
	}
	
	 public String getType() {
 		return this.type;
	 }
	

	  
	public <T> T accepter(VisitorDouble<T> v){
	    return v.visite(this);
	}

}
