class Solution {
    public int minMeetingRooms(int[] start, int[] end) {

        Arrays.sort(start);
        Arrays.sort(end);
        
        int maxrooms = 0, room = 0;
        int i = 0, j = 0;
        
        while(i < start.length && j < end.length){
            if(start[i] < end[j]){
                room++;
                maxrooms = Math.max(maxrooms, room);
                i++;
            } else {
                room--;
                j++;
            }
        }
        return maxrooms;
    }
}