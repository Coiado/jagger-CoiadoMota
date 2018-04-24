package ast;

import java.util.Map;
import java.util.TreeMap;

import java.util.Iterator;

public class Memory implements Context{
	
	  private Map<String,Double> table;
	  
	  public Memory(){
	    table = new TreeMap<String,Double>();
	  }
	  
	  public Double read(String adress){
	    Double value = table.get(adress);
	    if(value==null) throw new RuntimeException();
	    return value;
	  }
	  
	  public void write(String adress, Double value){
	    table.put(adress,value);
	  }
	  
	  public String toString(){ return table.toString();}
	  
	  public Iterator<String> iterator(){
	    return table.keySet().iterator();
	  }
	}
