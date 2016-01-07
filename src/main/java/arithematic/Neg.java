package arithematic;

/**
 * Created by razor on 8/28/15.
 */
public class Neg extends ArithExpr{
    ArithExpr left;
    ArithExpr right;

    Object accept(Visitor v){
        return v.forNeg(this);
    }
}
