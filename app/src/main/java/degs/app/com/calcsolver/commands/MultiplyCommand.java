package degs.app.com.calcsolver.commands;

public class MultiplyCommand extends BaseCommand{
    private String TYPE;
    private int val;

    public MultiplyCommand(int val) {
        this.TYPE = MULTIPLY;
        this.val = val;
    }

    @Override
    int apply(int curr) {
        return curr * val;
    }

    @Override
    String get() {
        return TYPE + val;
    }
}
