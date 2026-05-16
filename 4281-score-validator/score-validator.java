class Solution {
    public int[] scoreValidator(String[] events) {
        int[] res = new int[2];
        int count = 0, score = 0;
        for(int i=0;i<events.length;i++) {
            if(count == 10) {
                break;
            }
            else if (events[i].equals("W")) {
                count++;
            } else if(events[i].equals("WD") || events[i].equals("NB")) {
                score++;
            } else if (events[i].equals("1") || events[i].equals("2") || events[i].equals("3") 
                || events[i].equals("4") || events[i].equals("6")) {
                score += Integer.parseInt(events[i]);
            }
        }
        res[0] = score;
        res[1] = count;
        return res;
    }
}