
import java.util.Scanner;

/*
 * @author snaser
 */
public class Email {
    
    private String firstname;
    private String surname;
    private String department;
    private String email;
    private String password;
    private int passwordLength = 10;
    private int mailboxCapacity;
    private String companySuffix = "company.com";
    private String alternateEmail;
    
    // constructor with firstname and lastname parameters
    public Email()
    {
        this.firstname = setFirstName();
        this.surname = setSurname();
        this.department = setDepartment();
        
        this.password = randomPassword(passwordLength);
        
        this.email = firstname.toLowerCase() + "." + surname.toLowerCase() + "@" + department  + companySuffix;
    }
 
    //input department code to set department
    private String setDepartment()
    {
        System.out.println("DEPARTMENT CODES: \n1 for Sales \n2 for Development \n3 for Accounting \nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        
        if(deptChoice == 1){ return "sales.";}
        else if(deptChoice == 2){ return "development.";}
        else if(deptChoice == 3){ return "accounting.";}
        else { return "";}
    }
    
    //input firstname
    private String setFirstName()
    {
        System.out.println("Enter your first name: ");
        Scanner in = new Scanner(System.in);
        String fname = in.next();
        this.firstname = fname;
        
        return fname;
    }
    
    //input surname
    private String setSurname()
    {
        System.out.println("Enter your last name: ");
        Scanner in = new Scanner(System.in);
        String sname = in.next();
        this.surname = sname; 
        
        return sname;
    } 
    
    //set mailbox capacity
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }
    
    //set alternative email address
    public void altEmail(String altEmail)
    {
        this.alternateEmail = altEmail;
    }
    
    //change the password
    public void changePassword(String pword)
    {
        this.password = pword;
    }
    
    // generate random password
    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890.!%#$";
        char[] password = new char[length];
        
        for(int i = 0; i<length; i++)
        {
          int random = (int) (Math.random() * passwordSet.length());
          password[i] = passwordSet.charAt(random);
        }
        
    return new String(password);
    }
    
    //return the mailbox capacity
    public int getMailboxCapacity()
    {
        return mailboxCapacity;
    }
    
    //return alternate email
    public String getAlternateEmail()
    {
        return alternateEmail;
    }        
    
    //return password
    public String getPassword()
    {
        return password;
    }        
    
    //print info
   public void getInfo()
   {
       System.out.println("Display name: " + firstname + " " + surname + "\n" +
               "Company email: " + email + "\n" +
               "Password: " + password + "\n" +
               "Mailbox Capacity: " + mailboxCapacity + "mb");
   }
}
