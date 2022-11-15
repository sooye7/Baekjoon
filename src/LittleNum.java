import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LittleNum {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine(), " ");
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(st.nextToken());
            if(num<x)
                list.add(num);
        }
        for(int l:list)
            System.out.print(l+" ");
    }
}
