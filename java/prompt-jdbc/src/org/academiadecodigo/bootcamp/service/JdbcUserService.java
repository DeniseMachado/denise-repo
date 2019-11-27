package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class JdbcUserService implements UserService {


    private Connection connection;
    private User user;


    public JdbcUserService(Connection connection) {

        this.connection = connection;

    }


    @Override
    public boolean authenticate(String username, String password) {
        ResultSet resultSet;

        PreparedStatement preparedstatement = null;

        String query = "SELECT * FROM users WHERE username=? AND password=?";
        System.out.println("uhhh");
        try {
            preparedstatement = connection.prepareStatement(query);
            System.out.println("connection");

            preparedstatement.setString(1, username);
            preparedstatement.setString(2, password);

            resultSet = preparedstatement.executeQuery();


            if (resultSet.next()) {

                return true;
            }

        } catch (SQLException e) {
            e.getMessage();
        } finally {
            closeStatement(preparedstatement);
        }

        return false;

    }


    @Override
    public void add(User user) {
        ResultSet resultSet;
        PreparedStatement statement = null;

        String query = "INSERT INTO users(userName, email, password, firstName, lastName, phone)" +
                "values(?,?,?,?,?,?)";

        try {
            statement = connection.prepareStatement(query);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                statement.setString(1, user.getUsername());
                statement.setString(2, user.getEmail());
                statement.setString(3, user.getPassword());
                statement.setString(4, user.getFirstName());
                statement.setString(5, user.getLastName());
                statement.setString(6, user.getPhone());

            }

        } catch (SQLException except) {
            except.getMessage();

        } finally {
            closeStatement(statement);
        }

    }


    @Override
    public User findByName(String username) {
        PreparedStatement prepareStatement = null;

        String query = "SELECT * FROM users WHERE username='" + username + "';";

        try {

            prepareStatement = connection.prepareStatement(query);


            ResultSet resultSet = prepareStatement.executeQuery();
            System.out.println("find by name");

            if (resultSet.next()) {


                String usernameValue = resultSet.getString("username");
                String emailValue = resultSet.getString("email");
                String passwordValue = resultSet.getString("password");
                String firstNameValue = resultSet.getString("firstName");
                String lastNameValues = resultSet.getString("lastName");
                String phoneValues = resultSet.getString("phone");

                System.out.println("Da-me um user");
                return new User(usernameValue, emailValue, passwordValue, firstNameValue, lastNameValues, phoneValues);

            }

        } catch (SQLException ex) {
            ex.getMessage();


        }

        return null;


    }

    @Override
    public List<User> findAll() {

        LinkedList<User> users = new LinkedList<>();
        PreparedStatement preparedStatement;

        String query = "SELECT * FROM users;";

        try {
            preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet != null) {

                String username = resultSet.getString("username");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String firstName = resultSet.getString("firsName");
                String lastName = resultSet.getString("lastName");
                String phone = resultSet.getString("phone");

                User user = new User(username, email, password, firstName, lastName, phone);
                users.add(user);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return null;

    }


    @Override
    public int count() {

        int result = 0;

        try {

            String query = "SELECT COUNT(*) FROM users;";

            // PreparedStatement preparedStatement = connection.prepareStatement(query);

            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery(query);  //preparedStatement.executeQuery();
            if (resultSet.next()) {
                result = resultSet.getInt(1);

            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return result;
    }


    public void closeStatement(PreparedStatement statement) {

        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
