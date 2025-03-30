package sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import sandbox.models.GroupPage;

public class GroupHelper extends HelperBase {

    public GroupHelper(ChromeDriver wd) {super(wd);}

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void fillGroupForm(GroupPage groupPageData) {
        type(By.name("group_name"), groupPageData.getGroupName());
        type(By.name("group_header"), groupPageData.getGroupHeader());
        type(By.name("group_footer"), groupPageData.getGroupFooter());
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

}
