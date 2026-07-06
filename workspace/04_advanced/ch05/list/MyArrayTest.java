package ch05.list;

public class MyArrayTest {
    void main(){

        MyList<String> arr = new MyArray<>();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<1000; i++){
                    if(arr.size()>0){ // remove를 하기 전에 안전하게 사이즈 먼저 체크
                        arr.remove(0);
                    }
                    arr.add("데이터 - " +i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<1000; i++){
                    arr.add("데이터 - " +i);
                }
            }
        }).start();


    }
}