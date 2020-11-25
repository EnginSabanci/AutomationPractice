package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BrowserUtils {

    public static void wait(int seconds) {
        try {
            Thread.sleep(1000*seconds);
        }
        catch (InterruptedException e)
        {
        e.printStackTrace();
        }


    }


    public static String getScreenShot (String name) {
        SimpleDateFormat df = new SimpleDateFormat("-yyyy-MM-dd HH:mm"); //yyyy-MM-dd HH:mm
        String date = df.format(new Date());

        TakesScreenshot ts = (TakesScreenshot) Driver.get();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        //save the screenshot to the path I created

        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return target;
    }

}
