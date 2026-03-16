import javax.swing.JOptionPane;

public class BadDate
{
   public static void main(String[] args)
   {
      String yearString;
      String monthString;
      String dayString;

      int year;
      int month;
      int day;

      boolean valid = true;

      // Get user input
      yearString = JOptionPane.showInputDialog("Enter year:");
      monthString = JOptionPane.showInputDialog("Enter month:");
      dayString = JOptionPane.showInputDialog("Enter day:");

      // Convert Strings to integers
      year = Integer.parseInt(yearString);
      month = Integer.parseInt(monthString);
      day = Integer.parseInt(dayString);

      // Check if date is valid
      if (month < 1 || month > 12)
         valid = false;

      if (day < 1 || day > 31)
         valid = false;

      // Display result
      if (valid)
      {
         System.out.println(month + "/" + day + "/" + year + " is a valid date.");
      }
      else
      {
         System.out.println(month + "/" + day + "/" + year + " is an invalid date.");
      }

      System.exit(0);
   }
}
