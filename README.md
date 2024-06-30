# 설문조사 리뉴얼 프로젝트 세팅

### 1. 멀티 모듈 프로젝트

* 공통 모듈(공통 유틸, 기능 등) : core
* web 모듈(web 화면 서비스) : web
* api 모듈(Rest-api 서비스) : api

### 2. profile 설정

* 공통 모듈(core) yaml 설정
  * application-common.yml
  * applicaiton-common-local.yml
  * applicaiton-common-qas.yml
  * application-common-prd.yml
* 일반 모듈(web, api) yaml 설정
  * application.yml
  * application-local.yml
  * application-qas.yml
  * applicaiton-prd.yml

프로파일 group 도 설정
* development, quality-assurance, production 으로 profile group 설정

### 3. logging 추가 - logback 설정
* console 로그
  * local 에서만 사용
  * 기본 spring boot 설정 사용
  * pattern 만 변ㄱ
* file 로그
  * local, qas, prd 에서 사용
  * 기본 spring boot 설정 사용하지 않음
  * core 모듈에 file-appender.xml 파일 추가 후 커스텀
  * file은 일반 파일 로그 와 에러 파일 로그 로 구분