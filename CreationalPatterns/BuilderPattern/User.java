package BuilderPattern;

public class User {
    private final String userId;
    private final String email;
    private final String username;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.email = builder.email;
        this.username = builder.username;
    }

    public String toString() {
        return "User [userId=" + this.userId + ", email=" + this.email + ", username=" + this.username + "]";
    }

    public String getUserId() {
        return this.userId;
    };

    public String getEmail() {
        return this.email;
    };

    public String getUsername() {
        return this.username;
    };

    static class UserBuilder {
        private String userId;
        private String email;
        private String username;

        public UserBuilder() {
        }

        // second way opt
        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }

    };

}
