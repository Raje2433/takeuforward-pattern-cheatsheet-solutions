import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        char letter = 'A';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(letter+" ");
                letter++;
            }
            letter = 'A';
            System.out.println();
        }
    }
}
