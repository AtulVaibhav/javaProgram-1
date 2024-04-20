
public class Problem1 {
    public static int peakElement(int[] arr){
    	if(arr.length==0)return -1;
    	if(arr.length==1) return 0;
    	if(sortedInIncreasingOrder(arr)) return arr.length-1;
        if(sortedInDecreasingOrder(arr)) return 0;
    	
    	for(int i=1;i<arr.length-1;i++){
    		if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
    			return i;
    		}
    	}
      return 0;
    }
	private static boolean sortedInDecreasingOrder(int[] arr) {
		boolean isSorted = true;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}
	private static boolean sortedInIncreasingOrder(int[] arr) {
		boolean isSorted = true;
	    for(int i=0;i<arr.length-1;i++){
	    	if(arr[i]>arr[i+1]){
	    		isSorted=false;
	    		break;
	    	}
	    }
	    return isSorted;   	
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {2,10,3,1,-5};
		//int[] arr = {-5,1,2,3,10};
		//int[] arr ={10,3,2,1,-5};
        System.out.println(peakElement(arr));
	}

}
