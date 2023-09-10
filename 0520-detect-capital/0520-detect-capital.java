class Solution {
public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)-'A'<32){
                return false;
            }
        }
        return true;
    }
}





    //my apprach
//     public boolean detectCapitalUse(String word) {
//         int count=0;
//         boolean cap=true;
//         for(int i = 0;i<word.length();i++){
//                 Character ch =word.charAt(i);
//             if(Character.isLowerCase(ch)){
//                 cap= false;
//                 count++;
//             }
//             if(count==0){
//                 cap=true;
//             }
//         }
//         return cap;
//     }
// }