import java.util.*;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;


public class SchemeEvalVisitor extends SchemeExprBaseVisitor<Double> {

 Map<String, Double> memory = new HashMap<String, Double>();

 @Override
 public Double visitAddSub(SchemeExprParser.AddSubContext ctx) {
 List<Double> list = new ArrayList<Double>();
 Double res = 0.0;
 for (SchemeExprParser.ExprContext expr : ctx.expr())
 list.add(visit(expr));
 int count = list.size();

 if (ctx.op.getText().charAt(0) == '-') {
  // System.out.println("Sub");
   if ( count == 0) {
     System.out.println("illegal");
   }
   else if (count == 1) {
     res = res - list.get(0);
   }
   else if (count > 1){
     res = list.get(0);
     for (int i = 1; i < count; i++){
       res = res - list.get(i);
     }
   }
 }
 else if (ctx.op.getText().charAt(0) == '+') {
  //  System.out.println("Add");
    for (int i = 0; i < count; i++){
      res = res + list.get(i);
    }
  }
  return res;
  }


   @Override
   public Double visitMulDiv(SchemeExprParser.MulDivContext ctx) {
     List<Double> list = new ArrayList<Double>();
     Double res = 1.0;
     for (SchemeExprParser.ExprContext expr : ctx.expr())
     list.add(visit(expr));
     int count = list.size();


 if (ctx.op.getText().charAt(0) == '/') {
  // System.out.println("Div");
   if ( count == 0) {
     System.out.println("illegal");
   }
   else if (count == 1) {
     res = res / list.get(0);
   }
   else if (count > 1){
     res = list.get(0);
     for (int i = 1; i < count; i++){
       res = res / list.get(i);
     }
   }
 }
 else if (ctx.op.getText().charAt(0) == '*') {
    //System.out.println("Mul");
    for (int i = 0; i < count; i++){
      res = res * list.get(i);
    }
  }
  return res;
  }

   @Override
   public Double visitProgl(SchemeExprParser.ProglContext ctx) {
     List<Object> list = new ArrayList<Object>();
     for (SchemeExprParser.ExprContext expr : ctx.expr())
       list.add(visit(expr));
     System.out.println(list.get(list.size() - 1));
     return 0.0;
   }

   @Override
   public Double visitDoublel(SchemeExprParser.DoublelContext ctx) {
     return Double.valueOf(ctx.DOUBLE().getText());
   }

   @Override
   public Double visitDefine(SchemeExprParser.DefineContext ctx) {
     String id = ctx.ID().getText();
     double value = visit(ctx.expr());
     memory.put(id,value);
     return value;
  }

   @Override
   public Double visitId(SchemeExprParser.IdContext ctx) {
     String id = ctx.ID().getText();
     if (memory.containsKey(id)) return memory.get(id);
     return 0.0;
   }
 }
