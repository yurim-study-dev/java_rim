# 🔒 캡슐화(Encapsulation) 실습 정리

## 개요

**캡슐화**: 객체의 데이터를 보호하고, 안전하게 변경하도록 제어하는 기법입니다.

**핵심:** private으로 데이터를 잠그고, Getter/Setter로만 접근하게 하자!

---

## 🚨 캡슐화가 필요한 이유

### 문제: 캡슐화 없을 때

```java
public class Student {
    public int age;  // public이면 아무나 변경 가능
}

Student s = new Student();
s.age = -100;  // 말이 안 되는 나이! 😱
s.age = 999;   // 또 이것도? 😱
```

### 해결: 캡슐화 적용

```java
public class Student {
    private int age;  // private으로 보호
    
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("유효한 나이가 아닙니다!");
        } else {
            this.age = age;  // 검사 후에만 저장
        }
    }
    
    public int getAge() {
        return age;
    }
}

Student s = new Student();
s.setAge(-100);  // 거절됨! ✅
s.setAge(20);    // 받아들여짐! ✅
```

---

## 📁 폴더 구조

```
capsule/
├── ex01/  (Step 1: Private 메서드 기초)
├── ex02/  (Step 2: Private 필드 + Getter/Setter)
└── ex03/  (Step 3: 실전 패턴)
```

---

## 1️⃣ ex01 - Private 메서드로 보호

### 핵심 아이디어

```
sum()을 private으로 만들면,
외부에서 직접 호출 불가능!

대신 avg()를 통해서만 sum()을 사용.
```

### Score.java

```java
public class Score {
    int kor, eng, math;
    
    // private 메서드: 외부에서 호출 불가능
    private int sum() {
        return kor + eng + math;
    }
    
    // public 메서드: 외부에서 호출 가능
    double avg() {
        double result = Math.round(100 * sum() / 3.0) / 100.0;
        return result;
    }
}
```

### ScoreTest.java

```java
Score haru = new Score();
haru.kor = 100;
haru.eng = 90;
haru.math = 85;

// ❌ sum() 호출 불가능 (private이므로)
// int haruSum = haru.sum();

// ✅ avg()로만 평균 조회 가능
double haruAvg = haru.avg();
System.out.println("하루의 평균: " + haruAvg);
```

### 비유

```
교사가 총점을 계산하는 과정:
┌─────────────────────────────────┐
│ sum() - 총점 계산 (교사만 함)    │ ← private
│ avg() - 평균 계산 (공개)        │ ← public
└─────────────────────────────────┘

학생이 할 수 있는 것:
✅ avg()를 통해 평균 확인
❌ sum()을 직접 호출 불가능
```

---

## 2️⃣ ex02 - Private 필드 + Getter/Setter

### 핵심 아이디어

```
필드를 private으로 보호 (직접 접근 차단)
  ↓
Getter/Setter로 접근 제어 (유효성 검사)
  ↓
생성자에서도 검사 (초기화 때부터 안전)
```

### Score.java - Private 필드

```java
public class Score {
    // private 필드: 외부 직접 접근 차단
    private int kor;
    private int eng;
    private int math;
    
    // Getter: 값 읽기
    public int getKor() {
        return kor;
    }
    
    // Setter: 값 설정 + 유효성 검사
    public void setKor(int kor) {
        this.kor = kor;
    }
    
    public int getMath() {
        return this.math;
    }
    
    public void setMath(int math) {
        // 중요! 검사 후에만 저장
        if (math > 100 || math < 0) {
            System.out.println("math 값은 0 ~ 100 사이로 입력해야 됩니다.");
        } else {
            this.math = math;
        }
    }
}
```

### Score.java - 생성자 오버로딩

```java
// 생성자도 유효성 검사
public Score(int kor, int eng, int math) {
    if (kor > 100 || kor < 0) {
        System.out.println("kor 값은 0 ~ 100 사이로 입력해야 됩니다.");
    } else {
        this.kor = kor;
    }
    
    if (eng > 100 || eng < 0) {
        System.out.println("eng 값은 0 ~ 100 사이로 입력해야 됩니다.");
    } else {
        this.eng = eng;
    }
    
    // math도 동일...
}
```

### ScoreTest.java

```java
// 생성자로 초기화
Score haru = new Score(100, 90, 85);

// ❌ 직접 접근 불가능 (private)
// haru.kor = 1000;

// ✅ Getter로 값 읽기
int math = haru.getMath();

// ✅ Setter로 값 변경 (검사됨)
haru.setMath(haru.getMath() * 5);

double haruAvg = haru.avg();
System.out.println("하루의 수정된 평균: " + haruAvg);
```

### Getter/Setter 규칙

```
필드명: age
  ↓
Getter: getAge()
Setter: setAge(int age)

필드명: score
  ↓
Getter: getScore()
Setter: setScore(int score)
```

---

## 3️⃣ ex03 - 실전 패턴: 은행 계좌

### ✅ Account.java - 좋은 예 (캡슐화 적용)

```java
public class Account {
    // 잔고는 절대 private! (중요한 데이터)
    private int balance;
    
    // Getter만 제공 (읽기만 가능)
    public int getBalance() {
        return balance;
    }
    
    // 입금: 유효성 검사
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + "원이 입금 되었습니다. 잔고는 " + balance + "원 입니다.");
        } else {
            System.out.println("입금액이 잘못 되었습니다.");
        }
    }
    
    // 출금: 잔고 확인
    public void withdraw(int amount) {
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + "원이 출금 되었습니다. 잔고는 " + balance + "원 입니다.");
        } else {
            System.out.println("잔고가 부족합니다. 잔고는 " + balance + "원 입니다.");
        }
    }
}
```

**특징:**
- ✅ balance는 private (직접 변경 불가)
- ✅ deposit()과 withdraw()로만 변경 (검사됨)
- ✅ 잘못된 금액 처리 가능
- ✅ 잔고 부족 처리 가능

### ❌ AccountBad.java - 나쁜 예 (캡슐화 없음)

```java
public class AccountBad {
    // public 필드: 아무나 직접 변경 가능! (위험!)
    public int balance;
    
    public void deposit(int amount) { ... }
    public void withdraw(int amount) { ... }
}
```

**문제점:**
```java
AccountBad bad = new AccountBad();
bad.balance = -10000;  // 음수 잔고? 😱 데이터 무결성 깨짐!
bad.balance = 999999;  // 마음대로 변경 😱
```

### AccountTest.java - 실제 사용

```java
Account myAccount = new Account();

// 입금
myAccount.deposit(8000);
// 출력: 8000원이 입금 되었습니다. 잔고는 8000원 입니다.

// 출금
myAccount.withdraw(5000);
// 출력: 5000원이 출금 되었습니다. 잔고는 3000원 입니다.

// 잔고 부족
myAccount.withdraw(10000);
// 출력: 잔고가 부족합니다. 잔고는 3000원 입니다.

// ❌ 잘못된 접근 불가능
// myAccount.balance = -10000;  // 컴파일 에러! private이므로

// ✅ 현재 잔고 조회
System.out.println("현재 잔고: " + myAccount.getBalance());
// 출력: 현재 잔고: 3000
```

### 비유: 은행 시스템

```
❌ 나쁜 은행 (캡슐화 없음)
┌──────────────────────┐
│ 금고가 열려있음      │
│ 아무나 돈을 꺼냄    │
│ 아무나 돈을 넣음    │
│ 잔고가 음수가 됨!   │
└──────────────────────┘

✅ 좋은 은행 (캡슐화 적용)
┌──────────────────────┐
│ 금고는 잠김          │
│ 은행원을 통해서만   │
│ 입출금 가능          │
│ 검사 후에 진행       │
└──────────────────────┘
```

---

## 🔄 세 폴더의 진화 과정

```
ex01 (기초)
└─ private 메서드로 내부 기능 보호
   └─ sum()은 외부에서 호출 불가능
   └─ avg()를 통해서만 접근

      ↓

ex02 (심화)
└─ private 필드로 데이터 보호
└─ Getter/Setter로 접근 제어
└─ Setter에서 유효성 검사
└─ 생성자에서도 검사

      ↓

ex03 (실전)
└─ 실제 프로그램처럼 설계
└─ Account: 잔고 보호, 입출금 관리
└─ AccountBad: 캡슐화 없을 때의 문제점
└─ 좋고 나쁜 예를 비교
```

---

## 💡 캡슐화 체크리스트

### 데이터는 Private!

```
❌ public int age;
✅ private int age;
```

### Getter/Setter 제공

```
private int age;

✅ public int getAge() { return age; }
✅ public void setAge(int age) { 
    if (age >= 0 && age <= 150) { this.age = age; }
}
```

### 생성자에서도 검사

```
public Student(int age) {
    if (age >= 0 && age <= 150) {
        this.age = age;
    }
}
```

### 메서드로 기능 제어

```
public void deposit(int amount) {
    if (amount > 0) {
        balance += amount;
    }
}
```

---

## 배운점

1. ✅ `private`으로 필드를 보호해야 한다.
2. ✅ `Getter`로 값을 읽고, `Setter`로 값을 쓴다.
3. ✅ `Setter`에서 유효성 검사를 한다.
4. ✅ 생성자에서도 검사해서 처음부터 안전한 상태로 만든다.
5. ✅ `private` 메서드로 내부 기능을 숨길 수 있다.
6. ✅ 메서드를 통해 비즈니스 로직을 제어한다.
7. ✅ 데이터 무결성을 보장하려면 캡슐화가 필수다.
8. ✅ `public` 필드는 위험하다!
9. ✅ 입금/출금 같은 중요한 작업은 메서드로 관리한다.
10. ✅ 좋은 설계는 데이터 보호에서 시작된다.

---

## 실생활 비유

```
캡슐화 없음 = 집 문이 열려있음
✖️ 도둑이 들어와서 물건을 훔쳐감
✖️ 누군가 와서 집을 엉망으로 만듦
✖️ 아무나 냉장고를 열고 음식을 꺼냄

캡슐화 있음 = 집에 잠금장치가 있음
✅ 초대받은 사람만 들어옴
✅ 집주인이 허락한 것만 꺼낼 수 있음
✅ 안전하고 질서있음
```

---

## 🔥 가장 중요한 것

```
필드는 private!
메서드로 접근!
검사하고 저장!

이 3가지가 캡슐화의 전부다!
```
