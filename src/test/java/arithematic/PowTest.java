package arithematic;
//import org.junit.Test;

/**
 * Created by razor on 8/29/15.
 */
public class PowTest {
   // @Test
    public void basicTest(){
        Environment env = new Environment(new Binding( "base", new ConstDouble(5)));
        env.insertBinding(new Binding("exponent", new ConstDouble(3)));
        Pow ex = new Pow(env);
        System.out.println(((ConstDouble)ex.accept(EvalVisitor.ONLY)).value());
    }
}
