import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest extends BaseTest{

    @Test
    public void testOne(){
        getFirstPage().clickLink();
        String text = getSecondPage().getData();
        Assert.assertEquals(text, "Java");
    }
}
