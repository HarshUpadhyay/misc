package practice;

import java.util.*;

/**
 * Created by harsh on 10/6/14.
 */
public class myUtils {
    static boolean isOperand(Character literal){
        return (('a'<=literal && literal<='z') || ('A'<=literal && literal<='Z'));
    }
    static String infixToPostfix(String exp) {
        myStack s = new myStack();
        String postfix = "";
        for (int i = 0; i < exp.length(); i++) {
            Character literal = exp.charAt(i);
            if (myUtils.isOperand(literal)) {
                postfix += literal;
            } else if (literal == '(') {
                s.push(literal);
            } else if (literal == ')') {
                try {//this will throw a NullPtr exception if paranthesis aren't balanced
                    while ((Character) s.peek() != '(') {
                        postfix += (Character) s.pop();
                    }
                }catch (NullPointerException E) {
                    System.out.println("Illegal expression entered.\nDid you perhaps forgot to match parenthesis?");
                    return ("encountered error with expression parsing");
                }
                s.pop();
            } else {
                while (!s.isEmpty() && myUtils.getPrecedence(literal) <= myUtils.getPrecedence((Character) s.peek())) {
                    postfix += (Character) s.pop();
                }
                s.push(literal);
            }
        }
        while (!s.isEmpty() && s.peek() != (Object)'('){
            postfix += s.pop();
        }
        if(s.isEmpty())
            return postfix;
        else{
            System.out.println("Illegal expression entered.\nDid you perhaps forgot to match parenthesis?");
            return ("encountered error with expression parsing");
        }

    }
    static int getPrecedence(Character literal){
        if (literal == null) {
            return -1;
        }
        switch (literal){
            case '+': case '-': return  1;
            case '*': case '/': return  2;
            case '^':           return  3;
            default :           return -1;
        }
    }
    static void spiralMatrix(){
        int[][] m = {{1,2,3,4,5},
                     {14,15,16,17,6},
                     {13,20,19,18,7},
                     {12,11,10,9,8}};
        int fr,lr,fc,lc;
        fr = 0;
        lr = m.length-1;
        fc = 0;
        lc = m[0].length-1;
        while(fr<lr && fc<lc ){
            for (int i = fc; i <= lc ; i++) {//top left->right
                System.out.print(m[fr][i] + ",");
            }
            fr++;
            for (int i = fr; i <= lr ; i++) {//right top->bottom
                System.out.print(m[i][lc] + ",");
            }
            lc--;
            for (int i = lc; i >=fc ; i--) {//bottom right->left
                System.out.print(m[lr][i] + ",");
            }
            lr--;
            for (int i = lr; i >=fr ; i--) {//left bottom->top
                System.out.print(m[i][fc] + ",");
            }
            fc++;
        }
    }

    public static void isdupe(int i) {
        int a[] = {1,34,56,23,345,45,2,5,1,90,46,45,0};
        if(i<a.length){
            HashSet<Integer> map = new HashSet<Integer>();
            for (int j = 0; j < a.length; j++) {
                if( map.contains(a[j])) {
                    System.out.println("Dupes found");
                    break;
                }
                    else{
                    map.add(a[j]);
                    if(j>=i) map.remove(a[j-i]);
                }
            }
            System.out.println("No dupes closer than given range.");
        }
        else System.out.println("sorry we can't have distance more than/equal to array size");
    }

    public static String flipWords(String sentence){
        myStack s = new myStack();
        int len = sentence.length();
        String revS = "";
        for(int i=0; i< len; i++){
            char c = sentence.charAt(i);
            if(Character.isLetterOrDigit(c)){
                s.push(c);
            }
            else{
                while(!s.isEmpty()) revS += s.pop();
                revS += c;
            }
        }
        while(!s.isEmpty()) revS += s.pop();
        return revS;
    }

    public static String flipWordOrder(String sentence) {
        Deque<Character> s = new ArrayDeque<Character>();
        String revS = "";
        for(int i=sentence.length() - 1; i>= 0; i--){
            char c = sentence.charAt(i);
            if(Character.isLetterOrDigit(c)) s.push(c);
            else{
                while(!s.isEmpty()) revS += s.pop();
                revS += c;
            }
        }
        while(!s.isEmpty()) revS += s.pop();
        return revS;
    }
}
