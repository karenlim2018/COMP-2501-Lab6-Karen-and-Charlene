package ca.bcit.comp2501.lab6.karenandcharlene;

/**
 * Generates a name using parts of the user's first name, last name, mother's maiden name, and city of birth.
 * @author Karen Lim and Charlene Zhang
 * @version 1.0
 */

public class StarWarsName
{

    private static final int FIRST_NAME_PART = 3;
    private static final int LAST_NAME_PART = 2;
    private static final int MOTHER_MAIDEN_NAME_PART = 2;
    private static final int CITY_BIRTH_PART = 3;
    private static final String DELIMITER = "\\|";


    public static void main(final String[] args)
    {

        if (args.length == 0 || args[0].isEmpty())
        {
            throw new IllegalArgumentException("Missing data");
        }

        // Fill in here

        System.out.format("Your Star Wars name is: %s %s%n", firstName, lastName);
    }

    /**
     * Generates the Star Wars first name by combining parts of the user's first name and last name.
     * @param firstName The user's first name
     * @param lastName The user's last name
     * @return The generated Star Wars first name
     */

    private static String generateFirstName(final String firstName,
                                            final String lastName)
    {
        // Fill in here
    }

    /**
     * Generates the Star Wars last name by combining parts of the user's mother's maiden name and city of birth.
     * @param motherMaidenName The user's mother's maiden name
     * @param cityOfBirth The city where the user was born
     * @return The generated Star Wars last name
     */
    private static String generateLastName(final String motherMaidenName,
                                           final String cityOfBirth)
    {
        // Fill in here
    }

    /**
     * Capitalizes the first letter of the given string and makes the rest of the string lowercase.
     * @param str The string to be capitalized
     * @return The capitalized string
     */
    private static String capitalize(final String str)
    {
        // Fill in here
    }
}
