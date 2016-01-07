package arithematic;

/**
 * Created by razor on 8/28/15.
 */
abstract class ArithExpr {
    abstract Object accept(Visitor v);
}
