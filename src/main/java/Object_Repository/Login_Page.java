package Object_Repository;

import org.openqa.selenium.By;

public class Login_Page {
    public static final By TITLE=By.xpath("//div[@class='login_logo']");
    public static final By USERNAME=By.xpath("//input[@id='user-name']");
    public static final By PASSWORD=By.xpath("//input[@id='password']");
    public static final By SUBMIT=By.xpath("//input[@id='login-button']");
}
