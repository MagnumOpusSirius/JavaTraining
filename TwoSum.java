// ------------Problem Decription----------------
// -- given an array of integers and a target value, return the indices of the 
// -- two numbers such that they add up to the target
class TwoSum{
    public int[] twoSumBrute(int[] arr, int target){
        //two loops:
            //outer loops: go through all elements in arr
        for(int i =0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] + arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return arr;
    }
    public int[] twoSumFast(int[] arr, int target){
        //Map
        return arr;
    }
    public static void main(String[] args){
        TwoSum ts= new TwoSum();
        int[] arr= {1,2,5,2,5};
        int target=10;
        int[] value= ts.twoSumBrute(arr,target);
        System.out.println("the indeces are: "+ value[0] + " and " + value[1]);
    }
}
