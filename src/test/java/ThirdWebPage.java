import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdWebPage extends PageInitializing{


    @FindBy(xpath = "//*[@id=\"product_addtocart_form\"]/section/div[2]/div/div[6]/div[3]/div/button")
    private WebElement addProductToCart;

    @FindBy(css = ".e-size-picker-popup__wrapper .e-size-picker-popup__options button:first-child")
    private WebElement selectProductSize;


    public ThirdWebPage(WebDriver driver) {super(driver);}

    public void clickAddProductToCart() {this.addProductToCart.click();}

    public void clickSelectProductSize() {this.selectProductSize.click();}
}
