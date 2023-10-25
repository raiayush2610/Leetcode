class Solution {
    public int findDelayedArrivalTime(int aT, int dT) {
        int totaltime = aT+dT;
        return (totaltime %24);
    }
}