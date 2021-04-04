package academy.belhard;

import entity.User;

public class Main {

    public static void main(String[] args) {
	User user1 = new User("Hanna", "Vorobyova", "vvorobyshka@gmail.com", "123456789");

        System.out.println(user1.getFullInfo());

        System.out.println(user1.isPasswordCorrect("123456789"));

    }
}
