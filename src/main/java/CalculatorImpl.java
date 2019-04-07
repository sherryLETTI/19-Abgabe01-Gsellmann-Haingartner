import java.util.ArrayList;

public class CalculatorImpl implements Calculator{

    private ArrayList<Integer> valueArray = new ArrayList();
    private int temp = 0;

    public int sum(){

        int summ = 0;
        for (int i: valueArray){
            summ += i;
        }

        return summ;
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
