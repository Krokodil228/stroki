package com.company;

import java.util.Scanner;

//Программа, которая по введенной строке вычисляет последнее слово максимальной длины.
public class String3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MaxBukvi = 0, lettersCount = 0;
        String st;

        while(true)
        {
            System.out.println("Введите строку");
            try
            {
                st = sc.nextLine();
                break;
            }
            catch(Exception e)
            {
                continue;
            }
        }
        sc.close();
        st = st.trim();

        String result = "Result: ";

        for (int i = 0; i <st.length(); i++)
        {

            if (st.charAt(i) != ' ')
                lettersCount++;
            else
            {

                if (lettersCount >= MaxBukvi)
                {
                    result = GetWordByIndex(st, i, lettersCount);
                    MaxBukvi = lettersCount;
                }
                lettersCount = 0;
            }

            if ( i+1 >= st.length() && lettersCount >= MaxBukvi)
                result = GetWordByIndex(st, i+1, lettersCount);
        }

        System.out.println(result);


    }

    public static String GetWordByIndex(String st, int index, int length)
    {
        String result = "";
        if (index-length<0)
            return result;
        for(int i = index-length; i<st.length() && length>0; i++)
        {
            result = result.concat(String.valueOf(st.charAt(i)));
            length--;
        }

        return result;
    }


}