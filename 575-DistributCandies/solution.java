// class Solution {
//     public int distributeCandies(int[] candyType) {

// return Math.min(candyType.length/2, Arrays.stream(candyType).boxed().collect(Collectors.toSet()).size());

//     }
// }
class Solution {
    public int distributeCandies(int[] candyType) {
        boolean alreadyEat[]=new boolean[200001];
        int zeroIndexing=100000;
        int eat=0, l=candyType.length>>1;
        for(int i:candyType){
            i+=zeroIndexing;
            if(!alreadyEat[i]){
                eat++;
                if(eat==l) return eat;
                alreadyEat[i]=true;
            }
        }
        return eat;
    }
}
