    public static int findBoundary(List<Boolean> arr) {
        int startIdx = 0;
        int endIdx = arr.size() - 1;
        int midIdx;
        int leftMostTrueIdx = endIdx;
        boolean trueFound = false;
        
        while (startIdx <= endIdx) {
            midIdx = (startIdx + endIdx) / 2;
            boolean midVal = arr.get(midIdx);
            if (midVal == true) {
                trueFound = true;
                if (midIdx < leftMostTrueIdx) {
                    leftMostTrueIdx = midIdx;
                }
                endIdx = midIdx - 1;
            } else {
                startIdx = midIdx + 1;
            }
        }
        if (!trueFound) {
            return -1;
        }
        return leftMostTrueIdx;
    }
