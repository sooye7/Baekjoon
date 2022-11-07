import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourthPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int xx=0,yy=0;
        int[] x=new int[3];
        int[] y=new int[3];
        for(int i=0;i<3;i++){
           StringTokenizer st=new StringTokenizer(br.readLine()," ");
           x[i]=Integer.parseInt(st.nextToken());
           y[i]=Integer.parseInt(st.nextToken());
        }
        if(x[0]==x[1])
            xx=x[2];
        else if(x[0]==x[2])
            xx=x[1];
        else
            xx=x[0];
        if(y[0]==y[1])
            yy=y[2];
        else if(y[0]==y[2])
            yy=y[1];
        else
            yy=y[0];
        System.out.println(xx+" "+yy);
    }
}
