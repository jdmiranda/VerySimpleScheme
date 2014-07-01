// Generated from SchemeExpr.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SchemeExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SchemeExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull SchemeExprParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(@NotNull SchemeExprParser.DefineContext ctx);

	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#doublel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublel(@NotNull SchemeExprParser.DoublelContext ctx);

	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#AddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull SchemeExprParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#progl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgl(@NotNull SchemeExprParser.ProglContext ctx);

	/**
	 * Visit a parse tree produced by {@link SchemeExprParser#MulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull SchemeExprParser.MulDivContext ctx);
}