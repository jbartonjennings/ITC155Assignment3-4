public static int countUnique(int[] array) {
    if (array.length == 0) {
        return 0;
    }
    int count = 1;
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] != array[i + 1]) {
            count++;
        }
    }
    return count;
}