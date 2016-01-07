package arithematic;

/**
 * Created by razor on 8/28/15.
 */
public class ConstInt extends Const{
    private int value;
    ConstInt(int value){
        this.value = value;
    }

    Object accept(Visitor v){
        return v.forConst(this);
    }
    int value(){return value;}
}
