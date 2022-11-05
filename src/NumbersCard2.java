import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumbersCard2 {
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=Integer.parseInt(st.nextToken());

        int M=Integer.parseInt(br.readLine());

        // 이진탐색 위한 오름차순 정렬
        Arrays.sort(arr);

        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<M;i++){
            int result=BinarySearch(Integer.parseInt(st.nextToken()));
            if(result!=-1)
                System.out.print(1+" ");
            else
                System.out.print(0+" ");
        }

    }
    private static int BinarySearch(int target){
        int left=0;
        int right=arr.length-1;
        int mid;

        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]<target)
                left=mid+1;
            else if(arr[mid]>target)
                right=mid-1;
            else
                return mid;
        }
        // 찾지 못한 경우
        return -1;
    }
}
