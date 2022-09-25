import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet {
    public static String[] croatiaAlph={"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int count=0;
        for(int i=0;i<croatiaAlph.length;i++){
            if(s.contains(croatiaAlph[i])) {
                s=s.replaceAll(croatiaAlph[i]," ");
            }
        }
        System.out.println(s.length());
    }
}
