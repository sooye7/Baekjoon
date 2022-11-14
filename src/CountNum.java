import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CountNum {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Map<Integer, Integer> map= new HashMap<>();
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++) {
            int num=Integer.parseInt(st.nextToken());
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int find=Integer.parseInt(br.readLine());
        System.out.println(map.getOrDefault(find,0));

    }
}
