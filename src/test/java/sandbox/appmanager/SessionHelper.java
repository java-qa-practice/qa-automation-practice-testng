package sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(ChromeDriver wd) {super(wd);}

    public void login(String userName, String password) {
        type(By.name("user"), userName);
        type(By.name("password"), password);
        click(By.xpath("//form[@id='submit']"));
    }

}
