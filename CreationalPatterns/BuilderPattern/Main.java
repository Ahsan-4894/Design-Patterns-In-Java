package BuilderPattern;

public class Main {
    public static void main(String[] args) {

        // One way
        User user = new User.UserBuilder()
                .setEmail("ahsan@gmail.com")
                .setUserId("1234")
                .setUsername("ahsan4894")
                .build();
        System.out.println(user);

        // Second way
        User user2 = User.UserBuilder
                .builder()
                .setEmail("ahsan@gmail.com")
                .setUserId("1234")
                .setUsername("ahsan4894")
                .build();
        System.out.println(user2);
    }
}
