package GettingWholeFile;

import java.io.File;
import java.util.Scanner;

public class GettingWholeFile {
    public static void main(String[] args) throws Exception {
        int fourLetter = 0;
        int caps = 0;
        String fn1 = "/Users/lda49/Projects/learnJavaTheHardWay/src/GettingWholeFile/some-words.txt";
        String fn2 = "/Users/lda49/Projects/learnJavaTheHardWay/src/GettingWholeFile/GettingWholeFile.java";

        Scanner wordReader = new Scanner(new File(fn1));

        while (wordReader.hasNext()) {
            String w = wordReader.next();
            if (w.length() == 4) {
                fourLetter++;
            }
        }
        wordReader.close();
        Scanner selfInput = new Scanner(new File(fn2));
        while (selfInput.hasNext()) {
            String token = selfInput.next();
            if (Character.isUpperCase(token.charAt(0))) {
                caps++;
            }
        }
        selfInput.close();
        System.out.println(fourLetter + " four-letter words in " + fn1);
        System.out.println(caps + " words start with capitals in " + fn2);
    }
}

// Comments Are Counted!