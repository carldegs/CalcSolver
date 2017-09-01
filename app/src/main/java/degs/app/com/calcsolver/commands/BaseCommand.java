package degs.app.com.calcsolver.commands;

public abstract class BaseCommand implements CommandType {
    abstract int apply(int curr);
    abstract String get();
}
