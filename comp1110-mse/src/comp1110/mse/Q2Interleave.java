package comp1110.mse;

/**
 * COMP1110 Mid-Semester Exam, Question 2
 */
public class Q2Interleave {

    /**
     * This function takes two arrays of strings and returns a new array of strings where
     * the elements from a and be are interleaved.
     * For example:
     *    a = {"a", "b", "c", "d"}
     *    b = {"e", "f", "g", "h"}
     * the result will be
     *        {"a", "e", "b", "f", "c", "g", "d", "h"}
     * in the case where one array is longer than the other, the remaining elements
     * will be added to the end of the result:
     *    a = {"a", "b", "c"}
     *    b = {"e"}
     * the result will be
     *        {"a", "e", "b", "c"}
     */
    public static String[] interleave(String[] a, String[] b) {
        String [] s = new String[a.length+b.length];
        int length = Math.min(a.length, b.length);
       for(int i =0;i<length;i++){
           s[2*i]=a[i];
           s[2*i+1]=b[i];
       }
        for (int j = 2 * length; j < s.length; j++) {
            if (a.length > b.length) {
                s[j] = a[j - length];
            } else {
                s[j] = b[j - length];
            }
        }
        return s;
    }
}
