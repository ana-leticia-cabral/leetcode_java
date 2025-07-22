class Solution {
    public boolean isPalindrome(int x) {

        String xString = Integer.toString(x);
        StringBuilder sB = new StringBuilder();
        sB.append(xString);

        String stringReverse = sB.reverse().toString();
        if (xString.equals(stringReverse)) {
            return true;

        } else {
            return false;
        }
    }
}