package ast;

public abstract class VisitorDouble<T>  {
  public abstract T visite(Variable v);
  public abstract T visite(Num n);
  public abstract T visite(Div d) throws Exception;
  public abstract T visite(Add a) throws Exception;
  public abstract T visite(Mul m) throws Exception;
  public abstract T visite(Sub s) throws Exception;
  public abstract T visite(Minus mi) throws Exception;
  public abstract T visite(Plus p) throws Exception;
  
  public abstract T visite(Str str);
  public abstract T visite(Bool b);
  
  public abstract Context context();
}

