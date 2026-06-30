package exercise12;

public class Exercise12 {
    public static void main(String[] args) {
        StringBuffer username = new StringBuffer("JavaUser");
        System.out.println("Original Username: " + username);
        username.append("123");
        System.out.println("After append: " + username);
        username.insert(4, "Pro");
        System.out.println("After insert: " + username);
        int start = username.indexOf("User");
        username.replace(start, start + 4, "Developer");
        System.out.println("After replace: " + username);
        username.delete(username.length() - 3, username.length());
        System.out.println("After delete: " + username);
        username.reverse();
        System.out.println("After reverse: " + username);
        System.out.println("Length: " + username.length());
        System.out.println("Capacity: " + username.capacity());
        System.out.println("Character at index 2: " + username.charAt(2));
        username.setCharAt(0, 'X');
        System.out.println("After changing first character: " + username);
        String finalString = username.toString();
        System.out.println("Converted String: " + finalString);
    }
}