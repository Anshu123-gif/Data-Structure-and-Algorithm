package stack;
import java.util.Stack;

public class infix {
    public static void main(String[] args) {

        String str = "9-5+3*4/6";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int ascii = (int) ch;

            // digit
            if(ascii >= 48 && ascii <= 57){
                val.push(ch - '0');
            }

            // operator
            else{
                if(op.size() == 0){
                    op.push(ch);
                }
                else{

                    // ch is + or -
                    if(ch == '+' || ch == '-'){

                        // work all previous operators (*,/,+,-)
                        while(op.size() > 0){
                            int v2 = val.pop();
                            int v1 = val.pop();
                            char opr = op.pop();

                            if(opr == '+') val.push(v1 + v2);
                            if(opr == '-') val.push(v1 - v2);
                            if(opr == '*') val.push(v1 * v2);
                            if(opr == '/') val.push(v1 / v2);
                        }

                        op.push(ch);
                    }

                    // ch is * or /
                    else if(ch == '*' || ch == '/'){

                        // work only * and /
                        while(op.size() > 0 && (op.peek() == '*' || op.peek() == '/')){
                            int v2 = val.pop();
                            int v1 = val.pop();
                            char opr = op.pop();

                            if(opr == '*') val.push(v1 * v2);
                            if(opr == '/') val.push(v1 / v2);
                        }

                        op.push(ch);
                    }

                }
            }

        }

        // end calculation
        while(op.size() > 0){
            int v2 = val.pop();
            int v1 = val.pop();
            char opr = op.pop();

            if(opr == '+') val.push(v1 + v2);
            if(opr == '-') val.push(v1 - v2);
            if(opr == '*') val.push(v1 * v2);
            if(opr == '/') val.push(v1 / v2);
        }

        System.out.println(val.peek());
    }
}
