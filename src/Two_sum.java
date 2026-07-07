import java.util.HashMap;
class Solution{
    public int[] two_sum(int[]numbers , int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>() ;
        for(int index=0 ; index < numbers.length; index++ ) {
            int Current_num = numbers[index];
            int required_num = target - Current_num;
            if (hashMap.containsKey(required_num)) {
                return new int[]{hashMap.get(required_num), index};
            }
            hashMap.put(Current_num, index);
        }
        return new int[]{};
            }}
class Two_sum{
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        int[] answer = solution.two_sum(numbers, target);

        System.out.println("Index 1: " + answer[0]);
        System.out.println("Index 2: " + answer[1]);
    }


}