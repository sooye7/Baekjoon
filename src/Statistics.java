import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Statistics {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());

        // 산술평균
        long sum=0;
        for(int a:arr)
            sum+=a;
        long avg=Math.round(sum/(double)n);

        // 중앙값
        Arrays.sort(arr);
        int mid=arr[(int)n/2];

        // 최빈값(여러 개일 경우 두번 째로 작은 값)
        Map<Integer, Integer> map=new HashMap<>();
        int mode=0;
        for(int a:arr)
            map.put(a, map.getOrDefault(a,0)+1);
        List<Map.Entry<Integer,Integer>> list=new LinkedList<>(map.entrySet());
        // 값 기준 정렬
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue()==o2.getValue())
                    return o1.getKey()-o2.getKey();
                return o2.getValue()-o1.getValue();
            }
        });
        if(n!=1&&list.get(0).getValue()==list.get(1).getValue())
            mode=list.get(1).getKey();
        else
            mode=list.get(0).getKey();

        // 범위
        int range=arr[n-1]-arr[0];

        // 전체 출력
        System.out.println(avg);
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(range);
    }
}
