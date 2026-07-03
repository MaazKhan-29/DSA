class Solution {

    public int reverse(int x) {

         int reminder;
        int reverse = 0;

        while (x != 0) {

            reminder = x % 10;

            if (reverse > Integer.MAX_VALUE / 10 ||
                    (reverse == Integer.MAX_VALUE / 10 && reminder > 7)) {
                reverse = 0;
                break;
            }

            if (reverse < Integer.MIN_VALUE / 10 ||
                    (reverse == Integer.MIN_VALUE / 10 && reminder < -8)) {
                reverse = 0;
                break;
            }

            reverse = reverse * 10 + reminder;
            x = x / 10;
        }

        return reverse;
    }
}
