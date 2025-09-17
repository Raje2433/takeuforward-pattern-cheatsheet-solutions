import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=(rows-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
