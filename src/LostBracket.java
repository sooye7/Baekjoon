import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LostBracket {
    static boolean[] visited;
    static List<Character> op;
    static List<Integer> num;
    static int min=Integer.MAX_VALUE;
    static int[] arr;
    static char[] opOrder;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String modification=br.readLine();
        op=new ArrayList<>();
        num=new ArrayList<>();

        int m=0;
        for(int i=0;i<modification.length();i++){
            if(!Character.isDigit(modification.charAt(i)))
                op.add(modification.charAt(i));
            else{
                int k=i;
                while(Character.isDigit(modification.charAt(k))) {
                    k++;
                    if(k>=modification.length())
                        break;
                }
                num.add(Integer.parseInt(modification.substring(i,k)));
                i=k-1;
            }
            visited=new boolean[op.size()];
            arr=new int[num.size()];
            opOrder=new char[op.size()];

//            System.out.println(op);
//            System.out.println(num);
        }
        dfs(0);
        System.out.println(min);
    }
    private static void dfs(int depth){
        if(depth==op.size()){
            int sum=0;
            for(int i=0;i<opOrder.length;i++)
                sum+=modify(arr[i],arr[i+1],opOrder[i]);
            min=Math.min(min, sum);
            System.out.println(sum);
            return;
        }

        for(int i=0;i<op.size();i++){
            if(!visited[i]){
                visited[i]=true;
                opOrder[depth]=op.get(i);
                arr[depth]=num.get(i);
                arr[depth+1]=num.get(i+1);
                dfs(depth+1);
                visited[i]=false;
            }
        }
    }

    private static int modify(int a, int b, char op){
        if(op=='+')
            return a+b;
        else
            return a-b;
    }
}
