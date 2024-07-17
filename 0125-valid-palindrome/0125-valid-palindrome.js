const isPalindrome = (s) => {
    
    let convertedString = s.toLowerCase().replace(/[^a-z0-9]/g,"");
    let left=0;
    let right=convertedString.length-1;
    
    while(left < right){
        if(convertedString[left]!== convertedString[right]){
            return false;
        }
        
        left++;
        right--;
    }
    
    return true;
    
}



