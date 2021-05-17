package uaslp.ingenieria.labs.list;

public class ArrayList<H> implements List<H>{

    private Object array[];
    private int size;

    public ArrayList(){
        this.array = new Object[2];
    }

    @Override
    public void add(H data) {
        if (size == array.length) {
            Object arrayAux[] = new Object[array.length + 2];

            for (int i = 0; i < array.length; i++) {
                arrayAux[i] = array[i];
            }

            this.array = new Object[arrayAux.length];

            for (int i = 0; i < array.length; i++) {
                array[i] = arrayAux[i];
            }
        }
        this.array[size] = data;
        size++;
    }

    @Override
    public H get(int index) {
        return (H)array[index];
    }

    @Override
    public void delete(int index) throws MyIndexOutOfBoundException{
        if (size - (index + 1) >= 0) {
            System.arraycopy(array, index + 1, array, index + 1 - 1, size - (index + 1));
        }else {
            throw new MyIndexOutOfBoundException();
        }
        size--;
    }

    @Override
    public void insert(H data, Position position, Iterator<H> it) {
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<H> getIterator() {
        return new ForwardIterator();
    }

    @Override
    public Iterator<H> getReverseIterator() {
        return new ReverseIterator();
    }


    public class ForwardIterator implements Iterator<H> {
        private int currentIndex;

        public boolean hasNext(){
            return currentIndex<size;
        }

        public H next(){
            return (H) array[currentIndex++];
        }
    }

    public class ReverseIterator implements Iterator<H> {

        private int currentPosition;

        public ReverseIterator() {
            this.currentPosition = size-1;
        }

        @Override
        public boolean hasNext(){
            return currentPosition >= 0;
        }

        @Override
        public H next(){
            H data = (H) array[currentPosition];

            currentPosition--;

            return data;
        }
    }
}