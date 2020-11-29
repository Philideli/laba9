package lab9;

public class NumCounter {
    public int countNum(String s) {
        final String[] arr1 = s.split(" ");
        int res = 0;
        for (String i:arr1){
            char[] arr = i.toCharArray();
            int num = 0;
            for (char j:arr){
                if (j >= 48 && j <= 57){
                    num++;
                }
            }
            if (num == arr.length){
                res++;
            }
        }
        return res;
    }
}
