package com.bridgelabz.dsa.linkedlist.problems;

import java.util.ArrayList;
import java.util.List;

class User {
    String name;
    int id;
    int age;
    List<Integer> friends;

    User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.friends = new ArrayList<>();
    }
}

class UserNode {
    User user;
    UserNode next;

    UserNode(User user) {
        this.user = user;
        this.next = null;
    }
}

public class SocialMediaConnections {
    private UserNode head;


    public void addUser(User user) {
        UserNode newUser = new UserNode(user);
        if (head == null) {
            head = newUser;
            System.out.println("User added: " + user.name);
            return;
        }

        UserNode current = head;
        while (current.next != null) {
            if (current.user.id == user.id) {
                System.out.println("User with ID " + user.id + " already exists.");
                return;
            }
            current = current.next;
        }

        if (current.user.id == user.id) {
            System.out.println("User with ID " + user.id + " already exists.");
            return;
        }

        current.next = newUser;
        System.out.println("User added: " + user.name);
    }


    private UserNode findUserById(int id) {
        UserNode current = head;
        while (current != null) {
            if (current.user.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }


    public void addFriend(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.user.friends.contains(userId2)) {
            user1.user.friends.add(userId2);
        }
        if (!user2.user.friends.contains(userId1)) {
            user2.user.friends.add(userId1);
        }

        System.out.println("Friend connection added between " + user1.user.name + " and " + user2.user.name);
    }


    public void removeFriend(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.user.friends.remove(Integer.valueOf(userId2));
        user2.user.friends.remove(Integer.valueOf(userId1));

        System.out.println("Friend connection removed between " + user1.user.name + " and " + user2.user.name);
    }


    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print(user.user.name + "'s friends: ");
        if (user.user.friends.isEmpty()) {
            System.out.println("No friends yet.");
            return;
        }

        for (int friendId : user.user.friends) {
            UserNode friend = findUserById(friendId);
            if (friend != null) {
                System.out.print(friend.user.name + " ");
            }
        }
        System.out.println();
    }


    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        System.out.print("Mutual friends of " + user1.user.name + " and " + user2.user.name + ": ");
        List<Integer> mutualFriends = new ArrayList<>();

        for (int friendId : user1.user.friends) {
            if (user2.user.friends.contains(friendId)) {
                mutualFriends.add(friendId);
            }
        }

        if (mutualFriends.isEmpty()) {
            System.out.println("No mutual friends.");
            return;
        }

        for (int friendId : mutualFriends) {
            UserNode friend = findUserById(friendId);
            if (friend != null) {
                System.out.print(friend.user.name + " ");
            }
        }
        System.out.println();
    }


    public void searchUser(String query) {
        UserNode current = head;
        while (current != null) {
            if (current.user.name.equalsIgnoreCase(query) || Integer.toString(current.user.id).equals(query)) {
                System.out.println("User found: " + current.user.name + " (ID: " + current.user.id + ")");
                return;
            }
            current = current.next;
        }
        System.out.println("User not found.");
    }


    public void countFriends() {
        UserNode current = head;
        while (current != null) {
            System.out.println(current.user.name + " has " + current.user.friends.size() + " friends.");
            current = current.next;
        }
    }


    public void displayAllUsers() {
        UserNode current = head;
        System.out.println("All users in the system:");
        while (current != null) {
            System.out.println("User: " + current.user.name + " (ID: " + current.user.id + ", Age: " + current.user.age + ")");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaConnections sm = new SocialMediaConnections();


        sm.addUser(new User("mayank", 1, 25));
        sm.addUser(new User("arnav", 2, 27));
        sm.addUser(new User("vibhor", 3, 22));
        sm.addUser(new User("kanika", 4, 30));


        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 4);


        sm.displayFriends(1);
        sm.displayFriends(2);


        sm.findMutualFriends(1, 2);
        sm.findMutualFriends(1, 4);


        sm.searchUser("mayank");
        sm.searchUser("3");


        sm.countFriends();


        sm.removeFriend(1, 3);
        sm.displayFriends(1);


        sm.displayAllUsers();
    }
}
