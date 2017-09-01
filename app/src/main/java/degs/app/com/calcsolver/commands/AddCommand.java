package degs.app.com.calcsolver.commands;

public class AddCommand extends BaseCommand{
    private String TYPE;
    private int val;

    public AddCommand(int val) {
        this.TYPE = ADD;
        this.val = val;
    }

    @Override
    int apply(int curr) {
        return curr + val;
    }

    @Override
    String get() {
        return TYPE + val;
    }
}
