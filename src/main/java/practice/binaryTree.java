package practice;

import java.lang.reflect.Array;

/**
 * Created by razor on 3/10/15.
 */
public class binaryTree {
    binTreeNode Root;

    binaryTree(){
        this.Root = new binTreeNode();
    }

    public void insert(Object data){

    }

    private void append( binTreeNode root, Object data){
        if (root.getData() == null){
            root.setData(data);
        }
        else if(root.getlChild() == null){
            binTreeNode n = new binTreeNode(data);

        }
    }

    public void initilize(Array arr){
        for (int i = 0; i < Array.getLength(arr); i++) {

        }
    }
}
