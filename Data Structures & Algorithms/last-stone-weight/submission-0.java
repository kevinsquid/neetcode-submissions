class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>((a,b)->b-a);

        for (int i =0; i < stones.length; i++) {
            queue.add(stones[i]);
        }

        while (queue.size() > 1) {
            int num1 = queue.remove();
            int num2 = queue.remove();
            System.out.println(num1);
            System.out.println(num2);
            if (num1 == num2) {
                continue;
            }
            if (num1 < num2) {
                queue.add(num2-num1);
            }
            if (num1 > num2) {
                queue.add(num1-num2);
            }
            
        }
        return queue.size() == 1 ? queue.remove() : 0;
    }
}
