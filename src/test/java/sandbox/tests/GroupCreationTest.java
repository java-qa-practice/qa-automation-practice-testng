package sandbox;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupPage("Name", "Header", "Footer"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
