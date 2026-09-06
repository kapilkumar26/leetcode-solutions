class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long required = (long) m * k;

        if (required > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int cnt=0;
            int boq=0;
            for(int i=0; i<bloomDay.length; i++){
                if(bloomDay[i]<=mid){
                    cnt++;
                if(cnt==k){
                    boq++;
                    cnt=0;
                 }
                }
                else {
                    cnt=0;
                }
            }
            if(boq>=m){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }

        return low;
    }
}

    