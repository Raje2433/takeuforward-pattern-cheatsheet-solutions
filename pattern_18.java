import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        char letter = 'A';
        letter = (char)(letter+rows-1);
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(letter+" ");
                letter++;
            }
            letter = (char)(letter-i-1);
            System.out.println();
        }
    }
}
