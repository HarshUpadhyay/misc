package arithematic;

/**
 * Created by razor on 8/29/15.
 */
public class Pow extends ArithExpr {
    ArithExpr base;
    ArithExpr exponent;
    Pow(Environment env){
        this.base = env.lookup("base");
        this.exponent = env.lookup("exponent");
    }
    Pow( ArithExpr base, ArithExpr exponent){
        this.base = base;
        this.exponent = exponent;
    }
    Object accept(Visitor v) {
        return v.forPow(this);
    }
}
