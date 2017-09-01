package degs.app.com.calcsolver.commands;

public class PowerCommand extends BaseCommand{
    private String TYPE;
    private int val;

    public PowerCommand(int val) {
        this.TYPE = POWER;
        this.val = val;
    }

    @Override
    int apply(int curr) {
        return (int) Math.pow((double) curr, (double) val);
    }

    @Override
    String get() {
        return TYPE + val;
    }
}
