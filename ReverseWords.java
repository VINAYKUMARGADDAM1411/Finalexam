public class ReverseWords {
    public static void main(String[] args) {
        String s = "Vinay Kumar Gaddam";
        String[] words = s.split(" ");
        StringBuilder obj = new StringBuilder();

        for (String word : words) {
            obj.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println(obj.toString().trim());
    }
}