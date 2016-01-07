package practice;

import java.io.IOException;

public class Main {
    public static void main(String args[])throws IOException {
        System.out.println("Hello World");
    }

    static void ropeCon(){
        int[] ropes = {10,9,6,4,2};
        RopeConnector RCon = new RopeConnector();
        RCon.setRopes(ropes);
        RCon.startConnecting();
    }
}
