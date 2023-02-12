import java.util.Scanner;
public class Sayiortalama {
    public static void main (String[] args) {
        int k,n=-1, ort,top=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        k= inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 ==0) {
                top+=i;
                n++;
            }
        }
        ort = (top)/n ;
        System.out.println(ort);
    }
}
