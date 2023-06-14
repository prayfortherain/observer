import java.util.ArrayList;

public class ConcreteGroup implements Group {
    private ArrayList<User> users;
    private String groupName;

    public ConcreteGroup(String groupName) {
        this.groupName = groupName;
        this.users = new ArrayList<>();
    }

    @Override
    public void subscribe(User user) {
        addUser(user);
    }

    @Override
    public void unsubscribe(User user) {
        removeUser(user);
    }

    @Override
    public void notifyUsers(String message) {
        for (User user : users) {
            user.update(groupName + ": " + message);
        }
    }

    private void addUser(User user) {
        users.add(user);
    }

    private void removeUser(User user) {
        users.remove(user);
    }

}
