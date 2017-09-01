package degs.app.com.calcsolver.commands;

public class InvertCommand extends BaseCommand{
    private String TYPE;

    public InvertCommand() {
        this.TYPE = INVERT;
    }

    @Override
    int apply(int curr) {
        return -curr;
    }

    @Override
    String get() {
        return TYPE;
    }
}
