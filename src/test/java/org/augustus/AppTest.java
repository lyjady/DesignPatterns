package org.augustus;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine jsScript = manager.getEngineByName("JavaScript");
        String scriptText = "var a = 1;" +
                "var b = 2;" +
                "var c = a + b;";
        jsScript.eval(scriptText);
        System.out.println(jsScript.get("c"));
    }
}
