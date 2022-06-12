package text;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Tw{
    public static void main(String[] args) {
       

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        ArrayList<Integer> arr = new ArrayList<Integer>();

    
        String[] numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int index=0;
        
            for(String j:numbers){
                for(int i=0;i<4;i++){
                    hm.put(index, j);
                    arr.add(index);
                    index++;
                }
               
            }
        

        Collections.shuffle(arr);



        TreeSet<Integer> a1 = new TreeSet<Integer>();
        TreeSet<Integer> a2 = new TreeSet<Integer>();
        TreeSet<Integer> a3 = new TreeSet<Integer>();
        TreeSet<Integer> a4 = new TreeSet<Integer>();

        


        for(int i=0;i<8;i++){
            int x = arr.get(i);
            if(i<2){
                a1.add(x);
            }else if(i<4){
                a2.add(x);
            }else if(i<6){
                a3.add(x);
            }else {
                a4.add(x);
            }
        }

        
            
            Look("玩家1",a1,hm);
            
            Jia("玩家1",a1,hm,arr);
            
            
            
           
            Look("玩家2",a1,hm);
            Jia("玩家2",a2,hm,arr);
            Look("玩家3",a1,hm);
            Jia("玩家3",a3,hm,arr);
            
            Look("玩家4",a1,hm);
            Jia("玩家4",a4,hm,arr);




    }

    public static void Look(String name,TreeSet<Integer> a,HashMap<Integer,String> b){
        
        System.out.println(name+"的点数是");
        int sum=0;
        for(Integer i : a){
            String s= b.get(i);
            sum+=Integer.parseInt(s);
        }
        System.out.print(sum);
        System.out.println();
        
    }

    public static void Jia(String name,TreeSet<Integer> a,HashMap<Integer,String> b,ArrayList<Integer> c){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.继续 2.不继续 3.弃牌");
        System.out.println("请选择");
        int n = sc.nextInt();
        int t =8;
    
        
        switch (n) {
            case 1:
                int x = c.get(t);
                Look("玩家1", a, b);
                t++;
                break;
            case 2:
                return;
            default:
                break;
        }

    }
}