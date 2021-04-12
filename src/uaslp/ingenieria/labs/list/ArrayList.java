package uaslp.ingenieria.labs.list;

public class ArrayList<H> implements List<H>{

    private Object array[];
    private int size;

    public ArrayList(){
        this.array = new Object[2];
    }

    @Override
    public void add(H data) {
        if(size == array.length){
            Object arrayAux[] = new Object[array.length + 2];

            for(int i = 0; i < array.length; i++){
                arrayAux[i] = array[i];
            }

            this.array = new Object[arrayAux.length];

            for(int i = 0; i < array.length; i++){
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
    public void delete(int index) {
        for (int i = index; i < size-1; i++) {
            array[i] = array[i + 1];
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

    public class ReverseIterator implements Iterator<H>{
        private int currentIndex;

        public boolean hasNext(){
            return currentIndex>=0;
        }

        public H next(){
            return (H) array[currentIndex--];
        }
    }

}