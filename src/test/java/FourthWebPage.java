import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FourthWebPage extends PageInitializing{


    @FindBy(css = ".precart-popup__actions a")
    private WebElement goToVisualizeCart;

    @FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/div[3]/a")
    private WebElement continueShoppingFromCart;

    @FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/form/div/div/div/div[4]/a")
    private WebElement removeProductFromCart;


    public FourthWebPage(WebDriver driver) {super(driver);}

    public void clickGoToVisualizeCart() {this.goToVisualizeCart.click();}

    public void clickContinueShoppingFromCart() {this.continueShoppingFromCart.click();}

    public void clickRemoveProductFromCart() {this.removeProductFromCart.click();}
}
