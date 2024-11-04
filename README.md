## ex3 package
- catch 문을 여러개 쓰는 방법
<br>

## ex4 package

![image](https://github.com/user-attachments/assets/dc8e8ebd-4e3f-4fed-8d49-737d936c1738)
<br>

- 처리 불가능한 언체크 예외를 공통 로직으로 처리하는 방법

- try-with resources
  - `AutoCloseable`
  - finally보다 자원 해제가 더욱 빠르며, 리소스 누수 방지가 된다.
  - 스코프를 제한하기 때문에 다른 곳에서 객체를 사용할 수 없게 한다.
<br>

- 체크 예외의 경우 아래 그림처럼 예외 처리 지옥이 발생하기 때문에 근래에는 언체크 예외가 주로 사용된다.

![image](https://github.com/user-attachments/assets/a577d96f-28bc-4083-b135-e7de72cb4a8e)
