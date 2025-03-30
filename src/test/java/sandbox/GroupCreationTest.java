package sandbox;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupPage("Name", "Header", "Footer"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
