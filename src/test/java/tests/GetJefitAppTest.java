package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GetJefitAppTest extends BaseTest {

    @Test(description = "Ios App opened")
    public void getIosAppTest() {
        loginPage
                .open()
                .login();
        boolean isAppleStorePageOpened = getJefitIOsAppPage
                .getAppleStoreApp()
                .isPageOpen();

        assertTrue(isAppleStorePageOpened, "Apple Store page hasn't opened");
    }

    @Test(description = "Android App opened")
    public void getAndroidAppTest() {
        loginPage
                .open()
                .login();
        boolean isGooglePlayPageOpened = getJefitAndroidPage
                .getGooglePlayApp()
                .isPageOpen();

        assertTrue(isGooglePlayPageOpened, "Google Play page hasn't opened");
    }

}
