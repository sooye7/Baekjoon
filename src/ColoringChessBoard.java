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
        for(int i=0;i<row;i++){
            String str=br.readLine();
            if(str.charAt(0)=='W')
                wCheck=true;
            else
                wCheck=false;
            for(int j=0;j<col-1;j++){
                if(wCheck&&str.charAt(0)=='W') {
                    count++;
                    str=str.replaceFirst("W","B");
                }
                else if(!wCheck&&str.charAt(0)=='B'){
                    count++;
                    str=str.replaceFirst("B","W");
                }
                if(str.charAt(j)==str.charAt(j+1)) {
                    count++;
                    j++;
                }
            }
        }
        System.out.println(count);
    }
}
