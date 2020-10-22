public class 快速排序 {

    public void sort(int nums[]){
        if (nums.length <= 1) return;
        int begin = 0;
        int end = nums.length-1;
        int mid = getIndex(nums,begin,end);


    }
    public int getIndex(int nums[],int begin,int end){
        int target = nums[begin];
        while (begin<end){
            while (begin<end) {
                if (nums[end]<target){
                    nums[begin] = nums[end];
                    begin++;
                }else{
                    end--;
                }
            }
            while (begin<end) {

            }
        }
        nums[begin] = target;

        return begin;
    }
}
