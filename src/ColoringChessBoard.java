import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColoringChessBoard {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int row=Integer.parseInt(st.nextToken());
        int col=Integer.parseInt(st.nextToken());
        boolean wCheck=true;
        int count=0;
        StringBuilder sb=new StringBuilder(br.readLine());
        wCheck= sb.charAt(0) == 'W';
        for(int j=0;j<col-1;j++){
            System.out.println(sb);
            if(wCheck&&sb.charAt(0)=='W') {
                count++;
                sb.replace(0,1,"B");
            }
            else if(!wCheck&&sb.charAt(0)=='B'){
                count++;
                sb.replace(0,1,"W");
            }
            if(sb.charAt(j)==sb.charAt(j+1)) {
                count++;
                if(sb.charAt(j+1)=='W')
                    sb.replace(j+1,j+2,"B");
                else
                    sb.replace(j+1,j+2,"W");
                j++;
            }
        }
        for(int i=0;i<row-1;i++){
            StringBuilder sb2=new StringBuilder(br.readLine());
            System.out.println();
            System.out.println("i"+i);
            for(int j=0;j<col-1;j++){
                System.out.println(sb2);
                System.out.println(j);
                if(wCheck&&sb2.charAt(0)=='W') {
                    count++;
                    sb2.replace(0,1,"B");
                }
                else if(!wCheck&&sb2.charAt(0)=='B'){
                    count++;
                    sb2.replace(0,1,"W");
                }
                if(sb2.charAt(j)==sb2.charAt(j+1)) {
                    count++;
                    if(sb2.charAt(j+1)=='W')
                        sb2.replace(j+1,j+2,"B");
                    else
                        sb2.replace(j+1,j+2,"W");
                }
            }
            wCheck= sb2.charAt(0) == 'W';
        }
        System.out.println(count);
    }
}
