public interface Group {
    void subscribe(User user);

    void unsubscribe(User user);

    void notifyUsers(String message);
}
