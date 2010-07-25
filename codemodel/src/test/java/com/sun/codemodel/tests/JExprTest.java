package com.sun.codemodel.tests;

import com.sun.codemodel.JExpr;
import com.sun.codemodel.tests.util.CodeModelTestsUtils;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * JExpr tests.
 */
public class JExprTest extends TestCase {

	/**
	 * Tests double literal expression.
	 */
	public void testLitDouble() throws Exception {
		Assert.assertTrue(CodeModelTestsUtils.toString(
				JExpr.lit(Double.POSITIVE_INFINITY)).endsWith(
				"POSITIVE_INFINITY"));
		Assert.assertTrue(CodeModelTestsUtils.toString(
				JExpr.lit(Double.NEGATIVE_INFINITY)).endsWith(
				"NEGATIVE_INFINITY"));
		Assert.assertTrue(CodeModelTestsUtils.toString(JExpr.lit(Double.NaN))
				.endsWith("NaN"));

	}

	public void testLitFloat() throws Exception {
		Assert.assertTrue(CodeModelTestsUtils.toString(
				JExpr.lit(Float.POSITIVE_INFINITY)).endsWith(
				"POSITIVE_INFINITY"));
		Assert.assertTrue(CodeModelTestsUtils.toString(
				JExpr.lit(Float.NEGATIVE_INFINITY)).endsWith(
				"NEGATIVE_INFINITY"));
		Assert.assertTrue(CodeModelTestsUtils.toString(JExpr.lit(Float.NaN))
				.endsWith("NaN"));

	}

}
