import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Bracket {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> stack=new ArrayDeque<>();
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char[] brackets=br.readLine().toCharArray();
            // '('이면 stack에 집어넣고 ')'이면 stack 사이즈 확인하고 pop
            for(char b:brackets){
                if(b=='(')
                    stack.offerLast(b);
                else{
                    if(!stack.isEmpty())
                        stack.pollLast();
                    else{
                        stack.offerLast(b);
                        break;
                    }
                }
            }
            if(stack.isEmpty())
                sb.append("YES").append("\n");
            else
                sb.append("NO").append("\n");
            stack.clear();
        }

        System.out.println(sb);

    }
}
