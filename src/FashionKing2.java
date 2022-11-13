import java.util.*;
import java.io.*;

public class FashionKing2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int b = Integer.parseInt(br.readLine());
            for (int j = 0; j < b; j++) {
                String type = br.readLine().split(" ")[1];
                map.put(type,map.getOrDefault(type,0)+1);
            }
            int x = 1;
            for (int y : map.values()) {
                x *= y + 1;
            }
            System.out.println(x-1);

        }
    }
}