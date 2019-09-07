/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationpractice;

import java.util.*;

/**
 *
 * @author mantoo
 */
 class HashMap1 {
    public static void main(String[] args) {
//        System.err.println("hello jii===");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String n1=sc.next();
            String n2=sc.next();
            char[] str1=n1.toCharArray();
            HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
            for(char c:str1){
                if(hm.containsKey(c)){
                    hm.put(c,hm.get(c)+1);
                }else{
                    hm.put(c,1);
                }
            }
            for (Map.Entry entry : hm.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        }
        }
    }
    
}
