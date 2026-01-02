public class IntToBin {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
    }

    public static String toBinary(int x) {
        if (x == 0 || x == 1){
            return "" + x;
        }
        return toBinary(x / 2) + (x % 2);
    }    
 }
