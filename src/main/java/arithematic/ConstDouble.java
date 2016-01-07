package arithematic;

/**
 * Created by razor on 8/29/15.
 */
public class ConstDouble extends Const {
    private double value;
    ConstDouble(double value){
        this.value = value;
    }

    Object accept(Visitor v){
        return v.forConstDouble(this);
    }
    double value(){return value;}
}
