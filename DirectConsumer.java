package consumer;

import java.util.List;
import java.util.logging.Logger;

import sorting.algorithm.BubbleSort;

public class DirectConsumer {

	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());

	public static void main(String[] args) {

		// we can use direct method BubbleSort rather than using MySortingUtilConsumer

		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));

		logger.info(sorted.toString());
	}

}
