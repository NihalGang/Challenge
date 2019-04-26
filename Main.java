package com.challenge;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BigInteger []ans=new BigInteger[2];
    public static boolean checkConatinsFour(BigInteger bigNum)
    {
        if(String.valueOf(bigNum).contains("4"))
        {
            return false;
        }
        return true;
    }
    public static BigInteger  [] getTwoNumber(BigInteger bigNum)
    {
        BigInteger first=bigNum.divide(BigInteger.valueOf(2));
        BigInteger Second=bigNum.subtract(first);
        while(true)
        {
            if(checkConatinsFour(first)&&checkConatinsFour(Second))
            {
                ans[0]=first;
                ans[1]=Second;
                return ans;
            }
            else
            {
                BigInteger temp=bigNum.subtract(Second);
                if(!temp.equals("0"))
                {
                    first= first.subtract(BigInteger.valueOf(1));
                    Second=Second.add(BigInteger.valueOf(1));
                }
                else
                {
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger bigNum=sc.nextBigInteger();
        BigInteger[] ansNum=Main.getTwoNumber(bigNum);
        System.out.println("first number is "+ans[0]+",Second number is "+ans[1]);
    }
}