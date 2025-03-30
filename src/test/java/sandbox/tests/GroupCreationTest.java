package sandbox.tests;

import org.testng.annotations.Test;
import sandbox.models.GroupPage;

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
