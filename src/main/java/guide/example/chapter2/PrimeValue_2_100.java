package guide.example.chapter2;

public class PrimeValue_2_100 {
    public static void main(String[] args) {
        for (int i = 1; i < 100 + 1; i++) {
            if ((i==2)||(i==3)||(i==5)||(i==7)){
                System.out.println(i);
            }else if ((i!=1)&&(i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0)){
                System.out.println(i);
            }
        }
    }
}
