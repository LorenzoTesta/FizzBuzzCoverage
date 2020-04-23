package xyz.testalorenzo.multiutility;

import org.junit.jupiter.api.Test;
import org.mockito.AdditionalAnswers;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

class UtilitiesTest {

    @Test
    void getCustomStringFirstVersion() {
        List<String> params = new ArrayList<>();
        params.add("pippo");
        params.add("paperino");

        Internationalization internationalization = new Internationalization();
        Caos caos = new Caos();
        Utilities utilities =  new Utilities(internationalization, caos);
        List<String> result = utilities.getCustomString(params);

        List<String> expected = new ArrayList<>();
        expected.add("iiiiioooooppppppppppppppp77");
        expected.add("aaaaaeeeeeiiiiinnnnnooooopppppppppprrrrr77");

        assertEquals(expected, result);
    }

    @Test
    void getCustomStringSecondVersion() throws InterruptedException {
        List<String> params = new ArrayList<>();
        String firstStr = "pippo";
        params.add(firstStr);
        String secondStr = "paperino";
        params.add(secondStr);

        Internationalization internationalization = Mockito.mock(Internationalization.class);
        Mockito.when(internationalization.translate(anyString())).then(AdditionalAnswers.returnsFirstArg());

        Caos caos = Mockito.mock(Caos.class);
        Mockito.when(caos.slowFn(anyString())).then(AdditionalAnswers.returnsFirstArg());
        Mockito.doNothing().when(caos).notifySomething(anyString());

        Utilities utilities =  new Utilities(internationalization, caos);

        List<String> result = utilities.getCustomString(params);

        List<String> expected = new ArrayList<>();
        expected.add(firstStr + "77");
        expected.add(secondStr + "77");

        assertEquals(expected, result);
        int wantedNumberOfInvocations = expected.size();
        Mockito.verify(caos, Mockito.times(wantedNumberOfInvocations)).notifySomething(anyString());
    }
}
