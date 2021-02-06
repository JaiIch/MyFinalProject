import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageInitializing {
    protected WebDriver driver;

    public PageInitializing(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
