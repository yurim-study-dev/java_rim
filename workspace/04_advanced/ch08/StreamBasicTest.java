package ch08;

import java.util.ArrayList;
import java.util.List;

public class StreamBasicTest {
    List<String> names = List.of("haru","namu","brong","harong");

    void forLoop(){
        List<String> filteredName = new ArrayList();

        for(int i =0; i<names.size(); i++){
            String name = names.get(i);
            if(name.startsWith("h")){ //h로 시작하는 이름만 대문자로 저장
                filteredName.add(name.toUpperCase());
            }
        }
        System.out.println(filteredName);

    }

    void streamApi(){
        List<String> filteredName = names.stream()
                .filter(name -> name.startsWith("h")) // h로 시작하는 이름만 필터링
//                .map(name -> name.toUpperCase())
                .map(String::toUpperCase) // 대문자로 반환
                .sorted()
                .distinct()

                .toList(); // 리스트로 반환
        System.out.println(filteredName);

    }

     void main() {
        forLoop();
        streamApi();

    }
}
