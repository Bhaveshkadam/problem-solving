class Insertion {
    public int[] insertionSort(int[] array) {
        int i;
        int n = array.length;
        for (i = 1; i < n; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }
}