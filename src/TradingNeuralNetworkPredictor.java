
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.indexing.INDArrayIndex;
import org.nd4j.linalg.indexing.NDArrayIndex;

public class TradingNeuralNetworkPredictor extends AbstractNeuralNetworkPredictor<Object, Object> {

    @Override
    protected INDArray buildPredictionFeatures(Object item) {
	int vectorSize = 9;

	double[][] itemVectors = new double[1441][vectorSize];
	int index = 0;
	INDArray features = Nd4j.create(new int[] { 1441, vectorSize, 1441 }, 'f');

	for (int i = 0; i < 1441; i++) {

	    itemVectors[index][0] = 0;
	    itemVectors[index][1] = 0;
	    itemVectors[index][2] = 0;
	    itemVectors[index][3] = 0;
	    itemVectors[index][4] = 0;
	    itemVectors[index][5] = 0;
	    itemVectors[index][6] = 0;
	    itemVectors[index][7] = 1;
	    itemVectors[index][8] = 2;
	    index++;

	}
	final INDArray vectors = Nd4j.create(itemVectors);

	features.put(new INDArrayIndex[] { NDArrayIndex.point(0), NDArrayIndex.all(), NDArrayIndex.interval(0, 1441) },
		vectors);
	return features;
    }

    @Override
    protected Object buildPredictionResult(Object input, INDArray output) {

	return null;
    }

}
