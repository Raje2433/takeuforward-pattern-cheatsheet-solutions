import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int stars = 1;
        int spaces = rows-1;
        for(int i=1;i<=2*rows;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=stars;k++){
                System.out.print("*");
            }
            if(i<rows){
                spaces--;
                stars+=2;
            }
            else{
                spaces++;
                stars-=2;
            }
            System.out.println();
        }
    }
}
