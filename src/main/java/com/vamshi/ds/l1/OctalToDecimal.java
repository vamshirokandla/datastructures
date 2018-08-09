package com.vamshi.ds.l1;

import java.awt.*;

public class OctalToDecimal {

    public static void main(String[] args) {
        OctalToDecimal o2d = new OctalToDecimal();
        o2d.convertToDecimal("0");
        o2d.convertToDecimal("1");
        o2d.convertToDecimal("5");
        o2d.convertToDecimal("17");
        o2d.convertToDecimal("17");

    }

    public int convertToDecimal(String octal) {

        int convertion =1;

        int result =0;

        for(int index=1;index <= octal.length();index++){
            int digit = Integer.parseInt(octal.charAt(octal.length()-index)+"");

            System.out.printf("digit %s, convertion %s %n",digit,convertion);

            result += (digit)*convertion;
            convertion = convertion * 8;
        }

        System.out.println("Returnign result: "+result);
        return result;
    }

    public void distanceBetweenPlanes(){
        Point p = new Point();


    }
}
