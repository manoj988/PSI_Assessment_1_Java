import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class large{
    public static void main(String[] args) {
        int k=3;
        int[] arr={1,4,17,7,25,3,100};
        List<Integer>li=new ArrayList<>();        //adding elements to list from array
        for(int i:arr){
            li.add(i);
        } 
        Collections.sort(li);				      // sort the array
        Collections.reverse(li);     //reverse the array which is sorted
		
        //System.out.printf("%d ",k);
        for(int i=0;i<k;i++){
            System.out.print(li.get(i)+" ");   // print largest k elements
        }
    }
}