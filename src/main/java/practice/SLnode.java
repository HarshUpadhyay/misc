package practice;

/**
 * Created by harsh on 9/11/14.
 */
public class SLnode {
    Object data;
    SLnode next;

    SLnode(){
        this.data = null;
        this.next = null;
    }

    SLnode(Object data){
        this.data = data;
        this.next = null;
    }

    SLnode(Object data, SLnode next){
        this.data = data;
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(SLnode next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public SLnode getNext() {
        return next;
    }
}
