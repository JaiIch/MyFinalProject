import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondWebPage extends PageInitializing{

    //Este OK cu XPath, dar dar am facut cu CSS Selector pentru a nu-si schimba ordinea
    //@FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/div[3]/div[2]/div[1]/div/ul/li[2]/a")

    //Am facut cu CSS Selector pentru a-si pastra ordinea: OK
    @FindBy(css = "body > div.one-col-wrapper > div > div.category-grid__filters > div.filters-container > div.sidebar-section.filter-link > div > ul > li:nth-child(2) > a")
    private WebElement filterBarbati;


    //Este OK cu XPath, dar am facut cu CSS Selector pentru ca isi schimba ordinea
    //@FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/div[3]/div[2]/div[12]/div/ul/li/a")

    //Am facut cu CSS Selector pentru a-si pastra ordinea: OK
    @FindBy(css = "body > div.one-col-wrapper > div > div.category-grid__filters > div.filters-container > div.sidebar-section.sidebar-section--wodoodpornosc > div > ul > li > a")
    private WebElement filterImpermeabilitate;


    //Este OK cu XPath, dar am facut cu CSS Selector pentru a nu-si schimba ordinea
    //@FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/div[3]/div[2]/div[2]/div/ul/li[3]/a")

    //Am facut cu CSS Selector pentru a-si pastra ordinea: OK
    @FindBy(css = "body > div.one-col-wrapper > div > div.category-grid__filters > div.filters-container > div.sidebar-section.sidebar-section--size.filter-grid > div > ul > li:nth-child(3) > a")
    private WebElement filterSize;


    //Este OK cu XPath, dar am facut cu CSS Selector pentru a nu-si schimba ordinea
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
