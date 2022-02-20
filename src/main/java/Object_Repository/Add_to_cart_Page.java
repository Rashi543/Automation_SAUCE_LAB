package Object_Repository;

import org.openqa.selenium.By;

public class Add_to_cart_Page {
    public static final By CART= By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final By ProductName=By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
    public static final By productPrice=By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[3]");
    public static final By cart_check=By.xpath("//*[@class='cart_list']/div");
}
