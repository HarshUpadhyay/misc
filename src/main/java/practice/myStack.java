package practice;

/**
 * Created by harsh on 10/4/14.
 */
public class myStack {
    private SLnode l_top;
    private int size;

    boolean isEmpty(){
        return(l_top == null);
    }

    void push(Object item){
        SLnode node = new SLnode(item);
        node.setNext(l_top);
        l_top = node;
        size++;
    }

    Object peek(){
        if (this.isEmpty())
            return null;
        else
            return l_top.data;
    }

    Object pop(){
        if (this.isEmpty())
            return null;
        else{
            Object item = l_top.data;
            l_top = l_top.getNext();
            size--;
            return item;
        }
    }
}
