import java.util.Scanner;

public class CheckBit{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number !!! ");
        int number=scanner.nextInt();
        System.out.println("Enter the bit to check !!! ");
        int bitPos=scanner.nextInt();

        int isSet=isSetCheck(number,bitPos);
        System.out.println(isSet);
    }

    private static int isSetCheck(int number, int bitPos) {
        if((number & (1<<bitPos))==0){
            return 0;
        }
        else{
            return 1;
        }
    }
}