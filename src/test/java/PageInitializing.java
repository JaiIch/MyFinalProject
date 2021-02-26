import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageInitializing {
    protected WebDriver driver;

    public PageInitializing(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
        PageFactory.initElements(driver,this);
    }
}
