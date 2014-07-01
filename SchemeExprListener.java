// Generated from SchemeExpr.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SchemeExprParser}.
 */
public interface SchemeExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull SchemeExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull SchemeExprParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(@NotNull SchemeExprParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(@NotNull SchemeExprParser.DefineContext ctx);

	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#doublel}.
	 * @param ctx the parse tree
	 */
	void enterDoublel(@NotNull SchemeExprParser.DoublelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#doublel}.
	 * @param ctx the parse tree
	 */
	void exitDoublel(@NotNull SchemeExprParser.DoublelContext ctx);

	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull SchemeExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull SchemeExprParser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#progl}.
	 * @param ctx the parse tree
	 */
	void enterProgl(@NotNull SchemeExprParser.ProglContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#progl}.
	 * @param ctx the parse tree
	 */
	void exitProgl(@NotNull SchemeExprParser.ProglContext ctx);

	/**
	 * Enter a parse tree produced by {@link SchemeExprParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull SchemeExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeExprParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull SchemeExprParser.MulDivContext ctx);
}