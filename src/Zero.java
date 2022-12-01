import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Zero {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Deque<Integer> stack=new ArrayDeque<>();
        int sum=0;

        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            if(num==0)
                stack.pollLast();
            else
                stack.offer(num);
        }
        while(!stack.isEmpty()){
            sum+=stack.pollLast();
        }
        System.out.println(sum);
    }
}
