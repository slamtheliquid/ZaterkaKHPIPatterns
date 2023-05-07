package Lab2;

public class TIterator implements MyCollection {
    private final String name;
    private final String[] pointsOfView;

    public TIterator(String name, String[] pointsOfView) {
        this.name = name;
        this.pointsOfView = pointsOfView;
    }

    public String getName() {
        return name;
    }

    public String[] getPointsOfView() {
        return pointsOfView;
    }

    @Override
    public Iterator getIterator() {
        return new PointOfViewIterator();
    }

    private class PointOfViewIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < pointsOfView.length-2){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return pointsOfView[index= index+2];
        }
    }
}
