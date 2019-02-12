# Observer Pattern  

## 1. 의도  
객체간에 일대 다 의존성을 정의하여 한 객체가 상태를 변경할 때 모든 종속 객체에 자동으로 통지 및 업데이트 한다.  

## 2. 동기  
시스템을 상호작용하는 클래스들을 묶어서 구분하는것은 객체 사이의 일관성을 유지할 필요가 있다는 것이다. 그러나 클래스의 재사용성이 줄어들기 때문에 클래스를 긴밀하게 결합하여 일관성을 유지하고 싶지는 않다.  
Observer 패턴은 이러한 관계를 설정하는 방법을 설명하며, 이 패턴의 핵심 객체는 subject and observer 이다. 
subject에는 종속되는 observer가 여러 개 있을 수 있고, 모든 observer는 subject의 상태가 변경 될 때마다 통보받는다. 이러한 종류의 상호 작용을 ‘발행(Publication)-구독(Subscription)모델’ 이라고도 한다.  
subject는 observer가 누구인지 알 필요없이 알림을 발송한다. observer는 원하는 수만큼 구독하여 알림을 수신 할 수 있다.

## 3. 활용성  
- 추상화가 두 관점(aspect)에서 정의되고 하나가 다른하나에 종속성을 가질때, 객체를 각각의 관점으로 분리하여 캡슐화 하면 독립적으로 재사용 가능  
- 하나의 객체의 상태가 변경되면 다른 객체도 변경해야 하며, 변경할 필요가 있는 객체의 수를 알지 못할때  
- 하나의 객체가 다른 객체에 notify 할수 있어야 하지만 그 대상 객체에 대해 지정하지 않아야 할때, 즉 객체간의 강한 결합(tightly coupled)을 원치 않을때  

## 4. 구조  
![Observer Pattern](https://user-images.githubusercontent.com/3126047/52616683-ab1d0780-2edc-11e9-880b-349243a5e102.png)


## 5. 참여자  
### Subject  
- '관찰되는 대상'을 나타낸다. 임의의 Observer객체들이 대상을 관찰할 수 있다.   
- 관찰자인 'Observer'를 등록/삭제하는 메소드를 가지고 있다.  

### ConcreteSubject  
- 구체적으로 관찰되는 대상을 표현한다. 상태가 변화하면 그것이 등록되어있는 Observer 역할에 전달한다.  

### Observer  
- Subject로부터 변경사항을 update 메소드를 통해서 전달받는 역할을 한다.    

### ConcreteObserver  
- 구체적인 Observer로 update가 호출되면 그 메소드 안에서 Subject의 상태를 취득하여 행동한다.    

## 6. 결론  
### 장점
- 옵저버 패턴을 사용하면 다양한 subjects 와 observers 를 독립적으로 사용할 수 있다. 즉, subjects 를 수정하지 않고도 observers 를 추가할 수 있다.  
- subjects 와 observers간에 추상화된 커플링관계를 갖게되어 subjects에서는 observers의 구체적인 class에대해 알지 못한다.
- 브로드 캐스트 통신을 지원한다. 일반 요청과 달리, subject 가 보내는 알림에 수신자를 지정할 필요가 없다. 알림은 관심있는 모든 개체(observers)에 자동으로 브로드 캐스팅된다.  

### 단점  
- 예기치 않은 업데이트가 발생할 수 있다.   

## 7. 관련패턴  
### Mediator   
- Mediator 역할과 Colleague 역할의 통신에 Observer 패턴을 사용하는 경우가 있다.  
