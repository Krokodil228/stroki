import java.util.Scanner;

public class Main {

    public static void one(String str){
        char[] b = {
                'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю'
        };
        String[] words = str.split(" ");
        int counter = 0;

        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < b.length; j++){
                if (words[i].charAt(0) == b[j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static void two(String str){
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++){
            if (words[i].length() == 3){
                System.out.println(i + 1);
            }
        }
    }

    public static void three(String str){
        String[] words = str.split(" ");
        int max = words[0].length();
        int idx = 0;
        for (int i = 0; i < words.length; i++){
            if ( max <= words[i].length()){
                idx = i + 1;
           }
        }
        System.out.println(idx);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        three(str);


    }
}
