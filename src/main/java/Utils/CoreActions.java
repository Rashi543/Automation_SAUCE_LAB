package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreActions {
    protected final WebDriver driver;
    protected final WebDriverWait waiter;
    protected String Home_text;
    protected String Cart_text;
    protected String cart_price;
    protected String Go_price;
    protected Boolean value;
    protected int size_shown;
    protected CoreActions(WebDriver driver)
    {
        this.driver=driver;
        this.waiter=new WebDriverWait(driver,10);
    }
    protected boolean waitForVisibility(By element) {
        boolean isVisible = true;
        try {
            waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException te) {
            isVisible = false;
        }
        return isVisible;
    }
    public void click(By element)
    {
        driver.findElement(element).click();
    }
    public void enter_values(By element,String text)
    {
        driver.findElement(element).sendKeys(text);
    }
    public String store_data(By element)
    {
        Home_text=driver.findElement(element).getText();
        return Home_text;
    }
    public void clear_data(By element)
    {
        driver.findElement(element).clear();
    }
    public String catch_data(By element)
    {
        Cart_text=driver.findElement(element).getText();
        return Cart_text;
    }
    public String store_price(By element)
    {
        cart_price=driver.findElement(element).getText();
        return cart_price;
    }
    public String catch_price(By element) {
        Go_price = driver.findElement(element).getText();
        return Go_price;
    }
    public Boolean check_qty(By element)
    {
        value=driver.findElement(element).isEnabled();
        return value;
    }
    public int data_present_cart_page_validation(By element)
    {
        size_shown=(driver.findElements(element)).size();
        System.out.println("size of div=" +size_shown);
        return size_shown;
    }
    public void sleep(double sec)
    {
        try {
            Thread.sleep((long)(sec * 1000));
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}
