
public class Index {
  public static void main(String[] args) {
    
    int[] myNum = {20, 10, 40, 90, 50};
    int tempSort;

    for (int i = 0; i < myNum.length; i++) {
            
        for (int j = 0; j < myNum.length; j++) {
            if(myNum[i] < myNum[j]){
                
                tempSort = myNum[i];
                myNum[i] = myNum[j]; 
                myNum[j] = tempSort;
            }
        }
    }

    //Output
    for (int x = 0; x < myNum.length; x++){
        System.out.println(myNum[x]);
    }

  }
}