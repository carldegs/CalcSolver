package degs.app.com.calcsolver.commands;

public class RemoveCommand extends BaseCommand{
    private String TYPE;

    public RemoveCommand(int val) {
        this.TYPE = REMOVE;
    }

    @Override
    int apply(int curr) {
        return curr / 10;
    }

    @Override
    String get() {
        return TYPE;
    }
}
