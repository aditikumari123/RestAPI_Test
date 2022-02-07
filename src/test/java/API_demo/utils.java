package API_demo;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class utils {
    public static int getpageNo(){
//        Random random=new Random();
//        int generaterandomnum=random.nextInt();
        int  generaterandomnum=1;
        return generaterandomnum;

    }
    public static String getName(){
        String generaterandomString = RandomStringUtils.randomAlphabetic(1);
        return ("Neo"+generaterandomString);
    }

    public static String getJob(){
        String generaterandomString = RandomStringUtils.randomAlphabetic(1);
        return ("Hacker"+generaterandomString);
    }
}
