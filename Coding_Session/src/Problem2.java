
public class Problem2 {
    public static int secondLargestElement(int[] arr){
    	int largestElement = arr[0];
    	for(int i=1;i<arr.length;i++){
    		if(largestElement<arr[i]){
    			largestElement = arr[i];
    		}
    	}
    	int secondLargest =0;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]>secondLargest && arr[i]<largestElement)
    	    secondLargest = arr[i];
    	}
    	return secondLargest;
    }
	public static void main(String[] args) {
		int[] arr = {4,10,7,9,1,2};
       System.out.println(secondLargestElement(arr));
	}

}
