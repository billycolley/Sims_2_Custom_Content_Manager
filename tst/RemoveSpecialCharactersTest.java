import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class RemoveSpecialCharactersTest {
    @Test
    public void removeSpecialCharactersTest() {
        System.out.println("Inside Tests for RemoveSpecialCharacters");
        String noSpecials = RemoveSpecialCharacters.remove("Test Name$%-Check_Here");
        Assert.assertEquals("String with removed characters does not match expected", "TestName-Check_Here", noSpecials);
    }

}
