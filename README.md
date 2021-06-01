### 빌드 방법

`./gradlew build` 후 `cd build/libs` 를 한다.

`java -jar hello-spring-0.0.1-SNAPSHOT.jar` 로 서버를 실행할 수 있다.

`./gradlew clean` 으로 빌드 폴더를 삭제할 수 있다.

### H2 설치

`brew install h2` 로 설치 후 `h2` 로 실행

`jdbc:h2:~/test` (최초 한번)

`~/test.mv.db` 파일 생성 확인

`jdbc:h2:tcp://localhost/~/test` 이후에는 이렇게 접속
