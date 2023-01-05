public class Resource {
    protected String CallID;
    protected String Title;
    protected boolean isBorrowed;

    public Resource(String CallID, String tittle) {
        this.CallID = CallID;
        this.Title = tittle;
        isBorrowed = false;
    }

    public void borrowed() {
        isBorrowed = true;
    }

    public void returned() {
        isBorrowed = false;


    }

    public String summary() {
        String s = "";
        s = "Call ID: " + CallID + "\nTitle :" + Title;
        if (isBorrowed == false) {
            s = s + " is in the library";
        } else {
            s = s + " is not in the library";
        }

        return s;
    }
}
