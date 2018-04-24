package ast;

import java.util.Iterator;

public interface Context extends Iterable,java.io.Serializable{
  
  public Double read(String adress);
  public void write(String adress, Double value);
  
  
  public Iterator<String> iterator();
  
}
