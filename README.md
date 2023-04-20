# ✔코리아IT 국비교육✔ 
<h3>- 과정 소개 </h3>
과정명   : 자바 파이썬 기반 AI개발 및 응용과정C <br>
강사     : 한동석 강사님 <br>
수업기간 : 2022년 12월 29일 ~ 2023년 05월 30일<br>
수업시간 : 평일 09:00 ~ 18:00<br>

-----------------------------------------------------------------------------------
🎈수업 전체적인 타임라인 <br>
|일자|내용|구체적인 활동|
|:------------------:|:--------:|:-------:|
| 2023년 02월 15일 | 수업 | JSP 이론, JSP 실습, EL, JSTL, MVC JDBC |
| 2023년 02월 16일 | 수업 | GIT 공용, 개인 |
| 2023년 02월 17일 | 수업 | 프로젝트 보고 및 mysql 설치 |
| 2023년 02월 20일 | 수업 | mysql 기본 |
| 2023년 02월 21일 | 수업 | jsp 진행 환경 만들기, 프로젝트 진행 |
| 2023년 02월 22일 | 프로젝트 | 프로젝트 진행 |
| 2023년 02월 23일 | 수업 | 회원가입, 로그인 |
| 2023년 02월 24일 | 수업 | 로그인,쿠키, 자기소개서 작성 교육 |
| 2023년 02월 27일 | 수업 | 게시판 등록,수정,삭제 |
| 2023년 02월 28일 | 수업 | 파일 |
| 2023년 02월 29일 | 수업 | 댓글작성 |
| 2023년 03월 01일 | 수업 | 댓글수정, 댓글삭제 |
| 2023년 03월 02일 | 프로젝트 | 프로젝트 |
| 2023년 03월 03일 | 프로젝트 | 프로젝트 |
| 2023년 03월 06일 | 프로젝트 | 프로젝트 |
| 2023년 03월 07일 | 프로젝트 | 프로젝트 |

-----------------------------------------------------------------------------------
# JSP_Study

JSP(Java Server Page)

        HTML을 중심으로 자바와 같이 연동하여 사용하는 웹 언어이다.
        HTML코드 안에 JAVA코드를 작성할 수 있는 언어이다.

서버

      사용자의 요청에 맞는 서비스를 제공해주는 것

      - 요청(request)   : 클라이언트 ===> 서버
      - 응답(response)   : 서버 ===> 클라이언트

웹(Web)

      페이지 요청과 응답이 일어나는 장소.


웹 서버(http) - 아파치

      사용자의 요청이 정적 데이터인지 동적 데이터인지 판단한다.
      정적 데이터일 경우 이미 준비된 HTML문서를 그대로 응답해주며,
      동적 데이터라면 웹 컨테이너에 요청을 보낸다.

웹 컨테이너(서블릿 컨테이너)

      동적 데이터일 경우 JSP, 서블릿으로 연산 및 제어 그리고 DB까지 접근한다.
      DB에 접근하는 연산을 복잡한 연산이라고 하며, JAVA로 처리한다.
      동적 데이터가 정제된 데이터(정적 데이터)로 완성되면 이를 웹 서버로 전달해준다.

WAS(Web Application Server) - Tomcat

      동적 데이터를 처리할 서블릿을 메모리에 할당하며, 
      web.xml을 참조한 뒤 알맞는 서블릿에 대한 Thread를 생성한다.
      서블릿 요청과 서블릿 응답 객체 생성 후 서블릿에 전달하면, 
      연산 종료 후 메모리에서 해제시킨다.

서블릿(Servlet)

      Java 코드 안에 HTML 코드를 작성할 수 있는 Java 프로그램이다.
      Thread에 의해 서블릿에 있는 service() 메소드가 호출된다.
      전송 방식 요청에 맞게 doGet() 또는 doPost()등의 메소드를 호출한다.

EL문과 JSTL: 페이지 가독성 상승

      자바 구문을 라이브러리 형태로 만들어 놓고 필요할 때마다 태그로 꺼내쓰는 기술이다.
      JSP 페이지 내에서 자바 코드와 HTML 코드가 섞여 있으면 가독성이 떨어지고 복잡해진다.
      EL문과 JSTL문을 사용하면 HTML 태그로만 구성된 일관된 소스코드를 볼 수 있다는 장점이 있다.


- EL(Expression Language)

      값을 간결하고 간편하게 출력할 수 있도록 해주는 기술

      자바         EL
      <%=name%>      ${name}
      <%=member.getName()%>   ${member.name}

      값을 찾을 때에는 작은 Scope에서 큰 Scope로 찾는다.
      page > request > session > application

      ${param.name} : 전달받은 데이터 중 쿼리스트링으로 작성된 데이터에서 name을 찾는다.
      ${requestScope.name} : request 객체에 담긴 데이터 중 name을 찾는다.
      ${sessionScope.name} : session 객체에 담긴 데이터 중 name을 찾는다.


EL 연산자

      %, mod
      &&, and
      ||, or
      >, lt
      <, gt
      >=, le
      <=, ge
      ==, eq
      !=, ne
      !, not
      empty: 값 비어있으면 true, 아니면 false
      
- JSTL(JSP Standard Tag Libarary)

      연산자나 조건문, 반복문 등을 편하게 처리할 수 있으며, SJP 페이지 내에서 자바코드를 사용하지 않고
      로직을 구현할 수 있도록 효율적인 방법을 제공한다.

     자바               JSTL
     
        <%for(초기식; 조건식; 증감식){}%>      <c:forEach var="" begin="" end=""></c:forEach>
        <%for(자료형 변수명 : 반복자){}%>      <c:forEach var="" items="${반복자}"></c:forEach>


core 태그의 종류

        <c:set>      : 변수 선언
        <c:out>      : 변수 출력(사용)
        <c:if>      : if문
        <c:choose>   : else if문 시작
        <c:when>   : else if문
        <c:otherwise>   : else문
        <c:forEach>   : for문


-------------------------------------------------------------------------------------------------------------------------

![model2 페이지이동](https://user-images.githubusercontent.com/122762442/231780206-0071b4f5-6d10-433b-9fa3-e6ea3234e001.PNG)


---------------------------------------------------------------------------------------------------------------------------

[jsp]

      a.jsp --> b.jsp --> c.jsp

      각 페이지마다 필요 시 자바 코드가 작성되며, DB와 연결하는 코드도 jsp파일 안에서
      모두 작성된다. 분리되어 있지 않기 때문에 규모가 작은 프로젝트에 어울리는 방식이며,
      코드가 확장될 수록 가독성이 떨어지고 분업과 유지보수가 좋지 않다.

▶ MVC

    [model1]
          a.jsp --> b.jsp --> c.jsp
                 ↓
             DAO.java

          b.jsp에서 dao를 호출함으로써 자바코드가 섞이게 된다. 선언은 JAVA 페이지에 구현이 되어 있기 때문에
          jsp 내의 JAVA 코드 양이 줄어들지만 결국 사용은 jsp 페이지에서 하기 때문에
          Controller(DAO 메소드를 사용하고 어디 페이지로 이동할 지)와 View가 섞이게 된다.
          페이지가 확장될 수록 유지보수가 좋지 않다. 하지만 설계는 쉽다.
      
      
![model2 페이지이동](https://user-images.githubusercontent.com/122762442/231779997-8927f506-f56e-45ff-9d3a-be3d3f95674e.PNG



    [model2]
          a.jsp   -->   web.xml   -->   Front-Controller.java   ------------>   c.jsp
                         ↓
                      Controller.java
                         ↓
                      DAO.java
                         ↓
                         DB

          a.jsp에서 다음 페이지를 이동하기 전 필요한 비지니스 로직을 완벽하게 분리하여 관리한다.
          사용자가 정의한 확장자(.me, .bo, ...)를 페이지 이동 주소(URL)에 작성하게 되면
          web.xml에 가서 경로를 찾는다. web.xml에 파일 경로를 하나씩 모두 만들게 되면
          코드가 길어지기 때문에 *.me와 같이 그룹화시킨 확장자로 요청을 하나의 경로로 보내주도록
          설정해 놓는다.
          이 경로를 알맞는 Front-Controller.java 경로로 설정해 놓는다.
          Front-Controller에서는 들어온 요청에서 .me앞의 요청 명으로 어떤 로직을 수행할 지를
          판단하도록 분기처리를 한다.
          비지니스 로직을 Front-Controller에서 작업하게 되면 마찬가지로 코드가 길어지고
          유지보수 및 재사용이 어렵기 때문에 요청별 Controller를 만들어서 req와 resp를 받을
          메소드를 선언하여 구현한다. 따라서 Controller안에 선언된 메소드는 모든 Controller에
          구현해야 하기 때문에 인터페이스를 선언하여 추상메소드 형태로 선언해 놓고
          각 Controller에 지정하여 구현하도록 한다.
          메소드 내부에서의 DB연산 작업들은 모두 DAO로 분리하여 사용한다.
          내부 작업이 모두 완료되면 페이지를 이동할 것인지, 어떤 방식으로 할 것인지, 그리고 어디로
          이동할 것인지를 결정해서 리턴해야 한다. 이에 관련된 필드를 클래스로 만들어 놓은 후
          Controller안에 선언한 메소드의 리턴타입으로 지정하여 Front-Controller에 리턴해준다.
          Front-Controller에서는 해당 Controller 메소드의 리턴 값에 담긴 결과에 맞게 처리한 후
          View로 이동하게 된다.

       - redirect(request객체 초기화)
             request에 아무것도 담지 않았으면 사용
             ※ 만약 request에 무언가 담았으나 redirect로 이동하고 싶다면,
                request에 담지 않고, 쿼리 스트링으로 전달하면 된다.

       - forward(request객체 유지)
             request에 무언가 담았다면 사용

          비동기 통신
      
![model2_비동기 통신](https://user-images.githubusercontent.com/122762442/231779801-d4c48d01-8ff7-4ef4-bf93-eeb67c335a80.PNG)

-------------------------------------------------------------------------------------------------------------------------


GET 방식과 POST 방식

- GET

      주소에 데이터를 추가하여 전달하는 방식.
      보통 쿼리 문자열(query string)에 포함되어 전송되므로, 길이에 제한이 있으며
      주소에 데이터가 보이므로 보안상 취약점이 존재한다.
      중요한 데이터 혹은 길이가 긴 데이터는 POST 방식을 사용하여 요청하는 것이 좋지만
      GET 방식이 POST 방식보다 상대적으로 빠른 전송방식이다.

- POST

      데이터를 별도로 첨부(Header에 첨부)하여 전달하는 방식.
      브라우저 히스토리에도 남지 않고 데이터는 쿼리 문자열과는 별도로 전송된다.
      따라서 데이터의 길이에 제한도 없으며, GET 방식 보다 보안성이 높다.
      하지만 GET 방식 보다 상대적으로 느리다.

Ajax(Asynchronous Javascript and XML)

      빠르게 동작하는 동적인 웹 페이지를 만들기 위한 개발 기법이다.
      Ajax는 웹 페이지 전체를 다시 로딩하지 않고도, 웹 페이지 일부분만을 갱신할 수 있고
      백그라운드 영역에서 서버와 통신하여, 그 결과를 웹 페이지 일부분에만 표시할 수 있다.

Ajax의 장점

      1. 웹 페이지 전체를 다시 로딩하지 않고도, 웹 페이지 일부부만을 갱신할 수 있다.
      2. 웹 페이지가 로드된 후에 서버로 데이터 요청을 보내거나 받을 수 있다.
      3. 다양한 UI(동적 페이지)구현이 가능해진다.

Ajax의 단점

      1. 페이지 이동이 없기 때문에 히스토리 관리가 안된다.
      2. 반복적인 데이터를 요청하면 느려지거나 작동하지 않게 된다.

DBCP(Database Connection Pool)

      사용자 요청이 있을 때 마다 DB연결을 한다면, 많은 요청이 있을 때 연결 속도가 저하될 수 있다.
      따라서 미리 Connection을 만들어 두고, 필요 시 저장된 공간에서 가져다 쓴 후
      반환하는 기법이다.

JNDI(Java Naming and Directory Interface)

      디렉터리 서비스에서 제공하는 데이터 및 객체를 발견하고 참고하기 위한 자바 API이며,
      외부에 있는 객체를 가져오기 위한 기술이다.

MyBatis Framework

      소스코드 안에 SQL문을 작성하면 코드가 길어지고 섞여 있어 유지보수 및 분업이 쉽지 않다.
      MyBatis는 기존 JDBC 방식과는 달리 SQL문을  XML파일에 작성함으로써 코드가 줄어들고,
      SQL문 수정이 편해진다. 또한 DBCP를 사용하여 커넥션을 여러 개 생성하기 때문에 JDBC만
      사용하는 것보다는 작업 효율과 가독성이 좋아진다.

     1. 테이블 생성
     2. mapper.xml
     3. config.xml에 datasource 설정
     4. config.xml에 mapper.xml 경로 등록
     5. DAO에서 mapper.xml에 작성한 쿼리 실행

