import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostUsedAlphabet {
    public static void maxCntAlphabet(String s){
        String str=s.toUpperCase();
        char c='A';
        int max=0;
        char alph=' ';
        for(int i=0;i<26;i++){
            int count=0;
            if(str.contains(String.valueOf((char)c))){
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j)==c)
                        count++;
                }
            }
            if(max==count){
                alph='?';
            }
            else{
                if(max<count){
                    alph=c;
                    max=count;
                }
            }
            c++;
        }
        System.out.println(alph);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        maxCntAlphabet(s);
    }
}
