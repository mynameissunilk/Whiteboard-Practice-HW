/**
 * Created by sunil on 7/6/16.
 */
public class Question1 {

    String input;

    public static void main(String[] args){

        /** Question 1 **/
        String s = "KANGAROO";
        System.out.println(doubleChar(s));

        /** Question 2 **/
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));

        int[] taco = {1,2,3};
        rotateLeft3(taco);

        fix23(taco);
    }

    /** Question 1 **/
    public static String doubleChar(String s){
        // concatenate chars for each indiv. instance of a given char
        String concat = "";
        for(int i = 0; i <= s.length()-1; i++ ) {
            concat = concat + s.charAt(i) + s.charAt(i);
        }
        return concat;
    }

    /**  Question 2 **/
    public static boolean cigarParty(int n, boolean b){
        int numcigars = n;
        boolean isWeekend = b;

        if(numcigars >= 40 && numcigars <=60 && !isWeekend)
            return true;
        else if (numcigars >= 40 && isWeekend)
            return true;
        else return false;
    }

    /** Question 3 **/
    public static void rotateLeft3(int[] a){

        int[] shifted = new int[]{a[1], a[2], a[0]};
        for(int i= 0; i <=shifted.length-1; i++)
            System.out.print(shifted[i] + " ");
    }

    /** Question 4 **/
    public static void fix23(int[] arr){
        if(arr[0] == 2 && arr[1] == 3){
            arr[1] = 0;
        }
        else if (arr[1] == 2 && arr[2] == 3){
            arr[2] = 0;
        }
        for(int i = 0; i <=arr.length; i ++)
            System.out.print(arr[i] + " ");
    }


}

