package mysql.labs;


/*
 *  MySQL Exercise 4:
 *
 *   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
 *   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
 *   demonstrate how to:
 *
 *   Note: CRUD means (Create, Read, Update, Delete)
 *
 *       1.) CRUD new flights
 *       2.) CRUD new passengers
 *       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
 *
 *
 *   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not
 *   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
 *   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484
 *
 */

import java.sql.*;

public class Exercise_04 {

    public static void main(String[] args) {

        /*
        Just as a casual example - each of these operations should be in its own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

        ...


         */
    }

    public void queryFlight(int id, int pilot) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/air_travel?"
                    + "user=root&password=password"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager
                    .getConnection(connectionString);

            statement = connection.createStatement();

            resultSet = statement
                    .executeQuery("select * from air_travel.flights");

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                pilot = resultSet.getInt("pilot");

                System.out.println("Flight " + id + " is being flown by pilot number " + pilot + ".");
            }

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void createFlight(int pilot, int plane, String date, int origin, int destination, String eta) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/air_travel?"
                    + "user=root&password=password"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager
                    .getConnection(connectionString);

            statement = connection.createStatement();

            resultSet = statement
                    .executeQuery("insert into * air_travel.flights " +
                            "(plane, " +
                            "pilot, " +
                            "date, " +
                            "origin, " +
                            "destination, " +
                            "estimated_travel_time)" +
                            "VALUES " +
                            pilot + ", " +
                            plane + ", " +
                            "\"" + date + "\"" + ", " +
                            origin + ", " +
                            destination + ", " +
                            "\"" + eta + "\"");

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateFlight(int pilotA, int pilotB) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/air_travel?"
                    + "user=root&password=password"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager
                    .getConnection(connectionString);

            statement = connection.createStatement();

            resultSet = statement
                    .executeQuery("UPDATE air_travel.flights SET pilot = " + pilotA + " WHERE pilot = " + pilotB);

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteFlight(int id) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/air_travel?"
                    + "user=root&password=password"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager
                    .getConnection(connectionString);

            statement = connection.createStatement();

            resultSet = statement
                    .executeQuery("DELETE from air_travel.flights WHERE id = " + id);

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void queryPassengers(int id) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/air_travel?"
                    + "user=root&password=password"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager
                    .getConnection(connectionString);

            statement = connection.createStatement();

            resultSet = statement
                    .executeQuery("select * from air_travel.flights");

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String mealPref = resultSet.getString("meal_pref");

                System.out.println("Passenger "
                        + id + " is named "
                        + firstName + " " + lastName
                        + " and their meal preference is " + mealPref);
            }

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void createPassenger(String firstName, String lastName, String mealPref) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/air_travel?"
                    + "user=root&password=password"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager
                    .getConnection(connectionString);

            statement = connection.createStatement();

            resultSet = statement
                    .executeQuery("insert into * air_travel.passengers " +
                            "(first_name, " +
                            "last_name, " +
                            "frequent_flyer_club, " +
                            "meal_pref, " +
                            "VALUES " +
                            "\"" + firstName + "\"" + ", " +
                            "\"" + lastName + "\"" + ", " +
                            "\"" + mealPref + "\"");

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updatePassenger(int id, String firstName, String lastName) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/air_travel?"
                    + "user=root&password=password"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager
                    .getConnection(connectionString);

            statement = connection.createStatement();

            resultSet = statement
                    .executeQuery("UPDATE air_travel.passengers SET first_name = "
                            + firstName + ", last_name = "
                            + lastName + " WHERE id = "
                            + id);

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deletePassenger(int id) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/air_travel?"
                    + "user=root&password=password"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager
                    .getConnection(connectionString);

            statement = connection.createStatement();

            resultSet = statement
                    .executeQuery("DELETE from air_travel.passengers WHERE id = " + id);

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
