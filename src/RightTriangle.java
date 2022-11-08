import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class RightTriangle {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int[] len=new int[3];
            int max=0,maxIndex=0;
            int sum=0,result=0;
            for(int i=0;i<3;i++){
                len[i]=Integer.parseInt(st.nextToken());
//                if(max<len[i]){
//                    max=len[i];
//                    maxIndex=i;
//                }
            }
            Arrays.sort(len);
            if(len[0]==0&&len[1]==0&&len[2]==0)
                break;
            if(Math.pow(len[0],2)+Math.pow(len[1],2)== Math.pow(len[2],2))
                System.out.println("right");
            else
                System.out.println("wrong");
//            for(int i=0;i<3;i++){
//                if(maxIndex!=i)
//                    sum+=Math.pow(len[i],2);
//                else
//                    result=(int)Math.pow(len[i],2);
//            }
//            if(sum==result)
//                System.out.println("right");
//            else
//                System.out.println("wrong");
        }

    }
}
