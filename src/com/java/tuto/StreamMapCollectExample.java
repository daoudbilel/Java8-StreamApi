package com.java.tuto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User(1, "daoudbilel", "daoudbilel@gmail.com", "test"));
        users.add(new User(2, "Feditaktek", "feditaktek@gmail.com", "test1"));
        users.add(new User(3, "oussemamakor", "oussemamekor@gmail.com", "test2"));
        users.add(new User(4, "nabiltalbi", "nabiltalbi@gmail.com", "test3"));


        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
        UserDTO dto = null;
        for (User user : users) {
            usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }
        for (UserDTO dto1 : usersDTO) {
            System.out.println(dto1);
        }


        System.out.println("***************************************************************************************************************************");


        //using stream().map()  => USERS
        users
                .stream()
                .map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .forEach(userDTO -> {
                    System.out.println(userDTO);
                });

        System.out.println("***************************************************************************************************************************");

        //using stream().map()  => USERSDTO
        List<UserDTO> usersdto = users
                .stream()
                .map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .collect(Collectors.toList());
        usersdto.forEach(System.out::println);

        System.out.println("***************************************************************************************************************************");

    }
}

class UserDTO {
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}


class User {
    private int id;
    private String userName;
    private String email;
    private String password;

    public User(int id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}