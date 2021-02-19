import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchWebPage extends PageInitializing{
    private final String SEARCH_STRING = "Columbia";
    private final String INVALID_SEARCH_STRING = "qwertyuiopasdfghjkl";


    @FindBy(xpath = "//*[@id=\"top\"]/body/header/div[4]/div[1]/form/input")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"top\"]/body/header/div[4]/div[1]/form/button[1]")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"top\"]/body/header/div[4]/div[3]/div/a/span")
    private WebElement searchEmptyShoppingCart;


    //In lucru pt ca nu mai functioneaza_test aditional !!!!!!!!!!!!
    //@FindBy(css = "body > footer > div > div.footer__top-bar > div.footer__social > div:nth-child(2) > a > svg > path.bg)")
    @FindBy(xpath = "//*[@id=\"top\"]/body/footer/div/div[1]/div[2]/div[2]/a/svg/path[3]")
    private WebElement selectFacebookPage;


    @FindBy(xpath = "/html/body/div[6]/div/div/div/section/button[2]")
    private WebElement pupUpAccept;


    public SearchWebPage(WebDriver driver) { super(driver); }

    public void populateSearchField() {this.searchField.sendKeys(SEARCH_STRING);}

    public void populateInvalidSearchField() {this.searchField.sendKeys(INVALID_SEARCH_STRING);}

    public void searchItemUsingButton(){this.searchButton.click();}

    public void searchEmptyShoppingCart(){this.searchEmptyShoppingCart.click(); }

    public void selectFacebookPage(){this.selectFacebookPage.click(); }

    public void removePupUp() {this.pupUpAccept.click(); }


}
