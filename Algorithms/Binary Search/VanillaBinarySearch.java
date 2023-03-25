    public static int binarySearch(List<Integer> arr, int target) {
        int startIdx = 0;
        int endIdx = arr.size() - 1;
        int midIdx;
        
        while (startIdx <= endIdx) {
            midIdx = (startIdx + endIdx) / 2;
            if (arr.get(midIdx) == target) {
                return midIdx;
            } else if (arr.get(midIdx) > target) {
                endIdx = midIdx - 1;
            } else {
                startIdx = midIdx + 1;
            }
        }
        
        return -1;
    }
