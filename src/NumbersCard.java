import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumbersCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<N;i++) {
            //list.add(Integer.parseInt(st.nextToken()));
            map.put(Integer.parseInt(st.nextToken()),0);
        }
        int M=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<M;i++) {
            if(map.containsKey(Integer.parseInt(st.nextToken())))
                System.out.print(1+" ");
            else
                System.out.print(0+" ");
        }
    }
}
