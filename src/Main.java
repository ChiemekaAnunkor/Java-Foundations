import java.util.Arrays;

public class Main {


    static void findTheRange(int[] arr) {
//        System.out.println(Arrays.toString(arr));
        int lowerNumber = arr[0];
        int higherNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowerNumber) {
                lowerNumber = arr[i];
            }
            if (arr[i] > higherNumber) {
                higherNumber = arr[i];
            }
        }

        System.out.println("high:" + higherNumber + " low:" + lowerNumber);

    }

    public static void main(String[] args) {
//        int test = 100000;
//        float fl = 3.22F;
//        byte p = 30;
//        fl = fl / 100 * 12;
//        int s = p * 12;
//        double rslt = test * fl;
//
//        System.out.println(((rslt * s) + test) / 360);
//
////        System.out.println(Math.pow(rslt, p));
//
//
////        Scanner scanner = new Scanner(System.in);
////        // add new input
////        System.out.print("Enter Principal: ");
////        int principal = scanner.nextInt();
////        System.out.print("Enter Annual Rate: ");
////        float annualRate = scanner.nextFloat();
////        System.out.print("Enter number of years: ");
////        byte period = scanner.nextByte();
////
////
////        NumberFormat mortgage = NumberFormat.getCurrencyInstance();
////        String myFinalMortage = mortgage.format(principal);
////
////        //results outputs
////        System.out.println("Principal:" + principal);
////        System.out.println("Principal:" + annualRate);
////        System.out.println("Principal:" + period);
////        System.out.println("Mortgage: " + myFinalMortage);


        //conditional logic

//        Scanner s = new Scanner(System.in);
//        System.out.print("enter a number: ");
//        int enteredNumber = s.nextInt();
//        if (enteredNumber % 3 == 0 && enteredNumber % 5 == 0) {
//            System.out.println("fizzBuz");
//        } else if (enteredNumber % 3 == 0) {
//            System.out.println("fizz");
//
//        } else if (enteredNumber % 5 == 0) {
//            System.out.println("buzz");
//        } else
//            System.out.println(enteredNumber);
        findTheRange(new int[]{1, 2, 3, 4, 4, 5});

    }


}


