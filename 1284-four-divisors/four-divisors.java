class Solution {
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        for(int num : nums) {
            int sum = 1, count = 1;
            for(int i=2;i<=Math.sqrt(num);i++) {
                if(num % i == 0) {
                    int other = num / i;

                    if (i == other) {
                        count++;
                        sum += i;
                    } else {
                        count += 2;
                        sum += i + other;
                    }
                    
                }
            }
            count++;
            sum += num;
            if(count == 4){
                res += sum;
            }
            
        }

        return res;
        
    }
}