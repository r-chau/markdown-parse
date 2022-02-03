import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);

        
        String contents1= Files.readString(Path.of("./newBreakingTest.md"));
        List<String> expect1 = List.of("Some link");
        assertEquals(MarkdownParse.getLinks(contents1), expect1);
    

    }

   
}


//javac -cp ".;lib/junit-4.13.2.jar;lib\hamcrest-core-1.3.jar"  MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest 