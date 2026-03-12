public class modulus.arrays.forloop.if {
    public static void main(String[] args){
        int arr[] = {2,6,8,10,11,21,13,14};
        int count = 0;
        for(int m=0;m<arr.length;m++){
            int temp=arr[m];
            if(temp%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
    
    
}
