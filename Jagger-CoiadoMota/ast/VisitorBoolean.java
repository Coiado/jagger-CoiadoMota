package ast;

public abstract class VisitorBoolean<T>  {
  public abstract T visite(True t);
  public abstract T visite(False f);
  public abstract T visite(Equal eq) throws Exception;
  public abstract T visite(Notequal neq) throws Exception;
  public abstract T visite(Lequal leq) throws Exception;
  public abstract T visite(Gequal geq) throws Exception;
  public abstract T visite(Greater g) throws Exception;
  public abstract T visite(Lower l) throws Exception;
  public abstract T visite(AritBool ab) throws Exception;
  
  public abstract Context context();
}
