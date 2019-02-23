import java.util.Scanner;
class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, i = 0;
        String str[] = new String[100];
        while(true){
            str[count] = sc.nextLine();
            if(str[count].equals("done")){
                break;
            }
            count++;
        }

        for(i = 0 ; i <= count-1 ; i++)
            System.out.print(" " + str[i]);

        for(i = 0 ; i <= count-1 ; i++){
            if(str[i].charAt(0) == str[i].charAt(str[i].length()-1))
                System.out.println("\nFirst and last Character of word '" + str[i] + "' are same");
        }
    }
}

