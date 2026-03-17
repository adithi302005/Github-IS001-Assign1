package Mod8;


    // LeetCode 191 - Number of 1 Bits

    public class NumberOf1Bits {
        public static void main(String[] args) {
            int n = 11; // 1011

            System.out.println(hammingWeight(n)); // 3
        }

        public static int hammingWeight(int n) {
            int count = 0;

            while (n != 0) {
                count += (n & 1);
                n >>>= 1;
            }

            return count;
        }
    }

