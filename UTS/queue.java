public class Queue {
    private long[] queArray;
    private int nItems;

    public void insert (long item){
        int j;
        if (nItems == 0)
            queArray[nItems] = item;
        else{
            for (j = nItems-1; j>=0; j--){
                if (item > queArray[j])
                    queArray[j+1] = queArray[j];
                else
                    break;
            }
            queArray[j+1] = item;
            nItems++;
        }
    }
}
