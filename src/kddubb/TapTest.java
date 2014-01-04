package kddubb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TapTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println(
                    "Please enter the number of seconds to tap test (default 10):");
            String seconds = bufferedReader.readLine();
            if (seconds.trim().equals("")) {
                seconds = "10";
            }
            Integer intSeconds = new Integer(seconds);
            System.out.println("Start hitting the Enter key to start your test:");
            bufferedReader.readLine();
            final long beginTime = System.currentTimeMillis();
            final long endTime = beginTime + (intSeconds.intValue() * 1000);
            int count = 0;
            while (System.currentTimeMillis() < endTime) {
                bufferedReader.readLine();
                count++;
            }
            System.out.println("You pressed the Enter key " + count 
                    + " times in " + intSeconds + " seconds.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
