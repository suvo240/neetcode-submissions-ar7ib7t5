class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        // List<Integer> list = new ArrayList<>();
        // for(var entry : map.entrySet()){
        //     if(entry.getValue().equals(k)){
        //         list.add(entry.getKey());
        //     }
        // }
        // int size = list.size();
        // int[] result = new int[size];
        // for(int i=0;i<size;i++){
        //     result[i]=list.get(i);
        // }
        List<Integer> list = map.entrySet()
                        .stream()
                        .sorted((a,b) -> b.getValue()-a.getValue())
                        .limit(k)
                        .map(Map.Entry::getKey)
                        .toList();
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
