package ro.nicolaemariusghergu.queryit.queryitdata;

public class InterchangeSorter implements Sorter{
    @Override
    public int[] sort(int[] list) {
        int aux;

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] > list[j]) {
                    aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }
        return list;
    }
}
