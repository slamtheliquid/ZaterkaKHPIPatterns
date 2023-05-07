package Lab1;

public class NIterator implements MyCollection{
    private final String name;
    private final String[] pointsOfView;

    public NIterator(String name, String[] pointsOfView) {
        this.name = name;
        this.pointsOfView = pointsOfView;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator getIterator() {
        return new PointOfViewIterator();
    }

    private class PointOfViewIterator implements Iterator{
            int index = pointsOfView.length - 1;
        @Override
        public boolean hasNext() {
            if(index >= 0 ){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return pointsOfView[index--];
        }
    }
}
