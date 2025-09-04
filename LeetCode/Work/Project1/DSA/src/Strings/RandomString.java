/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Random;
import org.apache.commons.lang.math.JVMRandom;

/**
 *
 * @author SOFTWARE
 */
public class RandomString {

    static String generate(int size) {
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomchar = 97 + (int) (random.nextFloat() * 26);
            sb.append((char) randomchar);
        }
        return sb.toString();
    }
}
