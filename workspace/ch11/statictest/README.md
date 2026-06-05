# 📚 Static 멤버 실습 정리

## 개요

Static이 무엇인지, 어떻게 사용하는지를 배우는 실습 폴더입니다.

**핵심:** static 멤버는 객체를 만들지 않고도 바로 사용할 수 있습니다!

---

## 📁 파일 구성

### 1️⃣ MathUtil.java
**수학 관련 도구 클래스**

```java
public class MathUtil {
    // static 필드: 원주율 (공용 상수)
    final static double PI = 3.14159;
    
    // 인스턴스 필드: 반지름 (객체마다 다름)
    int r = 5;
    
    // static 메서드: 더하기
    static int add(int n1, int n2) {
        return n1 + n2;
    }
}
```

#### 세 가지 것의 차이

| 것 | 종류 | 설명 | 비유 |
|----|------|------|------|
| `static double PI` | static 필드 | 모두가 공유하는 원주율 | 학교 시간표 |
| `int r` | 인스턴스 필드 | 각 객체마다 다른 반지름 | 학생 이름 |
| `static int add()` | static 메서드 | 객체 없어도 사용 가능 | 계산기 |

#### 쉬운 설명

```
static = 공용 물건

PI는 원주율이니까 항상 3.14159
어떤 객체든 똑같음!

add는 더하기 기능
누가 사용하든 같은 결과
```

---

### 2️⃣ MathUtilTest.java
**MathUtil을 실제로 사용하는 파일**

```java
public class MathUtilTest {
    public static void main(String[] args) {
        // 원의 넓이 = π × r²
        double area = MathUtil.PI * 5 * 5;
        System.out.println("반지름 5인 원의 넓이는 " + area + " 입니다.");
        
        // 덧셈
        System.out.println("3 + 5 = " + MathUtil.add(3, 5));
    }
}
```

#### 사용 방법

```
❌ new MathUtil(); ← 객체 만들 필요 없음!

✅ MathUtil.PI ← 클래스명으로 바로 접근!
✅ MathUtil.add(3, 5) ← 클래스명으로 바로 호출!
```

#### 출력 결과

```
반지름 5인 원의 넓이는 78.53975 입니다.
3 + 5 = 8
```

#### 핵심

```
static 멤버는 객체 생성 없이 바로 사용!
클래스명.멤버 형식으로 접근
```

---

### 3️⃣ MainMethodTest.java
**main 메서드에서 static/일반 메서드를 호출하는 방법**

```java
public class MainMethodTest {
    // 일반 메서드 (인스턴스 메서드)
    public void instanceMethod() {
        System.out.println("인스턴스 메서드 호출.");
    }
    
    // static 메서드
    public static void staticMethod() {
        System.out.println("static 메서드 호출.");
    }
    
    // Java 21 이전
    public static void main(String[] args) {
        // ✅ static 메서드는 바로 호출 가능
        staticMethod();
        
        // ❌ 일반 메서드는 바로 호출 불가능 (에러!)
        // instanceMethod();
        
        // ✅ 객체를 만든 후에는 호출 가능
        MainMethodTest m = new MainMethodTest();
        m.instanceMethod();
    }
    
    // Java 21 이후 (새로운 방식)
    void main() {
        staticMethod();       // 가능
        instanceMethod();     // 가능
    }
}
```

#### 핵심 문제: main 메서드의 특성

```
main은 프로그램의 시작점이고, static이다!

┌─────────────────────────────────────────────────┐
│                                                   │
│ ✅ static 메서드: 바로 호출 가능                 │
│    왜? 객체 없어도 이미 존재하기 때문            │
│                                                   │
│ ❌ 일반 메서드: 바로 호출 불가능 (Java 21 이전) │
│    왜? 객체가 없으면 메서드도 없기 때문          │
│                                                   │
│ ✅ 해결방법: 먼저 객체를 만들면 된다!            │
│    new MainMethodTest()                          │
│                                                   │
└─────────────────────────────────────────────────┘
```

#### 메모리 관점

```
프로그램 시작
    ↓
main() 메서드 실행 (static이므로 바로 실행)
    ↓
main 안에서:
  - static 메서드: ✅ 이미 메모리에 있으니까 호출 가능
  - 일반 메서드: ❌ 아직 객체가 없으니까 호출 불가능
                    → 먼저 new로 객체를 만들어야 함
```

#### Java 21부터의 변화

```
Java 20 이전:
public static void main(String[] args) { ... }

Java 21 이후:
void main() { ... }

차이: static 없이도 가능해짐!
```

---

## 🎯 세 파일의 관계

```
MathUtil.java
  ↓
  (여기서 static 멤버 정의)
  ├─ static 필드: PI
  └─ static 메서드: add()
  
      ↓ 사용됨
      
MathUtilTest.java
  ↓
  (MathUtil의 static 멤버 사용)
  ├─ MathUtil.PI 접근
  └─ MathUtil.add() 호출
  
      ↓ main 메서드에서 실행
      
MainMethodTest.java
  ↓
  (main 메서드의 특성을 보여줌)
  ├─ static 메서드: ✅ 바로 호출
  ├─ 일반 메서드: ❌ 객체 필요
  └─ Java 21 이후는 둘 다 가능
```

---

## 💡 배운점

1. ✅ `static` 필드는 모든 객체가 공유한다.
2. ✅ `static` 메서드는 객체 생성 없이 호출 가능하다.
3. ✅ `클래스명.멤버` 형식으로 접근한다.
4. ✅ `main()` 메서드는 `static`이므로 프로그램 시작점이 될 수 있다.
5. ✅ `main()` 내에서 일반 메서드를 호출하려면 먼저 객체를 만들어야 한다.
6. ✅ `Java 21`부터는 `static` 없는 `main()` 메서드도 가능하다.

---

## 실생활 비유

```
MathUtil = 공공 도서관
├─ PI = 도서관의 규칙 (모두 동일)
└─ add() = 사서의 계산 기능 (누가 와도 가능)

MathUtilTest = 도서관 방문객
└─ "규칙이 뭐예요?" (PI 확인)
└─ "3+5가 뭐예요?" (add 사용)

MainMethodTest = 프로그램의 시작 부분
└─ static 메서드는 처음부터 있으니까 바로 호출
└─ 일반 메서드는 먼저 객체를 만들어야 호출 가능
```

---

## 🔥 가장 중요한 것

```
static = 객체 없이도 바로 사용 가능!

MathUtil util = new MathUtil();  ← 안 해도 됨!
util.PI;                          ← 이건 에러

MathUtil.PI;                      ← 이렇게 해!
```
