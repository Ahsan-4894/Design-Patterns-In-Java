package BehavioralPatterns.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext();

        int[] array = { 2, 3, 41 };

        sortingContext.setSortingStrategy(new BubbleSort());
        sortingContext.performSort(array); // Sorting using Bubble Sort

        sortingContext.setSortingStrategy(new QuickSort());
        sortingContext.performSort(array); // Sorting using Quick Sort

        sortingContext.setSortingStrategy(new MergeSort());
        sortingContext.performSort(array); // Sorting using Merge Sort
    
    
    
    
    }
}
