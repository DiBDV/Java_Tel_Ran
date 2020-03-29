package telran.comtroller;

import telran.data.User;
import telran.data.UserAdmin;

public class ForumApp {
    public static void main(String[] args) {
        User user1 = new User ("Leon", 34);
        User user2 = new User ("Max", 28);
        User user3 = new UserAdmin ("Andrew", 38, "star");

        Post post1 = new Post(user1, 123, "Hallo", "what a beautiful day!");
        Post post2 = new Post(user2, 125, "Hallo", "what a beautiful world!");
        Post post3 = new Post(user1, 123, "Hallo", "what a beautiful day!");
        Post post4 = new Post(user1, 129, "Hallo", "what a beautiful day!");
        Post post5 = new Post(new User ("Olga", 29), 136, "Hallo", "Never say me tomorrow!");
        Post post6 = new Post(user2, 146, "One day letter", "see you tomorrow");
        Post post7 = new Post(user1, 152, "Hallo", "what a beautiful day!");
        Post post8 = new Post(user3, 156, "I'm admin", "Hello, my name is Andrew and I'm admin");

        Forum myForum = new Forum(50);
        myForum.addPost(post1);
        myForum.addPost(post2);
        myForum.addPost(post3);
        myForum.addPost(post4);
        myForum.addPost(post5);
        myForum.addPost(post6);
        myForum.addPost(post7);
        myForum.addPost(post8);

        post2.addLike();
        post2.addLike();

//        myForum.displayPost();

        Post[] postsByLeon = myForum.getPostsByAuthor("Leon", 5);
//        display(postsByLeon);

        myForum.updatePostByAdmin(123);
    }

    public static void display(Object[] objects){
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] != null){
                System.out.println(objects[i]);
            }
        }
    }
}