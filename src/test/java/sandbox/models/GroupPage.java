package sandbox.models;

public class GroupPage {

    private String groupName;
    private String groupHeader;
    private String groupFooter;

    public GroupPage(String groupName, String groupHeader, String groupFooter) {
        this.groupName = groupName;
        this.groupHeader = groupHeader;
        this.groupFooter = groupFooter;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getGroupHeader() {
        return this.groupHeader;
    }

    public String getGroupFooter() {
        return this.groupFooter;
    }
}
