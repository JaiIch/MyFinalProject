import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondWebPage extends PageInitializing{


    @FindBy(xpath = "//*[@id=\"top\"]/body/header/div[4]/a")
    private WebElement returnToHomePage;

    @FindBy(css = "body > div.one-col-wrapper > div > div.category-grid__filters > div.filters-container > div.sidebar-section.filter-link > div > ul > li:nth-child(2) > a")
    private WebElement filterBarbati;

    @FindBy(css = ".filters-container > div:nth-child(15) > div > ul > li > a")
    private WebElement filterImpermeabilitate;

    @FindBy(css = "body > div.one-col-wrapper > div > div.category-grid__filters > div.filters-container > div.sidebar-section.sidebar-section--size.filter-grid > div > ul > li:nth-child(3) > a")
    private WebElement filterSize;

    @FindBy(css = ".products-list > li:nth-child(1) a:first-of-type")
    private WebElement selectAProduct;



    public SecondWebPage(WebDriver driver) {super(driver); }

    public void clickReturnToHomePage() {this.returnToHomePage.click();}

    public void clickFilterBarbati() {this.filterBarbati.click(); }

    public void clickFilterImpermeabilitate() {this.filterImpermeabilitate.click(); }

    public void clickFilterSize(){this.filterSize.click(); }

    public void clickSelectAProduct(){this.selectAProduct.click();}
}
