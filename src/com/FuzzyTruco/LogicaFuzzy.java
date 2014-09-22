package com.FuzzyTruco;

import net.sourceforge.jFuzzyLogic.*;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class LogicaFuzzy {
	public static void main(String[] args) throws Exception {
        // Load from 'FCL' file
        String fileName = "src/com/FuzzyTruco/fuzzy.fcl";
        FIS fis = FIS.load(fileName,true);

        // Error while loading?
        if( fis == null ) { 
            System.err.println("Can't load file: '" + fileName + "'");
            return;
        }
        
        // Show 
        JFuzzyChart.get().chart(fis.getFunctionBlock("truco"));

        // Set inputs
        fis.setVariable("carta1", 12);
        fis.setVariable("carta2", 13);
        fis.setVariable("carta3", 14);

        // Evaluate
        fis.evaluate();

        // Show output variable's chart
        Variable mao = fis.getFunctionBlock("truco").getVariable("mao");
        JFuzzyChart.get().chart(mao, mao.getDefuzzifier(), true);

        // Print ruleSet
        System.out.println(fis);
	}
}
