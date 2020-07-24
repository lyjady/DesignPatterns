package org.augustus;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() throws ScriptException, NoSuchMethodException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine jsScript = manager.getEngineByName("JavaScript");
        String scriptText = " function add() { var a = 1;" +
                "var b = 2;" +
                "var c = a + b;" +
                "return c;}";
        jsScript.eval(scriptText);
        Object eval = ((Invocable) jsScript).invokeFunction("add");
        System.out.println(eval);
    }
}
