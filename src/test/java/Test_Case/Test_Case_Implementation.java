package Test_Case;

import Utils.CoreTestIntegration;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utils.Listener;

@Test
@Epic("Epic 1")
@Listeners(Listener.class)
public class Test_Case_Implementation extends CoreTestIntegration {
    @Test(dataProvider = "check_data")
    @Description("testing the function")
    @Severity(SeverityLevel.NORMAL)
    @Story("STORY 1")
    @Feature("Feature 1")
    @Owner("RASHI RAJAN")
    public void testing_username_insertion(String data) {
        logStep("Sending username");
        Assert.assertEquals(URL,expected,"PASSED");
        String users[]=data.split(",");
        login_page_obj.sendUsername(users[0]);
        System.out.println(users[0]);
        login_page_obj.sleep(2);
        login_page_obj.sendPassword(users[1]);
        System.out.println(users[1]);
        login_page_obj.sleep(2);
        login_page_obj.ClickSubmit();
        login_page_obj.sleep(2);
        home_page_obj.Select_purchase_item();
        home_page_obj.sleep(2);
        add_to_cart_obj.cart_check_before();
        add_to_cart_obj.ADD_TO_CART();
        add_to_cart_obj.match_data();
        add_to_cart_obj.match_price();
        add_to_cart_obj.sleep(2);
        go_to_cart_obj.GO_TO_CART();
        go_to_cart_obj.home_data();
        go_to_cart_obj.cart_price_check();
        go_to_cart_obj.check_name();
        go_to_cart_obj.check_price();
        go_to_cart_obj.sleep(2);
        checkout_obj.checkout_click();
        checkout_obj.sleep(2);
        information_obj.enter_first_name("Manik");
        checkout_obj.sleep(2);
        information_obj.enter_last_name("Sharma");
        checkout_obj.sleep(2);
        information_obj.enter_postal_code("110095");
        checkout_obj.sleep(2);
        information_obj.click_continue();
        information_obj.sleep(2);
        overview_obj.click_Finish();
        overview_obj.sleep(2);
        complete_obj.click_back();
        complete_obj.sleep(2);
        go_cart_again_obj.click_cart_after_back_home();
        go_cart_again_obj.sleep(2);
        cart_check_obj.check_cart_data();
        cart_check_obj.sleep(2);
        cart_check_obj.click_dropdown();
        cart_check_obj.sleep(2);
        cart_check_obj.Click_logout();
        cart_check_obj.sleep(2);
        close();
    }
}

