import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestingSiteePantofi {
    private static final WebDriver driver = new ChromeDriver();


    private static void NavigateToPageTwo() {
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
    }

    public static void NavigateToPageThree(){
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        Utils.WaitForElement(3);
        secondWebPage.clickSelectAProduct();
    }

    public static void NavigateToPageFour(){
        NavigateToPageThree();
        ThirdWebPage thirdWebPage = new ThirdWebPage(driver);
        thirdWebPage.clickAddProductToCart();
        Utils.WaitForElement(3);
        thirdWebPage.clickSelectProductSize();
        Utils.WaitForElement(3);
    }


    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }


    //Test cases "SearchWebpage"

    //Test case_1: Home page - Test the button "country language"
    @Test(testName = "Select country language")
    public static void selectCountryLanguage(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.selectCountryLanguage();
    }

    //Test case_2: Home page - Test the button "Search" without any text
    @Test(testName = "Search field without a product")
    public static void searchWithoutAProduct(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.searchItemUsingButton();
    }

    //Test case_3: Home page - Test the field "Search" without invalid text
    @Test(testName = "Search field invalid text")
    public static void searchFieldInvalidText(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateInvalidSearchField();
        webPage.searchItemUsingButton();
    }

    //Test case_4: Home page - Test the button "Shopping Cart" without any product
    @Test(testName = "Search button with empty shopping cart ")
    public static void searchEmptyShoppingCart(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.searchEmptyShoppingCart();
    }

    //Test case_5: Home page - Test the button "Home page"
    @Test(testName = "Home page button")
    public static void homePage(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.searchItemHomePage();
    }

    //Test case_6: Home page - Test the field "Search" with text "Columbia"
    @Test(testName = "Search field text")
    public static void searchFieldText(){
        driver.get(Utils.BASE_URL);
        SearchWebPage webPage = new SearchWebPage(driver);
        webPage.removePupUp();
        webPage.populateSearchField();
        webPage.searchItemUsingButton();
    }


    //Test cases "SecondWebPage"

    //Test case_7: Columbia product page - Test selection of filter "Barbati"
    @Test(testName = "Select filter 'Barbati'")
    public static void selectFilterBarbati(){
        driver.get(Utils.BASE_URL);
        NavigateToPageTwo();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        Utils.WaitForElement(3);
        secondWebPage.clickFilterBarbati();
    }

    //Trebuie sa refac cu CSS_Selector pentru ca poate selecta de la alt filtru

    //Test case_8: Columbia product page - Test selection of filter "Impermeabilitate"
    @Test(testName = "Select filter 'Impermeabilitate'")
    public static void selectFilterImpermeabilitate(){
        driver.get(Utils.BASE_URL);
        NavigateToPageTwo();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        Utils.WaitForElement(3);
        secondWebPage.clickFilterImpermeabilitate();
    }

    //Test case_8: Columbia product page - Test selection of filter "Size
    @Test(testName = "Select filter 'Size'")
    public static void selectFilterSize(){
        driver.get(Utils.BASE_URL);
        NavigateToPageTwo();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        Utils.WaitForElement(3);
        secondWebPage.clickFilterSize();
    }

    //Test case_9: Columbia product page - Test to select the first product from page
    @Test(testName = "Select a product")
    public static void selectAProduct(){
        driver.get(Utils.BASE_URL);
        NavigateToPageTwo();
        SecondWebPage secondWebPage = new SecondWebPage(driver);
        Utils.WaitForElement(3);
        secondWebPage.clickSelectAProduct();
    }


    //Test cases "ThirdWebPage"

    //Test case_10: First product Columbia selected - Test button to add product to shopping cart
    @Test(testName = "Add product to cart")
    public static void addProductToCart(){
        driver.get(Utils.BASE_URL);
        NavigateToPageThree();
        ThirdWebPage thirdWebPage = new ThirdWebPage(driver);
        thirdWebPage.clickAddProductToCart();
    }

    //Test case_11: First product Columbia selected - Test to select first size number from list
    @Test(testName = "Select the product size number")
    public static void SelectProductSize(){
        driver.get(Utils.BASE_URL);
        NavigateToPageThree();
        ThirdWebPage thirdWebPage = new ThirdWebPage(driver);
        thirdWebPage.clickAddProductToCart();
        Utils.WaitForElement(3);
        thirdWebPage.clickSelectProductSize();
    }


    //Test cases "FourthWebPage"

    //Test case_12: First product Columbia into cart - Test button to visualize the shopping cart
    @Test(testName = "Visualize product into cart")
    public static void VisualizeProductIntoCart(){
        driver.get(Utils.BASE_URL);
        NavigateToPageFour();
        FourthWebPage fourthWebPage = new FourthWebPage(driver);
        Utils.WaitForElement(3);
        fourthWebPage.clickGoToVisualizeCart();
    }

    //Test case_13: First product Columbia into cart - Test button to continue the shopping
    @Test(testName = "Continue shopping button from cart")
    public static void ContinueShoppingFromCart(){
        driver.get(Utils.BASE_URL);
        NavigateToPageFour();
        FourthWebPage fourthWebPage = new FourthWebPage(driver);
        Utils.WaitForElement(3);
        fourthWebPage.clickGoToVisualizeCart();
        Utils.WaitForElement(3);
        fourthWebPage.clickContinueShoppingFromCart();

    }

    //Test case_14: First product Columbia into cart - Test button to remove the product from shopping cart
    @Test(testName = "Remove Product From Cart")
    public static void RemoveProductFromCart(){
        driver.get(Utils.BASE_URL);
        NavigateToPageFour();
        FourthWebPage fourthWebPage = new FourthWebPage(driver);
        fourthWebPage.clickGoToVisualizeCart();
        Utils.WaitForElement(3);
        fourthWebPage.clickRemoveProductFromCart();
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

