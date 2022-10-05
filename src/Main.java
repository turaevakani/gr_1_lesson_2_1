import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                System.out.println( valueOfTem (30,-18 ));
                System.out.println( valueOfTem (5,21 ));
                System.out.println( valueOfTem (19,33 ));
                System.out.println( valueOfTem (65,-5 ));
                System.out.println( valueOfTem (2,-21 ));

            }

            public static String valueOfTem( int age, int temperature){
                if (age>=20 && age<=45 && temperature>=-20 && temperature<=30) {
                    return "Можно идти гулять";
                }
                else if (age<=20  && temperature>=0 && temperature<=28){
                    return "Можно идти гулять";
                }
                else if (age>=45  && temperature>=-10 && temperature<=45){
                    return "Можно идти гулять";
                }
                else{
                    return "Оставайтесь дома";
                }

            }
    public static int generateRandomAge(){
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("random int is: " + num);
        return num;
    }

}