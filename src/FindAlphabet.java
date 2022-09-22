import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet {
    public static void findIndexOfStr(String s){
        char c='a';
        for(int i=0;i<26;i++){
            System.out.print(s.indexOf((char)c++)+" ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        findIndexOfStr(s);
    }
}
