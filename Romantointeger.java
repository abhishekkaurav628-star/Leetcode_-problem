public class Romantointeger {

    public static int value(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return -1;
    }

    public static void main(String[] args) {
        String str = "IVXLCD";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int current = value(str.charAt(i));

            if (i + 1 < str.length()) {
                int next = value(str.charAt(i + 1));
                if (current < next) {
                    count -= current;
                } else {
                    count += current;
                }
            } else {
                count += current;
            }
        }
        System.out.println(count);
    }
}
