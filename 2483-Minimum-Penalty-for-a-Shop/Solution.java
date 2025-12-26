// class Solution {
//     public int bestClosingTime(String customers) {
//         int currpenalty = 0, minpenalty = 0;

//         for (int i = 0; i < customers.length(); i++) {
//             if (customers.charAt(i) == 'Y') {
//                 currpenalty++;
//             }
//         }
//         minpenalty = currpenalty;
//         int hour = 0;
//         for (int i = 0; i < customers.length(); i++) {
//             char ch = customers.charAt(i);
//             if (ch == 'Y') {
//                 currpenalty--;
//             } else {
//                 currpenalty++;
//             }
//             if (currpenalty < minpenalty) {
//                 hour = i + 1;
//                 minpenalty = currpenalty;
//             }
//         }
//         return hour;
//     }
// }
class Solution {
    public int bestClosingTime(String customers) 
int n=customers.length();
int result=0;
        int customerLeft=0;
        for(int i=0;i<n;i++){
            char ch=customers.charAt(i);
            if(ch=='Y'){
                customerLeft++;
                if(customerLeft>0){
                    result=i+1;
                    customerLeft=0;
                }
            }
            else customerLeft--;
        }
        return result;
    }
}

