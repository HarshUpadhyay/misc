package practice;

/**
 * Created by razor on 3/10/15.
 */
public class binTreeNode {
    private Object data;
    private binTreeNode lChild;
    private binTreeNode rChild;

    binTreeNode(){
        this.setData(null);
        this.setlChild(null);
        this.setrChild(null);
    }

    public binTreeNode(Object data) {
        this.setData(data);
        this.setlChild(null);
        this.setrChild(null);
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setlChild(binTreeNode lChild) {
        this.lChild = lChild;
    }

    public void setrChild(binTreeNode rChild) {
        this.rChild = rChild;
    }

    public Object getData() {
        return data;
    }

    public binTreeNode getlChild() {
        return lChild;
    }

    public binTreeNode getrChild() {
        return rChild;
    }
}
