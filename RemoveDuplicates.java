public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        // LinkedHashSet removes duplicates keeps insertion order
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // add each character
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        // print result
        for (char ch : set) {
            System.out.print(ch);
        }
    }
}
