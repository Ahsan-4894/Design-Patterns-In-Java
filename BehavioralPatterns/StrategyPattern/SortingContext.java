package BehavioralPatterns.StrategyPattern;

public class SortingContext {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        if (sortingStrategy != null) {
            sortingStrategy.sort(array);
        } else {
            System.out.println("Sorry but this Sorting strategy is not avaliable yet!");
        }
    }
}
