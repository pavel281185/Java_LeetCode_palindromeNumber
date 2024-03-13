class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int pocet = 0;
        char[] moje = String.valueOf(x).toCharArray();
        for(int i = 0; i < moje.length; i++){
            if(moje[i] == moje[moje.length-1-i]){
            pocet++;
            }
        }
        if(pocet==moje.length){
            return true;
        }
        else{return false;}
    }
}
