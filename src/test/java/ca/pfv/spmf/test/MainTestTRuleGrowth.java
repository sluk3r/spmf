package ca.pfv.spmf.test;

import ca.pfv.spmf.NoExceptionAssertion;
import ca.pfv.spmf.algorithms.sequential_rules.trulegrowth.AlgoTRuleGrowth;
import org.junit.Test;

/**
 * Example of how to use the TRULEGROWTH algorithm in source code.
 *
 * @author Philippe Fournier-Viger (Copyright 2010)
 */
public class MainTestTRuleGrowth {

    @Test
    public void main() {
        NoExceptionAssertion.assertDoesNotThrow(() -> {
            String input = "contextPrefixSpan.txt";  // the database
            String output = ".//output.txt";  // the path for saving the frequent itemsets found

            //  Applying RuleGROWTH algorithm with minsup = 3 sequences and minconf = 0.5
            double minsup = 0.7;
            double minconf = 0.8;
            int windowSize = 3;


            AlgoTRuleGrowth algo = new AlgoTRuleGrowth();

            // This optional parameter allows to specify the maximum number of items in the
            // left side (antecedent) of rules found:
//		algo.setMaxAntecedentSize(1);  // optional

            // This optional parameter allows to specify the maximum number of items in the
            // right side (consequent) of rules found:
//		algo.setMaxConsequentSize(2);  // optional

            algo.runAlgorithm(minsup, minconf, input, output, windowSize);

            // print statistics
            algo.printStats();
        });
    }
}
