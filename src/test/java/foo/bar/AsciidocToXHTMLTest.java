package foo.bar;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.OptionsBuilder;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class AsciidocToXHTMLTest {


    @Test
    public void shouldConvertToXHTML() {

        Asciidoctor asciidoctor = Asciidoctor.Factory.create();

        asciidoctor.convertFile(
            new File("target/test-classes/programmatic.adoc"),
            OptionsBuilder.options().backend("xhtml5").toDir(new File("target")));

        assertTrue(new File("target/programmatic.html").exists());

    }

}
