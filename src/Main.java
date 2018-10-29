
public class Main {

    public static void main(String[] args) {
	NeuralNetworkDao dao = new NeuralNetworkDao();
	TradingNeuralNetworkPredictor predictor = new TradingNeuralNetworkPredictor();
	predictor.setDao(dao);
	predictor.predict(null);
    }

}
