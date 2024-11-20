## Calculator-Project
java를 사용해서 사칙연산을 수행하는 코드를 작성하여 계산기를 제작했습니다.

## 프로젝트 소개
Lv.1에서는 main 클래스만으로 사칙연산을 수행하는 코드를 작성하였고
Lv.2에서는 Calculator와 main, 두 개의 클래스를 이용하여 사칙연산을 수행하는 코드를 작성하였습니다.

## 주요 코드(Lv.2)
**사칙 연산**

main 클래스에서 입력 받은 기호를 식별하고 일치하는 연산의 기능을 수행합니다.

  * 예를 들면, "+" 기호를 입력 받았다면, 기호를 식별하는 조건문에서 일치하는 조건을 찾고 일치하면 덧셈을 하는 메소드에서 연산을 실행합니다.

        public void calculate() {

        if (operate.equals("+")) {
            ans = changeAdd(num1, num2);

---
      
        private double changeAdd(double num1, double num2) {
        ans = num1 + num2;
        answer.add(ans);
        return ans;
    }

    
**캡슐화**

캡슐화를 하여 외부에서 주요 값들에 접근은 막아 데이터를 보호하는 코드를 작성하였습니다.

  * 접근 제어자 private를 사용하여 같은 클래스에서만 접근이 가능하고 다른 클래스에서는 getter / setter을 이용하여 허용하는 범위만 읽거나 수정합니다.

    private double num2;

---

        public void setNum2(double num2) {
        this.num2 = num2;
    }
        public double getNum2() {
        return num2;
    }

**컬렉션**

연산된 값을 컬렉션을 이용하여 값을 저장하고 삭제합니다.

  * ArrayList<>를 사용하여 연산된 값은 저장하였고 remove()를 통해서 첫번째에 저장된 값을 삭제합니다.

    private ArrayList<Double> answer = new ArrayList<>();

  ---

        private void removeAnswer() {
        answer.remove(0);
    }
