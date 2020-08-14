package org.augustus.design.interpreter;

import java.util.HashMap;

/**
 *
 * @author Administrator
 *
 */
public abstract class Expression {
	public abstract int interpreter(HashMap<String, Integer> var);
}
