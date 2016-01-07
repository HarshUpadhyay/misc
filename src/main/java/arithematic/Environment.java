package arithematic;

/**
 * Created by razor on 8/29/15.
 */
public class Environment {
    Binding binding;
    Environment env;
    Environment(){
        this.binding = null;
        this.env = null;
    }

    Environment(Binding binding){
        this.binding = binding;
        this.env = new Environment();
    }

    public void insertBinding(Binding binding) {
        if(this.binding == null){
        //case of empty list
            this.binding = binding;
            this.env = new Environment();
        }
        else{
            this.env.insertBinding(binding);
        }
    }

    Const lookup(String name)throws EmptyListException{
        try{
            if (name.equals(binding.getName())) {
                return binding.getValue();
            } else {
                return env.lookup(name);
            }
        }
        catch(NullPointerException E){
            throw new EmptyListException(("No binding exists in the environment for variable name "+name));
        }
    }
}
