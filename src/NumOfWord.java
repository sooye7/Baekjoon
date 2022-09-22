import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumOfWord {

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        if(s.isBlank())
            System.out.print(0);
        else
            System.out.print(s.trim().split(" ").length);
    }
}
