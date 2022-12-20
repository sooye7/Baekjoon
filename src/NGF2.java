import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NGF2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque=new ArrayDeque<>();
        int n=Integer.parseInt(br.readLine());
        int[] count=new int[1000001];
        int[] index=new int[n];
        int[] answer=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        for(int i=0;i<n;i++){
            index[i]=Integer.parseInt(st.nextToken());
            count[index[i]]++;
        }
        for(int i=0;i<n;i++){
            while(!deque.isEmpty()&&count[index[i]]>count[index[deque.peekLast()]]){
                answer[deque.pollLast()]=index[i];
            }
            deque.offerLast(i);
        }
        while(!deque.isEmpty()){
            answer[deque.pollLast()]=-1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(answer[i] + " ");
        }
        System.out.println(sb.toString());

    }
}
