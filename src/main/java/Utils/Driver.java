package Utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("DataProviderReturnType")
public class Driver {
    private final WebDriver driver;
    public Driver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rashi.rajan\\Documents\\ASSIGNMENT\\Second_Assessment\\src\\main\\resources\\chromedriver.exe");
        this.driver=new ChromeDriver();
    }
    public WebDriver getDriver()
    {
        return  driver;
    }


}
