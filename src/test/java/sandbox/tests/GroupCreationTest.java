package sandbox.tests;

import org.testng.annotations.Test;
import sandbox.models.GroupPage;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupPage("Name", "Header", "Footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
