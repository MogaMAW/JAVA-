public class Journal  extends Resource {

    String Issue;

    public Journal(String c, String t, String i) {
        super(c, t);
        Issue = i;

    }

    public String Summary() {
        String s;
        s = super.summary() + "\nIssue: " + Issue;

        return s;
    }

}
