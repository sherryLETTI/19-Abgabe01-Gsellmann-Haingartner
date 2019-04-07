import java.util.ArrayList;

public class CalculatorImpl implements Calculator{

    private ArrayList<Integer> valueArray = new ArrayList();
    private int temp = 0;

    public int sum(){
        return 0;
    }

    public int getMaximum(){
        return 0;
    }

    public int getMinimum(){
        temp = valueArray.get(0);
        for(int i = 0; i < valueArray.size()-1; i++){
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
