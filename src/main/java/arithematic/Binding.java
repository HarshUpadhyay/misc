package arithematic;

/**
 * Created by razor on 8/29/15.
 */
public class Binding {
    private String name;
    private Const Val;
    Binding(String name, Const Val){
        this.name = name;
        this.Val = Val;
    }
    public String getName(){return name;}
    public Const getValue(){return Val;}
}
