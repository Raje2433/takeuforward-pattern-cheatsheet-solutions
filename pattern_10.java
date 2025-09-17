import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int stars = 1;
        for(int i=1;i<=(2*rows-1);i++){
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i>rows-1){
                stars--;
            }
            else{
                stars++;
            }
            System.out.println();
        }
    }
}
