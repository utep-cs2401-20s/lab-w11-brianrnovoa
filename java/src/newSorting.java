public class newSorting {

    public void newSorting1(int[] A, int size) {
        if(A.length <= size) {
            partition(A); // quick sorts //
        }
        else {
            newSort(A, size); // merge sorts //
        }
    }

    public void partition(int[] A) {
        quickSort(A, 0, A.length - 1); // calls to quick sort //
    }

    public int partition(int[] A, int low, int high) {
        // IMPLEMENTING WITH LAST ELEMENT AS PIVOT //
        int pivot = A[high];
        int index = low - 1;
        for(int i = low; i < high; i++) {   // goes through array //
            if(A[i] < pivot) {  // compares current element with pivot //
                index++;
                int temp = A[index]; // swap elements //
                A[index] = A[i];
                A[i] = temp;
            }
        }
        int temp = A[index + 1]; // swap elements //
        A[index + 1] = A[high];
        A[high] = temp;

        return index + 1;
    }

    public void quickSort(int[] A, int low, int high) {
        if(low < high) {
            int index = partition(A, low, high);    // creates an index to begin partitioning the array //
            quickSort(A, low, index - 1);   // left of partition //
            quickSort(A, index + 1, high);  // right of partition //
        }
    }

    public void newSort(int[] A, int size) {
        int mid = A.length / 2; // gets midpoint //
        int[] leftOfMid = new int [mid]; // array for elements <= mid //
        int[] rightOfMid = new int [A.length - mid]; // array for elements > mid //

        for(int i = 0; i < leftOfMid.length; i++) { // fills array //
            leftOfMid[i] = A[i];
        }
        for(int i = 0; i < rightOfMid.length; i++) { // fills array //
            rightOfMid[i] = A[i + mid];
        }

        newSorting1(leftOfMid, size); // call for left side of array //
        newSorting1(rightOfMid, size); // call for right side of array //
        mergeSort(A, leftOfMid, rightOfMid); // call to merge //

    }

    public void mergeSort (int[] A, int[] leftOfMid, int[] rightOfMid) {
        int aIndex, leftIndex, rightIndex;
        aIndex = 0;
        leftIndex = 0;
        rightIndex = 0;

        while(leftIndex < leftOfMid.length && rightIndex < rightOfMid.length) { // sorts both left and right arrays into one //
            if(leftOfMid[leftIndex] < rightOfMid[rightIndex]) {
                A[aIndex] = leftOfMid[leftIndex];
                aIndex++;
                leftIndex++;
            } else {
                A[aIndex] = rightOfMid[rightIndex];
                aIndex++;
                rightIndex++;
            }
        }

        while(leftIndex < leftOfMid.length) { // in case the left array is larger, it stores the elements in A //
            A[aIndex] = leftOfMid[leftIndex];
            aIndex++;
            leftIndex++;
        }
        while(rightIndex < rightOfMid.length) { // in case the right array is larger, it stores the elements in A //
            A[aIndex] = rightOfMid[rightIndex];
            aIndex++;
            rightIndex++;
        }
    }

                                /* ONLINE RESOURCES USED: geeksforgeeks.org */
}
