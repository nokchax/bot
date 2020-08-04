# BOT
## this project is for...
- study
- crawl and alarm


## Ideation
- 페이지를 크롤 해서 변경(?) 있다면 bot을 통해 알림을 줘야 한다.
  - 변경에는 페이지 업데이트 뿐만 아니라, 특정 단어가 포함되어 있다면 알림을 할 수 있어야 한다.
    - 크롤 타입이 존재
    - 특정 단어는 여러 개가 존재할 수 있다.
  - 페이지 url, 타겟 정보, 이전 크롤 정보 등... 
 
- 특정 단어가 들어가 있으면 제외할 수도 있어야 한다.
  
- 페이지 크롤에 실패한 경우에는 실패 이력을 DB에 쌓는다.
  - 크롤을 여러번 실패한 경우에는 해당 크롤을 중지할 수 있어야 한다 (flag 값?)
  
- 페이지 크롤이 성공한 경우도 쌓는다?
- 로그인이 필요한 페이지 크롤도 가능해야 한다 (selenium 사용)
  - 필요에 따라 페이지 별로 로그인 정보(id, pw, login url)를 저장해야 한다.

- 페이지별 크롤 정보가 여러개 존재할 수 있다.

- 매분 DB를 조회해서 crawl time이 분단위로 일치하는 크롤 정보를 가져와 크롤을 수행한다.
  - 이때 DB에 크롤에 대한 기록을 남긴다
  - 크롤일 끝나면 다음 크롤 정보를 업데이트 한다.
  - hibernate enver를 사용해본다?

## domain
- crawl
  - 아래 도메인(page, target, filter, notification)들을 포함.
  - crawl type
  - crawl term (cron expression 을 사용)
  - next crawl time
  - last crawl info
  - active status (boolean)
- login
  - login page
  - id
  - pw (암호화 적용)
  - auto login
- page
  - 크롤하려는 페이지와 태그까지만??
  - page url
  - target tag
- target
- filter (필터는 여러개가 존재할 수 있으며, 등록된 순서대로 필터링을 해야한다)
  - 태그로 부터 원하는 정보만 필터링 하기 위함
  - filter type
  - result type
  - order (unique)
- notification
  - 알림을 위한 정보
  - notification type
  - template