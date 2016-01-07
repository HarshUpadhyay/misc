package arithematic;

/**
 * Created by razor on 8/29/15.
 */
public class EvalVisitor implements Visitor {

    Environment env;
    static EvalVisitor ONLY = new EvalVisitor();
    private EvalVisitor(){}

    public void setEnv(Environment env) {
        this.env = env;
    }

    @Override
    public Object forConst(ConstInt c) {
        return c;
    }

    @Override
    public Object forSum(Sum s) {
        return new ConstInt(((ConstInt)s.left.accept(this)).value()+((ConstInt)s.right.accept(this)).value());
    }

    @Override
    public Object forProd(Prod p) {
        return new ConstInt(((ConstInt)p.left.accept(this)).value()*((ConstInt)p.right.accept(this)).value());
    }

    @Override
    public Object forNeg(Neg n) {
        return new ConstInt(((ConstInt)n.left.accept(this)).value()-((ConstInt)n.right.accept(this)).value());
    }

    @Override
    public Object forPow(Pow pow) {
        return new ConstDouble(Math.pow(((ConstDouble)pow.base.accept(this)).value(),((ConstDouble)pow.exponent.accept(this)).value()));
    }

    @Override
    public Object forConstDouble(ConstDouble cDbl) {
        return cDbl;
    }

    @Override
    public Object forVar(Var v) {
        return env.lookup(v.name());
    }
}
