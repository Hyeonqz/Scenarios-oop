# 직접 만들어보는 영화 예매 어플리케이션

> Java17, SpringBoot3.31, SpringDataJPA, MySQL, Postman

### 구현 목표
- 관람객들이 영화를 예매할 수 있는 기능을 가진다.
- 특정 조건을 만족하는 예매자는 요금을 할인 받는다.
  - 할인 조건
    - 순서 조건: 상영 순번에 따라 할인율이 다름
    - 기간 조건: 상영 시간에 따라 할인율이 다름
  - 할인 정책 (단, 영화별로 하나의 할인 정책만 할당한다.)
    - 금액 할인: 예매 비용중 1000,2000원 등 정해진 금액을 할인
    - 비율 할인: 예매 비용에 몇% 를 할인해주는 것

