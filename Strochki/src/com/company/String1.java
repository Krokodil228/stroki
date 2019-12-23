package com.company;

import java.util.Scanner;

//Программа, которая по введенной сроке вычисляет число слов, начинающихся с гласной буквы.
public class String1 {
    public static String Bukvi = "аеёиоуыюя";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st;
        while(true)
        {
            try
            {
                System.out.println("Введите строку");
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
        st = st.toLowerCase();

        System.out.println("Result : " + findVowelsWords(st));

    }

    private static int findVowelsWords(String st)
    {
        int count = 0;
        if (Bukvi.contains(String.valueOf(st.charAt(0))))
            count++;

        for (int i = 1; i < st.length(); i++)
            if (st.charAt(i) == ' ' && Bukvi.contains(String.valueOf(st.charAt(i+1))))
                count++;

        return count;
    }
}
