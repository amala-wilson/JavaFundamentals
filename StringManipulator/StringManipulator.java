/* Implementation of different string operations in Java */

public class StringManipulator {
    public String trimAndConcat(String inStrA, String inStrB){
        String strA = "";
        String strB = "";
        String concatStr;
        int idx;

        for(idx=0;idx<inStrA.length();idx++){
            if(inStrA.charAt(idx) != ' '){
                strA = strA + inStrA.charAt(idx);
            }
        }

        for(idx=0;idx<inStrB.length();idx++){
            if(inStrB.charAt(idx) != ' '){
                strB = strB + inStrB.charAt(idx);
            }
        }

        concatStr = strA.concat(strB);

        return concatStr;
    }

    public Integer getIndexOrNull(String inStr, char inChar){
        int idxOfChar;

        idxOfChar = inStr.indexOf(inChar);

        if(idxOfChar == -1){
            return null;
        }
        else{
            return idxOfChar;
        } 
    }

    public Integer getIndexOrNull(String inStrA, String inStrB){
        int idxOfChar;

        idxOfChar = inStrA.indexOf(inStrB);

        if(idxOfChar == -1){
            return null;
        }
        else{
            return idxOfChar;
        } 
    }

    public String concatSubstring(String inStrA, int startIdx, int endIdx, String inStrB){
        int idx;
        String newSubStr = "";
        String concatenatedStr;

        for(idx=startIdx;idx<endIdx;idx++){
            newSubStr = newSubStr + inStrA.charAt(idx);
        }

        concatenatedStr = newSubStr.concat(inStrB);

        return concatenatedStr;
    }
}
