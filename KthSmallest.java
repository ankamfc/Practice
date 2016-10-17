public static int partition(int[] array, int first, int last) {
    int pivot = array[first];
    int pivotPosition = first++;
    while (first <= last) {
        // scan for values less than the pivot
        while ((first <= last) && (array[first] < pivot)) {
            first++;
        }

        // scan for values greater than the pivot
        while ((last >= first) && (array[last] >= pivot)) {
            last--;
        }

        if (first > last) {
            // swap the last uncoformed 
            // element with the pivot
            swap(array, pivotPosition, last); 
        }
        else {
            // swap unconformed elements:
            // first that was not lesser than the pivot 
            // and last that was not larger than the pivot
            swap(array, first, last);
        }
    }
    return last;
}

private static int orderStatistic(
        int[] array, int k, int first, int last) {
            
    int pivotPosition = partition(array, first, last);
    if ( pivotPosition == k - 1) {
        return array[k - 1];
    }
    if (k - 1 < pivotPosition ) {
        return orderStatistic(array, k, first, pivotPosition - 1);
    }
    else {
        return orderStatistic(array, k, pivotPosition + 1, last);
    }
}

// iterative version
private static int orderStatistic(
        int[] array, int k, int first, int last) {

    int pivotPosition = partition(array, first, last);

    while (pivotPosition != k - 1) {
        if (k - 1 < pivotPosition) {
            last = pivotPosition - 1;
        }
        else {
            first = pivotPosition + 1;
        }
        
        pivotPosition = partition(array, first, last);
    }
    
    return array[k - 1];
}

public static int kthSmallest(int[] array, int k) {
    return orderStatistic(
        array, k, 0, array.length - 1);
}

public static int kthLargest(int[] array, int k) {
    return orderStatistic(
        array, array.length - k + 1, 0, array.length - 1);
}