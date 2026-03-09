public class Array_List {

    int initial_value;
    int[]niz;
    int size;

    public Array_List(int initial_value)
    {
        this.initial_value = initial_value;
        niz = new int[initial_value];
        size = 0;
    }

    public void add(int value)
    {
        if(size==niz.length)
            resize();
        niz[size] = value;
        size++;
    }
    public int get(int index)
    {
        return niz[index];
    }




    public  void resize()
    {
        int[]new_niz = new int[size*2];
        for(int i = 0;i<niz.length;i++)
        {
            new_niz[i] = niz[i];
        }
        niz = new_niz;

    }

}
