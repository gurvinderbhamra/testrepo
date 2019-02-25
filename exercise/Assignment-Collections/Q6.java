import java.util.*;

public class Q6 {
    public static void main(String args[])
    {
        //Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

        int arr[] = {5, 3, 2, 3, 1, 6, 2, 7};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return -(o1.getValue().compareTo(o2.getValue()));
            }
        });

        Map<Integer, Integer> m2 = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> i : list)
        {
            m2.put(i.getKey(), i.getValue());
        }
        System.out.println(m2);
    }
}

