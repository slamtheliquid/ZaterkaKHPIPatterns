package Lab10;

public abstract class HTMLFormComponent {
    public void add(HTMLFormComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(HTMLFormComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract String render();
}
