package ro.nicolaemariusghergu.queryit.queryitdata;

public interface Sorter {

    int[] sort(int[] list);

    static Sorter create(SorterType type) {
        return switch (type) {
            case INTER -> new InterchangeSorter();
            case BUBBLE -> new BubbleSorter();
            default -> throw new RuntimeException("Not a known type!");
        };
    }

    enum SorterType {
        INTER,
        BUBBLE;
    }
}
