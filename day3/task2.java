class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int i = 0 , j = str.length()-1;
         while(i < j){
                int i_index = str.charAt(i)  ,  j_index = str.charAt(j);
                    if( ((i_index > 122) || (i_index < 97))  && ((i_index < 48 ) || (i_index > 57))  ){
                           i++;
                    }
                   else if( ((j_index > 122) || (j_index < 97))  &&( (j_index < 48 ) || (j_index > 57))  ){
                           j--;
                    }
                  else{
                    if(str.charAt(i) != str.charAt(j)) {
                        return false ;
                    }
                    else{
                        i++;j--;
                    }

                }
            
        }
        return true;
    }
}