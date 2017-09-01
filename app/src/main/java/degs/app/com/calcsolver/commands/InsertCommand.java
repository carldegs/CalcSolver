package degs.app.com.calcsolver.commands;

public class InsertCommand extends BaseCommand{
    private int val;

    public InsertCommand(int val) {
        this.val = val;
    }

    @Override
    int apply(int curr) {
        return (curr * 10) + (curr >= 0 ? val : -val);
    }

    @Override
    String get() {
        return val + "";
    }
}
