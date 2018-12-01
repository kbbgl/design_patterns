package org.kbbgl.dp.decorator_pattern.starbuzz.inputstream_decorator;

import java.io.*;

public class Run {

    public static void main(String[] args) {

        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("/Users/kobbigal/dev/design_patterns/src/main/java/org/kbbgl/dp/decorator_pattern/starbuzz/inputstream_decorator/test.txt")));

            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
