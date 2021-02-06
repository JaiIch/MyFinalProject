import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondWebPage extends PageInitializing{

    @FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/div[3]/div[2]/div[1]/div/ul/li[2]/a")
    private WebElement filterBarbati;

    @FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/div[3]/div[2]/div[12]/div/ul/li/a")
    private WebElement filterImpermeabilitate;

    @FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/div[3]/div[2]/div[2]/div/ul/li[3]/a")
    private WebElement filterSize;

    //Este OK XPath, dar incerc sa fac cu CSS Selector
    //@FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/div[4]/ul/li[1]/div/a/h2/span[1]")

    //Varianta cu CSS_Selector OK (primul produs din lista "Columbia")
    @FindBy(css = ".products-list > li:nth-child(1) a:first-of-type")
    private WebElement selectAProduct;



    public SecondWebPage(WebDriver driver) {super(driver); }

    public void clickFilterBarbati() {this.filterBarbati.click(); }

    public void clickFilterImpermeabilitate() {this.filterImpermeabilitate.click(); }

    public void clickFilterSize(){this.filterSize.click(); }

    public void clickSelectAProduct(){this.selectAProduct.click();}


}


//Exemplu de comanda pentru CSS Selector = la selectarea primului produs din lista:
// .products-list> li:nth-child(1) .products-list__item-wrapper a:nth-child(1)