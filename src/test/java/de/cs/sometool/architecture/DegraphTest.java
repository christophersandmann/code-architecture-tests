
package de.cs.sometool.architecture;


import de.schauderhaft.degraph.configuration.NamedPattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static de.schauderhaft.degraph.check.Check.classpath;
import static de.schauderhaft.degraph.check.JCheck.violationFree;
import static de.schauderhaft.degraph.check.JLayer.*;
import static de.schauderhaft.degraph.check.JLayer.anyOf;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class DegraphTest {

    @Test
    public void dependencyCycles() {
        //@formatter:off        
        assertThat(classpath().noJars().including("de.cs.**")
                .withSlicing("layer", new NamedPattern("de.cs.sometool.**.repo.**", "repo"),
                                      new NamedPattern("de.cs.sometool.**.service.**", "service"),
                                      new NamedPattern("de.cs.sometool.**.model.domain.**", "domain"),
                                      new NamedPattern("de.cs.sometool.**.model.dto.**", "dto"),
                                      new NamedPattern("de.cs.sometool.**.view.**", "view")
                                      )
               .allowDirect("view", anyOf("service", "dto"))
               .allow("view", "service", "repo", oneOf("domain", "dto"))
                ,
                is(violationFree()));
    }
}
