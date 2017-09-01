package degs.app.com.calcsolver.commands;

public class DivideCommand extends BaseCommand{
    private String TYPE;
    private int val;

    public DivideCommand(int val) {
        this.TYPE = DIVIDE;
        this.val = val;
    }

    @Override
    int apply(int curr) {
        return curr / val;
    }

    @Override
    String get() {
        return TYPE + val;
    }
}
