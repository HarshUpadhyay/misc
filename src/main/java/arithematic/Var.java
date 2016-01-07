package arithematic;

/**
 * Created by razor on 8/28/15.
 */
public class Var extends ArithExpr{
    private String name;
    Var(String n){name = n;}
    public String name(){return name;}
    public String toString(){return name;}

    Object accept(Visitor v){
        return v.forVar(this);
    }
}
