class Solution {
    public String decodeString(String s) {
       Stack<Integer> numst = new Stack<>();
       Stack<String> strst = new Stack<>();

       String currstring = "";
       int num =0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 🔢 digit असेल
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // 🔓 '[' आल्यावर save
            else if (ch == '[') {
                numst.push(num);
                strst.push(currstring);

                num = 0;
                currstring = "";
            }

     //"]" aale tr 
     else if ( ch == ']'){
        int repeatime = numst.pop();
       String prevString = strst.pop();

       StringBuilder temp = new StringBuilder();

       for(int j=0 ; j < repeatime; j++){
        temp.append(currstring);
       }        
       currstring = prevString + temp.toString();
     }
     else{
        currstring += ch;

     }
       }
       return currstring;
    }
}