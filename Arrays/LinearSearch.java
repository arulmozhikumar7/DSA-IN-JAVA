public class LinearSearch{
    public static void main(String args[]){
        int arr[] = {12, 11, 13, 5, 6, 7};
        int x = 1; //Target Element
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("index of "+x+" is "+i);
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Element not found");
        }

    }
}