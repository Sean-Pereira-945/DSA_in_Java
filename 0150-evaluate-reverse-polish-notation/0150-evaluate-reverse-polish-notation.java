import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        int n = tokens.length;
        // if(isEmpty(tokens)) return -1;
        if(tokens.length >= 3){
            for(int i=0; i<n; i++){

                if(tokens[i].equals("*")|| tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") ){
                    
                        int z= 0;
                        int v1 = Integer.parseInt(st.pop());
                        
                        int v2 = Integer.parseInt(st.pop());
                        
                        if(tokens[i].equals("*")){
                            z = v1 * v2;
                        }
                        else if(tokens[i].equals("+")){
                            z = v1 + v2;
                        }
                        else if(tokens[i].equals("-")){
                            z = v2 - v1;
                        }
                        else if(tokens[i].equals("/")){
                            z = v2 / v1;
                            
                        }

                        st.push(Integer.toString(z));
                    
                    
                }
                else{
                    st.push(tokens[i]);
                }

            }

        }
        else{
            return Integer.parseInt(tokens[n-1]);
        }
        return Integer.parseInt(st.pop());

    }
}