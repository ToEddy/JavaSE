package javaSe.oop.InterFace;

import java.util.Arrays;

public class UserTest {
    public static void main(String[] args) {
        Users[] users = new Users[3];
        users[0] = new Users(10,"jack");
        users[1] = new Users(15,"rose");
        users[2] = new Users(20,"tom");
        Arrays.sort(users);
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getAge()+"--------"+users[i].getName());
        }
    }
}
