package practice;

import java.util.PriorityQueue;

/**
 * Created by harsh on 8/29/14.
 */
public class RopeConnector {
    private PriorityQueue ropes;

    public void setRopes(int[] ropes) {
        this.ropes = new PriorityQueue();
        System.out.println("INPUT: " + java.util.Arrays.toString(ropes));
        for (int i = 0; i < ropes.length ; i++) this.ropes.add(ropes[i]);
    }
    public void startConnecting(){
        while (ropes.size()>1){
            int t1 = (Integer)ropes.poll();
            int t2 = (Integer)ropes.poll();
            int t3;
            System.out.println("Step:" + t1 + " + " + t2 + " = " + (t3 = t1+t2));
            ropes.add(t3);
        }
    }
}
