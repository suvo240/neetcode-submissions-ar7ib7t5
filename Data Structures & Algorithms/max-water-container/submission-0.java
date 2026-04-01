class Solution {
    public int maxArea(int[] arr) {
        int l=0; int r=arr.length-1;
        int max_area = 0;
        while(l<r){
            int w = r-l;
            int h = Math.min(arr[r],arr[l]);
            max_area = Math.max(max_area,w*h);
            if(arr[r]>arr[l]){
                l++;
            }else {
                r--;
            }
        }
        return max_area;
    }
}
