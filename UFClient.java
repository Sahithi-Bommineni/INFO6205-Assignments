package edu.neu.coe.info6205.union_find;

//import java.util.Random;
import java.util.Scanner;

public class UFClient {
        public static int count(int n){
            UF_HWQUPC uf = new UF_HWQUPC(n);
            //Random r = new Random();
            int connections=0;
            while(connections<n-1){
                int p=(int) (Math.random() * n);
                int q=(int) (Math.random() * n);
                if(!uf.connected(p,q)){
                    connections++;
                    uf.union(p,q);
                }
            }
            return connections;
        }
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter n value: ");
            int n= s.nextInt();
            int connections =  count(n);
            System.out.println("No of connections:"+connections);
        }
}
