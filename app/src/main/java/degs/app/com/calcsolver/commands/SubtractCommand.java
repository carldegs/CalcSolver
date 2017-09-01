package degs.app.com.calcsolver.commands;

public class SubtractCommand extends BaseCommand{
    private String TYPE;
    private int val;

    public SubtractCommand(int val) {
        this.TYPE = SUBTRACT;
        this.val = val;
    }

    @Override
    int apply(int curr) {
        return curr - val;
    }

    @Override
    String get() {
        return TYPE + val;
    }
}
