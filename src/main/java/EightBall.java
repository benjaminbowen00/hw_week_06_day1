

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> predictions;

//    public EightBall() {
//        this.predictions = new ArrayList<>(Arrays.asList("xyz", "abc"));
//    }

    public EightBall(ArrayList<String> options) {
        this.predictions = options;

    }

    public void printPredictions(){
        for (String p : this.predictions) {
            System.out.println(p);
        }
    }

    public int numberOfAnswers() {
        return this.predictions.size();
    }

    public String randomAnswer() {
        Collections.shuffle(predictions);
        return predictions.get(0);
    }

    public void addPrediction(String prediction) {
        this.predictions.add(prediction);
    }

    public void removePrediction(String prediction) {
        this.predictions.remove(prediction);
    }

    public void removePredictionByIndex(int position) {
        this.predictions.remove(position);
    }

    public String getPredictionByIndex(int position) {
        return this.predictions.get(position);
    }

}
