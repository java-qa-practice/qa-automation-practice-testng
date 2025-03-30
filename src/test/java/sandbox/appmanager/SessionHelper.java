package sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper {

    private ChromeDriver wd;

    public SessionHelper(ChromeDriver wd) {
        this.wd = wd;
    }

    public void login(String userName, String password) {
        wd.findElement(By.name(userName)).click();
        wd.findElement(By.name(userName)).clear();
        wd.findElement(By.name(userName)).sendKeys("admin");
        wd.findElement(By.name(password)).click();
        wd.findElement(By.name(password)).clear();
        wd.findElement(By.name(password)).sendKeys("secret");
        wd.findElement(By.xpath("//form[@id='submit']")).click();
    }

}
