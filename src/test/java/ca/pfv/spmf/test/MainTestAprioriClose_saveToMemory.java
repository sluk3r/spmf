package ca.pfv.spmf.test;

import ca.pfv.spmf.NoExceptionAssertion;
import ca.pfv.spmf.algorithms.frequentpatterns.apriori_close.AlgoAprioriClose;
import ca.pfv.spmf.patterns.itemset_array_integers_with_count.Itemsets;
import org.junit.Test;

/**
 * Example of how to use APRIORIClose (a.k.a Close)
 * algorithm from the source code.
 *
 * @author Philippe Fournier-Viger (Copyright 2008)
 */
public class MainTestAprioriClose_saveToMemory {

    @Test
    public void main() {

        NoExceptionAssertion.assertDoesNotThrow(() -> {

            String input = "contextPasquier99.txt";
            String output = null;
            // Note : we here set the output file path to null
            // because we want that the algorithm save the
            // result in memory for this example.

            double minsup = 0.4; // means a minsup of 2 transaction (we used a relative support)

            // Applying the Apriori algorithm
            AlgoAprioriClose apriori = new AlgoAprioriClose();
            Itemsets result = apriori.runAlgorithm(minsup, input, output);
            apriori.printStats();
            result.printItemsets(apriori.getDatabaseSize());
        });
    }
}
