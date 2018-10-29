
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.util.ModelSerializer;

public class NeuralNetworkDao {
    private ReentrantLock lock = new ReentrantLock();

    private String fileName = "net";

    private String buildPath() {
	return fileName;
    }

    public MultiLayerNetwork readModel() {
	lock.lock();
	try {
	    return ModelSerializer.restoreMultiLayerNetwork(buildPath(), false);
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    lock.unlock();
	}
	return null;
    }

}
