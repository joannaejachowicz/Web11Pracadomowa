import java.util.ArrayList;
import java.util.Arrays;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2));
        for(int i=0; i < list.size() - 1; i++){
            if(list.get(i) == 2){
                list.add(i+1, 5);
            }
        }

        System.out.println(Arrays.toString((list.toArray())));


    }

}
