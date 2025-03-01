class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0, e=letters.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            System.out.println(mid);
            if(letters[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return letters[s%letters.length];
    }
}