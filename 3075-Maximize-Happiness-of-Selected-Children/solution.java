<<<<<<< HEAD
# Maximize Happiness of Selected Children 
=======
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i= happiness.length-1;
      long sum= 0;
int subval=0;
while(k>0){
    if(happiness[i]-subval<=0){
        break;
    }
    sum+=(happiness[i]-subval);
    k--;
i--;
subval++;
}
return sum;
    }
}
>>>>>>> df92d4a4b1450f1f2fc2962c2198f7fc702bc336
