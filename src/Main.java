

public class Main {

        public static void main(String[] args) {

                try {
                        System.out.println("Делим число на ноль");
                        
                } catch (ArithmeticException e){
                        System.out.println("Перешело в блок catch, так как на 0 делить нельзя");
                }


        }
}

