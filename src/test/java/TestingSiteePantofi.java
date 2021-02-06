import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestingSiteePantofi {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    //Test cases "SearchWebpage"

    @Test(testName = "Select country language")
    public static void selectCountryLanguage(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.selectCountryLanguage();
    }

    @Test(testName = "Search field without a product")
    public static void searchWithoutAProduct(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.searchItemUsingButton();
    }

    @Test(testName = "Search field invalid text")
    public static void searchFieldInvalidText(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateInvalidSearchField();
        webPage.searchItemUsingButton();
    }

    @Test(testName = "Search button with empty shopping cart ")
    public static void searchEmptyShoppingCart(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.searchEmptyShoppingCart();
    }

    @Test(testName = "Home page button")
    public static void homePage(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.searchItemHomePage();
    }

    @Test(testName = "Search field text")
    public static void searchFieldText(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
    }


    //Test cases "SecondWebPage"

    @Test(testName = "Select filter 'Barbati'")
    public static void selectFilterBarbati(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        secondWebPage.clickFilterBarbati();
    }

    @Test(testName = "Select filter 'Impermeabilitate'")
    public static void selectFilterImpermeabilitate(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        secondWebPage.clickFilterImpermeabilitate();
    }

    @Test(testName = "Select filter 'Size'")
    public static void selectFilterSize(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        secondWebPage.clickFilterSize();
    }

    @Test(testName = "Select a product")
    public static void selectAProduct(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        secondWebPage.clickSelectAProduct();
    }

    //Test cases "ThirdWebPage"

    @Test(testName = "Add product to cart")
    public static void addProductToCart(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        secondWebPage.clickSelectAProduct();
        ThirdWebPage thirdWebPage = new ThirdWebPage(driver);
        thirdWebPage.clickAddProductToCart();
    }

    @Test(testName = "Select the product size number")
    public static void SelectProductSize(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        secondWebPage.clickSelectAProduct();
        ThirdWebPage thirdWebPage = new ThirdWebPage(driver);
        thirdWebPage.clickAddProductToCart();
        thirdWebPage.clickSelectProductSize();
    }

    //Nu ruleaza bine !!!

    @Test(testName = "Visualize product into cart")
    public static void VisualizeProductIntoCart(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        secondWebPage.clickSelectAProduct();
        ThirdWebPage thirdWebPage = new ThirdWebPage(driver);
        thirdWebPage.clickAddProductToCart();
        thirdWebPage.clickSelectProductSize();
        thirdWebPage.clickGoToVisualizeCart();
    }


    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }



}

