import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int spaces = rows-1;
        int nletters = 1;
        for(int i=1;i<=rows;i++){
            char letter = 'A';
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nletters;k++){
                System.out.print(letter);
                if(k<i){
                    letter++;
                }
                else{
                    letter--;
                }
            }
            spaces--;
            nletters+=2;
            System.out.println();
        }
    }
}
