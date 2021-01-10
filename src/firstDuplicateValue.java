import java.util.HashSet;

/**
 * Created on 10/Jan/2021 to First-Duplicate-Value
 */
public class firstDuplicateValue {

    private static void findDuplicate(int[] matrix){

        int repeat = -1;

        HashSet<Integer> set = new HashSet<>();

        for(int i = matrix.length - 1; i >= 0; i--){
            if(set.contains(matrix[i])){
                repeat = i;
            }
            else{
                set.add(matrix[i]);
            }
        }

        if(repeat != -1){
            System.out.println("The first repeating element is: " + matrix[repeat]);
        }
        else{
            System.out.println("There is no duplicate value");
        }

    }

    public static void main(String args[]){
        int[] matrix = {2,6,3,10,40,6,5,95,3,40};
        findDuplicate(matrix);
    }
}
