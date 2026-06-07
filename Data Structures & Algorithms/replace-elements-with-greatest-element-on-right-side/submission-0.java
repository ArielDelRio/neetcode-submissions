class Solution {
    public int[] replaceElements(int[] arr) {
        int currentMax = arr[arr.length - 1];
        int aux = arr[arr.length - 1];
        arr[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            aux = arr[i];
            arr[i] = currentMax;
            currentMax = Math.max(currentMax, aux);
        }

        return arr;
    }
}