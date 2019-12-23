package com.company;


import java.util.Scanner;

//Программа, которая по введенной строке вычисляет номера слов, имеющих длину 3
public class String2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st, result = "Result: ";
        int PodschetChisel = 0, wordsCount = 0;

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

        for (int i = 0; i <st.length(); i++)
        {

            if (st.charAt(i) != ' ')
                PodschetChisel++;
            else
            {
                wordsCount++;

                if (PodschetChisel == 3)
                    result = result.concat(wordsCount + " ");

                PodschetChisel = 0;
            }

            if ( i+1 >= st.length() && PodschetChisel == 3)
            {
                wordsCount++;
                result = result.concat(wordsCount + " ");
            }

        }

        System.out.println(result);

    }

}