public class Solution {
    public boolean isReachableAtTime(int startX, int startY, int targetX, int targetY, int time) {
        if (startX == targetX && startY == targetY && time ==1) {
                return false;
        }
        
        int xDiff = Math.abs(startX - targetX);
        int yDiff = Math.abs(startY - targetY);
                
        int maxDiff = Math.max(xDiff, yDiff);
        
        if (maxDiff <= time) {
            return true; 
        }
        
        return false;
    }
}