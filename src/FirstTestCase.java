/* test case
1. Setup - open browser
2. Login
3. Close
 */


import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    void setup()
    {
        System.out.println("This is setup test");
    }

    @Test
    void login()
    {
        System.out.println("This is login test");
    }

    @Test
    void teardown()
    {
        System.out.println("Closing browser");
    }
}
