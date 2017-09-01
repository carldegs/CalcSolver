package degs.app.com.calcsolver.commands;

public class ReplaceCommand extends BaseCommand{
    private int val, val2;
    private String TYPE;

    public ReplaceCommand(int val, int val2) {
        this.val = val;
        this.val2 = val2;
        this.TYPE = REPLACE;
    }

    @Override
    int apply(int curr) {
        return Integer.parseInt(Integer.toString(curr)
                .replaceAll(Integer.toString(val), Integer.toString(val2)));

    }

    @Override
    String get() {
        return val + TYPE + val2;
    }
}
