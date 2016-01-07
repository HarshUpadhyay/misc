package arithematic;

/**
 * Created by razor on 8/29/15.
 */
public interface Visitor {
    Object forConst(ConstInt c);
    Object forSum(Sum s);
    Object forProd(Prod p);
    Object forNeg(Neg n);
    Object forVar(Var v);
    Object forPow(Pow pow);
    Object forConstDouble(ConstDouble cDbl);
}
