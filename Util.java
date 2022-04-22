public class Util {

    public static void Question(int[] numbers){
        System.out.print("Write a number between " + numbers[0] + " and " + numbers[numbers.length - 1] + " : ");
    }

    public static void Question(int [] numbers, boolean isRightSide){
        if(isRightSide){
            System.out.print("RIGHT SIDE! Write a number between " + numbers[0] + " and " + numbers[numbers.length - 1] + " : ");
        }else{
            System.out.print("WRONG SIDE! Write a number between " + numbers[0] + " and " + numbers[numbers.length - 1] + " : ");
        }
    }   
}