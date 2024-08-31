class Solution {
    public int[] sortArray(int[] nums) {
        
        divide(nums,0,nums.length-1);
        return nums;
        
    }
    
    public void divide(int arr[],int low,int high){
        
        if(low>=high){
            
            return;
            
        }
        
        int mid = low + (high-low)/2;
        
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        
        mergeSort(arr,low,high,mid);
    }

    public void mergeSort(int arr[],int low,int high,int mid){
        
        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];
        
        
        
        for(int i=0;i<left.length;i++){
            left[i] = arr[low+i];
            
        }
        for(int j=0;j<right.length;j++){
            right[j] = arr[mid+1+j];
            
        }
        int i=0,j=0,k=low;
        
        while(i<left.length && j<right.length){
            
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }else{
                
                arr[k++] = right[j++];
                
            }
            
            
        }
        
        while(i<left.length){
            
            arr[k++] = left[i++];
            
            
        }
        
        while (j < right.length) {
            
            arr[k++] = right[j++];
            
        }
        
        
        
        
        
        
        
        
        
        
    }
}