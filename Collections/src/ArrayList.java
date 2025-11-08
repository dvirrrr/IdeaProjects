public class ArrayList<T> {
    private T [] arr;
    private int len;
    private int last;
    public ArrayList() {
        this.len = 10;
        this.last = 0;
        this.arr = (T[]) new Object[this.len];
    }
    public ArrayList(int len) {
        this.len = len;
        this.last = 0;
        this.arr = (T[]) new Object[this.len];
    }
    public void add(T value) {
        if (this.last == this.len - 1) {
            this.len = (int) Math.ceil((last+1) * 1.2);
            T [] temp = (T[]) new Object[this.len];
            temp[last+1] = value;
            this.arr = temp;
        }
        else {
            this.arr[last] = value;
        }
        this.last++;
    }
    public void add(T value, int index) {
        this.len++;
        this.last++;
        T[] temp = (T[]) new Object[this.len];
        for (int i = 0; i < index; i++)
            temp[i] = this.arr[i];
        temp[index] = value;
        for (int j = index + 1; j < this.len; j++)
            temp[j] = this.arr[j - 1];
        this.arr = temp;
    }

    public T remove() {
        T save = this.arr[this.last];
        this.arr[this.last] = null;
        return save;
    }

    public boolean contains(T value) {
        for (int i = 0; i <= this.last; i++) {
            if (value.equals(this.arr[i])) {
                return true;
            }
        }
        return false;
    }


    public T remove(T value) {
        int index = -1;
        T save = null;

        for (int i = 0; i <= this.last; i++) {
            if (value.equals(this.arr[i])) {
                save = this.arr[i];
                index = i;
                break;
            }
        }

        if (index == -1) {
            return null;
        }

        for (int j = index; j < this.last; j++) {
            this.arr[j] = this.arr[j + 1];
        }

        this.last--;
        this.len--;
        return save;
    }

}
