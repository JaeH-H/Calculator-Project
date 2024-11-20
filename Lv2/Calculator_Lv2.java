package Lv2;

import java.util.ArrayList;


public class Calculator_Lv2 {

    //ArrayList으로 연산 값을 저장한다.
    private ArrayList<Double> answer = new ArrayList<>();

    //속성
    private double ans;
    private double num1;
    private String operate;
    private double num2;

    public Calculator_Lv2() {}

    //연산기호에 따라 연산 기능 부분에서 계산을 한다.
    public void calculate() {

        if (operate.equals("+")) {
            ans = changeAdd(num1, num2);

        } else if (operate.equals("-")) {
            ans = changeSub(num1, num2);

        } else if (operate.equals("*")) {
            ans = changeMul(num1, num2);

        } else if (operate.equals("/")) {
            ans = changeDiv(num1, num2);

        }

    }

    //처음 저장한 값을 삭제하는 부분
    private void removeAnswer() {
        answer.remove(0);
    }

    public void setRemoveAnswer() {
        this.removeAnswer();
    }

    //answer getter
    public ArrayList<Double> getAnswer() {
        return answer;
    }

    //setter를 사용해서 연산 시 필요한 숫자, 기호, 계산 값을 수정할 수 있다.
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    //getter를 사용해서 연산 시 필요한 숫자, 기호, 계산 값을 읽을 수 있다.
    public double getNum2() {
        return num2;
    }

    public String getOperate() {
        return operate;
    }

    public double getAns() {
        return ans;
    }

    //연산 기능 부분.
    private double changeAdd(double num1, double num2) {
        ans = num1 + num2;
        answer.add(ans);
        return ans;
    }

    private double changeSub(double num1, double num2) {
        ans = num1 - num2;
        answer.add(ans);
        return ans;
    }

    private double changeMul(double num1, double num2) {
        ans = num1 * num2;
        answer.add(ans);
        return ans;
    }

    private double changeDiv(double num1, double num2) {
        ans = num1 / num2;
        answer.add(ans);
        return ans;
    }

}
