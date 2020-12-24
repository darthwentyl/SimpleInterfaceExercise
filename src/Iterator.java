
public interface Iterator<TYPE> {
    public void previous();
    public void next();
    public void first();
    public void last();
    public boolean isDone();
    public TYPE current();
}
