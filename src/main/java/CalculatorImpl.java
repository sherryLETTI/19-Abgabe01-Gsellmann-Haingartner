import java.util.ArrayList;

public class CalculatorImpl implements Calculator{

    private ArrayList<Integer> valueArray = new ArrayList();
    private int temp = 0;

    public int sum(){
        int sum = 0;
        for(int i = 0; i < valueArray.size(); i++){
            sum += valueArray.get(i);
        }
        return sum;
    }

    public int getMaximum(){
        temp = valueArray.get(0);
        for(int i = 0; i < valueArray.size(); i++){
            if(temp < valueArray.get(i)){
                temp = valueArray.get(i);
            }
        }
        return temp;
    }

    public int getMinimum(){
        temp = valueArray.get(0);
        for(int i = 0; i < valueArray.size(); i++){
            if(temp > valueArray.get(i)){
                temp = valueArray.get(i);
            }
        }
        return temp;
    }

    public void addValue(int value){
        valueArray.add(value);
    }
}
