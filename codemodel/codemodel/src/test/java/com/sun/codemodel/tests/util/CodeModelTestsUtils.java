package com.sun.codemodel.tests.util;

import java.io.StringWriter;

import junit.framework.Assert;

import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFormatter;

/**
 * Various utilities for codemodel tests.
 * 
 * @author Aleksei Valikov
 */
public class CodeModelTestsUtils {

	/** Hidden constructor. */
	private CodeModelTestsUtils() {
	}

	/**
	 * Prints an expression into a string.
	 * 
	 * @param expression
	 *            expression to print into a string.
	 * @return Expression formatted as a string.
	 */
	public static String toString(JExpression expression) {
		if (expression == null) {
			throw new IllegalArgumentException("Expression must not be null.");
		}
		final StringWriter stringWriter = new StringWriter();
		final JFormatter formatter = new JFormatter(stringWriter);
		expression.generate(formatter);
		return stringWriter.toString();
	}
}
