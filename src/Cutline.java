import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Cutline {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int N=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] arr=new int[N];
        st=new StringTokenizer(br.readLine()," ");
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++)
            list.add(Integer.parseInt(st.nextToken()));
        // 내림차순 정렬
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list.get(k-1));
    }
}
