package Lab1;

public class GIterator implements MyCollection{
    private final String name;
    private final String[] pointsOfView;

    public GIterator(String name, String[] pointsOfView) {
        this.name = name;
        this.pointsOfView = pointsOfView;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator getIterator() {

        return new GIterator.PointOfViewIterator();
    }

    private class PointOfViewIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index < pointsOfView.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return pointsOfView[index++];
        }
    }
}
