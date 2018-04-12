package problems;
import java.util.HashMap;

/**
 * Created by mrahman on 04/22/17.
 */
    public class DuplicateWord {

        public static void main(String[] args) {

                String str = "magiclassnd515";
                int cnt = 0;
                char[] inp = str.toCharArray();
                System.out.println("Duplicate Characters are:");
                for (int i = 0; i < str.length(); i++) {
                    for (int j = i + 1; j < str.length(); j++) {
                        if (inp[i] == inp[j]) {
                            System.out.println(inp[j]);
                            cnt++;
                            break;
                        }
                    }
                }
        }
    }

//
//            /*
//             * Write a java program to find the duplicate words and their number of occurrences in the string.
//             * Also Find the average length of the words.
//             */

