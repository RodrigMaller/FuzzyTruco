

import net.sourceforge.jFuzzyLogic.*;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class LogicaFuzzy {
	public static void main(String Args[]) throws Exception {
        // Load from 'FCL' file
        String fileName = "src/fuzzy.fcl";
        FIS fis = FIS.load(fileName,true);

        // Error while loading?
        if( fis == null ) { 
            throw new Exception("Can't load file: '" + fileName + "'");
        }
        
        // Show 
        //JFuzzyChart.get().chart(fis.getFunctionBlock("jogada"));
        
        // Set inputs
        fis.setVariable("jogada", "carta_mais_alta", 8);
        fis.setVariable("jogada", "carta_adversario", -13);
        fis.setVariable("jogada", "resultado_parcial", 1);
        fis.setVariable("jogada", "posicao", 0);

        // Evaluate
        fis.evaluate();
        
        // Show output variable's chart
        Variable jogada = fis.getFunctionBlock("jogada").getVariable("jogada");
        System.out.println("deffuz--"+jogada.defuzzify());
        //JFuzzyChart.get().chart(jogada, jogada.getDefuzzifier(), true);

        // Print ruleSet
        //System.out.println(fis);
        return ;
	}
}
