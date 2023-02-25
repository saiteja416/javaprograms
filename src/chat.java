public class chat {
        public static void main(String[] args) {
            String s = "abc";
            generatePermutations(s.toCharArray(), 0, s.length() - 1);
        }

        public static void generatePermutations(char[] s, int left, int right) {
            if (left == right) {
                System.out.println(new String(s));
            } else {
                for (int i = left; i <= right; i++) {
                    swap(s, left, i);
                    generatePermutations(s, left + 1, right);
                    swap(s, left, i);
                }
            }
        }

        public static void swap(char[] s, int i, int j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
