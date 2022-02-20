package Object_Repository;

import org.openqa.selenium.By;

public class Go_to_Cart_Page {
    public static final By Cart_ProductName=By.xpath("//*[@id=\"item_4_title_link\"]/div");
    public static final By GO_CART=By.xpath("//a[@class='shopping_cart_link']");
    public static final By Cart_price=By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div");
}
