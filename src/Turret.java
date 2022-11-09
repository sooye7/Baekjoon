import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int r1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());
            int r2=Integer.parseInt(st.nextToken());

            double d=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

            // 두 원의 교점이 류재명이 있는 위치
            // 아예 동일한 원
            if(x1==x2&&y1==y2&&r1==r2)
                System.out.println(-1);
            // 중심이 같고 반지름이 다른 원, 원 내부에서 만나지 않는 경우, 두 원이 외부에서 만나지 않는 경우
            else if(d>r1+r2||d==0&&r1!=r2||Math.abs(r1-r2)>d)
                System.out.println(0);
            // 외접, 내접
            else if(d==r1+r2||d==Math.abs(r1-r2))
                System.out.println(1);
            // 원이 두 점에서 만나는 경우
            else if(d<r1+r2||d>Math.abs(r1-r2))
                System.out.println(2);
        }

    }
}
