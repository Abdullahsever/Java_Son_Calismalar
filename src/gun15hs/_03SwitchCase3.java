package gun15hs;

import java.util.Scanner;

public class _03SwitchCase3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int gun = sc.nextInt();

        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("haftaici");
                break;
            default:            // default en sonda olursa break; yazmaya ihtiyac yoktur.
                System.out.println("haftasonu");
        }


    }
}
