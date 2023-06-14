public class Main {
    public static void main(String[] args) {
        ConcreteGroup group1 = new ConcreteGroup("Group 1");
        ConcreteGroup group2 = new ConcreteGroup("Group 2");
        ConcreteGroup group3 = new ConcreteGroup("Group 3");
        ConcreteGroup group4 = new ConcreteGroup("Group 4");
        
        ConcreteUser user1 = new ConcreteUser("User 1");
        ConcreteUser user2 = new ConcreteUser("User 2");

        group1.subscribe(user1);
        group2.subscribe(user1);
        group3.subscribe(user1);
        group1.subscribe(user2);
        group2.subscribe(user2);
        group3.subscribe(user2);
        group4.subscribe(user2);
        
        group1.notifyUsers("Message from Group 1");
        group2.notifyUsers("Message from Group 2");
        group3.notifyUsers("Message from Group 3");
        group4.notifyUsers("Message from Group 4");
    }
}
