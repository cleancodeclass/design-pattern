# design-pattern

## 1. 디자인패턴이란?  

> "Descriptions of communicating objects and classes that are customized to solve a general design problem in a particular context."  
> 특정한 상황에서 일반적인 설계 문제를 해결하기 위해 커스터마이징 된 상호교류하는 객체와 클래스에 대한 설명.  
>
> GoF 디자인 패턴

- 설계 문제에 대한 해답을 문서화 하기 위해 고안된 형식 방법(넓은 의미)  
- 프로그램 개발에서 자주 나타나는 과제를 해결하기 위한 방법 중 하나  
- 과거의 소프트웨어 개발 과정에서 발견된 설계의 노하우를 축적하여 이름을 붙여, 이후에 재이용하기 좋은 형태로 특정의 규약을 묶어서 정리한 것  
- 알고리즘과 같이 프로그램 코드로 바로 변환될 수 있는 형태는 아니지만, 특정한 상황에서 구조적인 문제를 해결하는 방식을 설명해 준다.  


### 1.1 디자인 패턴의 요소
- 패턴이름(Pattern name)    
	- 한 두 단어로 표현될 설계와 해법에 대한 서술.  
	- 패턴의 이름을 정의해 두면 문서에서 이름을 사용하여 설계의 의도를 표현할 수 있다.  
	- 개발자간 의사소통이 원활해 진다.  
- 문제(Problem)  
	- 언제 패턴을 사용하는가, 문제와 배경을 설명  
	- 유연성 없는 설계가 될 징조를 보이는 클래스와 객체의 구조를 제시한다.  
	- 사례정의  
- 해법(Solution)  
	- 설계를 구성하는 요소들과 그간의 관계, 책임, 협력관계를 서술한다.  
	- 해법이 구체적인 설계나 구현을 설명하지는 않는다.  
	- 패턴은 일반화된 템플릿임  
	- 문제에 대한 추상적인 설명과 클래스와 책체의 나열 방법을 제공한다.  
- 결과(Consequence)  
	- 디자인 패턴을 적용해서 얻는 결과와 장단점 서술  

## 2. 디자인 패턴 카탈로그  
![디자인 패턴 카탈로그](https://user-images.githubusercontent.com/3126047/52611793-8881f300-2eca-11e9-8038-d93d77a163a7.png)  

- 디자인패턴은 크게 목적(purpose)과 범위(scope)로 분류할 수 있다.  
	* purpose : 패턴이 무엇을 정의하는가에 따라 생성, 구조, 행동의 목적을 갖는다.  
		+ creational :객체의 생성에 관여  
		+ structural : 클래스나 객체의 합성에 관한 패턴  
		+ behavioral : 클래스나 객체들이 상호작용하는 방법과 책임을 분산하는 방법을 정의  
	* scope : 패턴을 주로 클래스에 적용하는지 객체에 적용하는지를 구분한다.  
		+ class : 클래스와 서브클래스간의 관련성을 다루는 패턴으로 주로 상속과 관련.컴파일 타임에 정적으로 결정된다.  
		+ object : 객체관련성을 다루는 패턴으로 런타임에 변경할 수 있으며 더 동적인 성격을 가진다.  

## 3. 디자인 패턴간의 관계
- 일부패턴은 함께 사용해야 할 때도 있다.  
	+ Composite, Iterator, visitor  
- 어떤패턴은 다른패턴의 대안이 되기도 한다.  
	+ Prototype, Abstract Factory  
- 패턴간의 의도는 다르지만 결과적으로 유사한 설계구조를 만드는 패턴도 있다.  
	+ Composite, Decorator  

![디자인 패턴간의 관계](https://user-images.githubusercontent.com/3126047/52612496-4f974d80-2ecd-11e9-9945-c50b35ae6fdc.png)

## 4. 디자인 패턴을 이용하여 문제를 푸는 방법
- 적당한 객체찾기  
- 객체의 크기 결정  
- 객체 인터페이스 명세  
- 객체 구현 명세  
	* Class versus Interface Inheritance  
	* Programming to an Interface, not an Implementation  
		+ Clients remain unaware of the specific types of objects they use, as long as the objects adhere to the interface that clients expect.  
		+ Clients remain unaware of the classes that implement these objects. Clients only know about the abstract class(es) defining the interface.  
- 재사용 가능한 설계   
	* Inheritance versus Composition  
		+ Favor object composition over class inheritance.  
	* Delegation  
	* Inheritance versus Parameterized Types    
		+ composition을 사용하면 런타임에 동작을 변경할 수 있지만 간접 지정이 필요하고 비효율적 일 수 있다.  
		+ inheritance을 사용하면 작업에 대한 기본 구현을 제공하고 하위 클래스에서 이를 재정의 할 수 있다.  
		+ Parameterized Types을 사용하면 클래스에서 사용할 수 있는 type을 변경할 수 있다.  
		※ 그러나 inheritance나 Parameterized Types은 런타임에 변경 될 수 없다.  
- 런타임 및 컴파일 타임의 구조를 관계짓기  
- 변화에 대비한 설계  

## 5. 디자인 패턴을 고르는 방법
- 패턴이 어떻게 문제를 해결하는지 파악한다.  
- 패턴의 의도를 파악한다.  
- 패턴들 간의 관련성을 파악한다.  
- 비슷한 목적의 패턴들을 모아서 공부한다.  
- 재설계의 원인을 파악한다.  
- 설계에서 가변성을 가져야 하는 부분이 무엇인지 파악한다.  

## 참고
- [Refactoring & Design Pattern](http://refactoring.guru/)  
- [DESIGN PATTERNS QUICK REFERENCE](http://www.mcdonaldland.info/2007/11/28/40/)  

