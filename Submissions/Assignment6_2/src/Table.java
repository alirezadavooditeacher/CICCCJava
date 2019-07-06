public class Table {
    private TableDataProvider delegate;

    public TableDataProvider getDelegate() {
        return delegate;
    }

    public void setDelegate(TableDataProvider delegate) {
        this.delegate = delegate;
    }

    public void render () {
        int numberOfRows = delegate.rows();

        drawLine();
        for (int i = 0; i < numberOfRows; i++) {
            String data = delegate.data(i);
            int height = delegate.height(i);
            System.out.println(data);
            drawLine();
        }
    }

    private void drawLine() {
        System.out.println("-------------------------------");
    }
}
