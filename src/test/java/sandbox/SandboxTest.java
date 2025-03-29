package sandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SandboxTest {

    ChromeDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        wd.get("web site url");
        login("user", "password");
    }

    // Make user login under admin credentials
    private void login(String userName, String password) {
        wd.findElement(By.name(userName)).click();
        wd.findElement(By.name(userName)).clear();
        wd.findElement(By.name(userName)).sendKeys("admin");
        wd.findElement(By.name(password)).click();
        wd.findElement(By.name(password)).clear();
        wd.findElement(By.name(password)).sendKeys("secret");
        wd.findElement(By.xpath("//form[@id='submit']")).click();
    }

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupPage("Name", "Header", "Footer"));
        submitGroupCreation();
        returnToGroupPage();
    }

    private void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    private void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    private void fillGroupForm(GroupPage groupPageData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupPageData.getGroupName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupPageData.getGroupHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupPageData.getGroupFooter());
    }

    private void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    private void goToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
