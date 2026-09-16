class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }
        int fleet = 0;
        double previousTime =0;

        for (Map.Entry<Integer, Integer> entry :  map.descendingMap().entrySet()) {
            double time = (double) (target - entry.getKey()) / entry.getValue();
            if (time>previousTime) {
                fleet++;
                previousTime = time;
            }
        }
        return fleet;
    }
}
