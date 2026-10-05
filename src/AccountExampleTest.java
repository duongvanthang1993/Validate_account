public class AccountExampleTest {
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[] { "123abc", "_abc123", "_______", "123456", "abcdefgh" };
    public static final String[] invaliAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
        for (String acount : invaliAccount) {
            boolean isValid = accountExample.validate(acount);
            System.out.println("Account is " + acount + " is valid " + isValid);
        }
    }

}
