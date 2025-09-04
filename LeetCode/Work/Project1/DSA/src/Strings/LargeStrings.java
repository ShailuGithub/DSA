/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import static Strings.RandomString.generate;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author SOFTWARE
 */
public class LargeStrings {
    
    public static void main(String[] args) {

        //constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        //constructor 2
        StringBuffer sb2 = new StringBuffer("Shailesh");

        //constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        
        sb.append("WeMakeDevs");
        sb.append(" is nice!");
        //sb.insert(2, " ");

        sb.replace(1, 5, "shailesh");
        sb.delete(1, 5);
        //sb.reverse();
        String str = sb.toString();
        System.out.println(str);
        
        int n = 20;
        String name = generate(n);
        System.out.println(name);

        //removing spaces
        String sentence = "hi h  hjh jhhk sdf w";
        System.out.println(sentence);
        
        System.out.println(sentence.replaceAll("\\s", ""));

        //split
        String arr = "shailesh,rahul,abhi";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));
        
        //rounding off
        DecimalFormat df=new DecimalFormat("0.000");
        System.out.println(df.format(7.2));
    }
    
}
