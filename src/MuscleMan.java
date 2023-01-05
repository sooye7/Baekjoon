import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class MuscleMan {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        List<Long> list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(Long.parseLong(st.nextToken()));
        long m=0;
        Collections.sort(list);
        if(n%2!=0)
            m=list.remove(n-1);
        while(!list.isEmpty()){
            m=Math.max(m, list.get(0)+list.get(list.size()-1));  // 양끝의 합
            list.remove(0);
            list.remove(list.size()-1);
        }
        System.out.println(m);
    }
}
