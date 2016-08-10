import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
   String message = "Hello World1";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      Assert.assertEquals(message, messageUtil.printMessage());
   }
}
