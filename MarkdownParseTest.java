import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
        assertEquals(2, 1 + 1);
    }
   
}


//javac -cp ".;lib/junit-4.13.2.jar;lib\hamcrest-core-1.3.jar"  MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest 