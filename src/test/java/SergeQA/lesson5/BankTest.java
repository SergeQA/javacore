package SergeQA.lesson5;

import org.junit.*;
import org.junit.Assert.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BankTest {
    static Bank privatbank;

    @BeforeClass
    public static void precondition(){
        privatbank = new Bank("Privatbank");
        System.out.println("Test class was started");
    }

    @Before
    public void messageStart(){
        System.out.println("Test started");
    }

    @After
    public void messageEnd(){
        System.out.println("Test finished");
    }

    @Test
    public void isLoanCanBeIssued() throws Exception {
        Person richMan = new Person();
        richMan.setAge(40);
        richMan.setFeedbackFlag(true);
        richMan.setSalary(30000);
        richMan.setWorkFlag(false);
        richMan.setWorkingTime(0);

        Assert.assertTrue(privatbank.isLoanCanBeIssued(richMan));
    }

    //    @Ignore ("Test disabled due to some reason")
    @Test(timeout = 3000)
    public void verifyForPensioneer(){
        Person pensioneer = new Person();
        pensioneer.setAge(55);
        pensioneer.setSalary(20000);
        pensioneer.setWorkingTime(25);

        Assert.assertTrue(privatbank.isLoanCanBeIssued(pensioneer));
    }

    @Test
    public void verifyForStudent(){
        Person student = new Person();
        student.setAge(21);
        student.setSalary(4200);
        student.setWorkFlag(true);
        student.setWorkingTime(2);

        Assert.assertTrue(privatbank.isLoanCanBeIssued(student));
    }

}
