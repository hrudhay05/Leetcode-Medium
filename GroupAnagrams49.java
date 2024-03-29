import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> frequencyStringMap = new HashMap<>();
        for (String str : strs) {
            String frequencyStr = getFrequencyString(str);
            if (frequencyStringMap.containsKey(frequencyStr)) {
                frequencyStringMap.get(frequencyStr).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                frequencyStringMap.put(frequencyStr, strList);
            }
        }
        return new ArrayList<>(frequencyStringMap.values());
    }

    private String getFrequencyString(String str) {
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char ch1='a';
        for (int i : freq) {
            sb.append(ch1);
            sb.append(i);
            ch1++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroupAnagrams49 solution = new GroupAnagrams49();

        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }

        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println("Anagrams grouped: " + result);
        
        scanner.close();
    }
}
