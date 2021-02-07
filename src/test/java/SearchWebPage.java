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

    @FindBy(xpath = "//*[@id=\"open-chat\"]")
    private WebElement searchHomePage;

    @FindBy(xpath = "//*[@id=\"top\"]/body/header/div[4]/div[3]/div/a/span")
    private WebElement searchEmptyShoppingCart;

    @FindBy(xpath = "//*[@id=\"open-chat\"]")
    private WebElement selectCountryLanguage;

    @FindBy(xpath = "/html/body/div[6]/div/div/div/section/button[2]")
    private WebElement pupUpAccept;


    public SearchWebPage(WebDriver driver) { super(driver); }

    public void populateSearchField() {this.searchField.sendKeys(SEARCH_STRING);}

    public void populateInvalidSearchField() {this.searchField.sendKeys(INVALID_SEARCH_STRING);}

    public void searchItemUsingButton(){
        this.searchButton.click();
    }

    public void searchItemHomePage(){
        this.searchHomePage.click();
    }

    public void searchEmptyShoppingCart(){ this.searchEmptyShoppingCart.click(); }

    public void selectCountryLanguage(){ this.selectCountryLanguage.click(); }

    public void removePupUp() { this.pupUpAccept.click(); }

}
