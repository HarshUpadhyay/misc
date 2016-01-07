package arithematic;

/**
 * Created by razor on 8/28/15.
 */
public class Prod extends ArithExpr{
    ArithExpr left;
    ArithExpr right;

    Object accept(Visitor v) {
        return v.forProd(this);
    }
}
