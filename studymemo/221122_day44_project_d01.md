# [D+44]

## Front-end 미니 프로젝트 1일차

### : 웹폰트 설정 및 네비게이터 설정

<br>

### 목적

스크롤을 움직일때마다 반응하는 스크롤인터렉션 사이트를 구현하기<br><br>

### 오늘 한 일

\- 웹폰트 설정<br>
\- 네비게이터 설정<br><br>

### 파일 구성 및 내용

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbLBN3D%2FbtrRTFb06lM%2FsVJWauaKnbJJedwEKXFcK1%2Fimg.png" width="60%"/><br>

---

### • index.html

\- 웹폰트를 설정해 초기 셋팅을 진행해주었다.<br>
\- 상단에 들어간 메뉴에 대한 정보와 내용들을 넣은 후 nav와 section태그를 사용해 의미를 부여하였다.<br>

```
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <!-- 외부파일 CSS -->
    <!-- 폰트 -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;700&display=swap" rel="stylesheet">
    <!-- 스타일 -->
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <nav class="global-nav">
        <div class="global-nav-links">
            <a href="#" class="global-nav-link">Home</a>
            <a href="#" class="global-nav-link">History</a>
            <a href="#" class="global-nav-link">Store</a>
            <a href="#" class="global-nav-link">Contact</a>
        </div>
    </nav>

    <nav class="local-nav">
        <div class="local-nav-links">
            <a href="#" class="local-nav-link">Real Apple Pro</a>
            <a href="#" class="local-nav-link">Overview</a>
            <a href="#" class="local-nav-link">Compare</a>
            <a href="#" class="local-nav-link">Buy</a>
        </div>
    </nav>

    <section id="section-0" class="scroll-section">
        <div class="product-name">
            <h1>Real Apple Pro</h1>
        </div>
        <div class="section0-message">
            <p>온전히 빠져들게 하는 빛깔</p>
        </div>
        <div class="section0-message">
            <p>나의 건강을 채워주는 향기</p>
        </div>
        <div class="section0-message">
            <p>깨끗한 자연의 신선함</p>
        </div>
        <div class="section0-message">
            <p>새롭게 입가를 찾아온 매혹</p>
        </div>
    </section>

    <section id="section-1" class="scroll-section">
        <div class="section1-message">
            <p>
                <strong>진짜 사과 이야기</strong>
                사과를 매일 하나씩 먹으면 의사 볼 일이 없다
                (an apple a day keeps the doctor away)란 속담이 있을 정도로
                유명한 가을 과일 중 하나다. 비슷한 속담이 토마토에도 있다.
                그만큼 비타민C와 무기질이 많아 간식 대용으로 사과를 한 알 먹는다면
                비타민C 부족에 시달릴 일은 없다. 다만 과당이 많아서 통상적인 이미지와는
                달리 다이어트 식품으로서는 그다지 효능이 좋지 않은데, 단위 중량 당 열량은
                아보카도나 바나나 등과 함께 제법 높은 편에 속한다.
                당연히 사과의 크기와 영양상태에 따라 다르지만 300g 정도 나가는 한 알이
                200kcal는 넘을 수 있다고 생각하면 된다.
                비타민 C가 풍부한 만큼 감기 예방에 효과적이나, 한의학적으로 사과는
                차가운 성질을 가지고 있기 때문에 목감기나 기침에 좋지 않다고 한다.
                감기에 좋다고 하는 과일은 배, 그리고 귤도 좋다고 한다.
                배는 과일 중에서도 특히 수분, 무기질이 많은 과일 중 하나이기 때문에
                감기에 걸렸을 때 수분 보충에 아주 적절한 식품이다.
            </p>
        </div>
    </section>

    <footer>
        <div>
            <p>Copyleft 2022 PARK SUHYEON Allright reserved.</p>
        </div>
    </footer>

    <!-- 외부파일 JS -->
    <script src="main.js"></script>
</body>
</html>
```

 <br>

### • reset.css

\- html에서 기본 default로 설정되어 있는 값을 모두 초기화해주기 위해 reset.css 파일을 추가해 주었다.<br>
\- index.html에서 링크할때 캐스케이딩에 원리에 따라 웹폰트 다음에 넣어주었다.<br>

```
@charset 'utf-8';

html, body, div, span, applet, object, iframe,
h1, h2, h3, h4, h5, h6, p, blockquote, pre,
a, abbr, acronym, address, big, cite, code,
del, dfn, em, img, ins, kbd, q, s, samp,
small, strike, strong, sub, sup, tt, var,
b, u, i, center,
dl, dt, dd, ol, ul, li,
fieldset, form, label, legend,
table, caption, tbody, tfoot, thead, tr, th, td,
article, aside, canvas, details, embed,
figure, figcaption, footer, header, hgroup,
menu, nav, output, ruby, section, summary,
time, mark, audio, video {
	margin: 0;
	padding: 0;
	border: 0;
}

article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {
	 display: block;
}

div, span, article, section, header, footer, aside, p, ul, li, fieldset, legend, label, a, nav, form {
	box-sizing: border-box;
}
```

<br>

### • style.css

\- 웹사이트의 기본 셋팅 및 네비게이터의 링크의 밑줄을 제거해주었다.<br>

```
@charset 'utf-8';

html {
    /*
    웹폰트
        장점 : 어느환경에서든 적용이 가능하다.
        단점 : 용량이 클 경우 속도에 문제가 생길 수 있다.
        1. 구글 폰트에서 Noto Sans 검색
        2. 적당한 폰트 선택 (R400, B700)
        3. 폰트를 html에서 link태그를 통해 포함시킴
        4. 포함된 폰트를 CSS의 html 태그에서 설정
    */
    font-size: 14px;
    font-family: 'Noto Sans KR', sans-serif;
}

body {
    /* 수평 스크롤 제거 */
    overflow-x: hidden;
    /* 글간격(자간)을 5% 좁힌다 */
    letter-spacing: -0.05em;
}

a {
    /* underline 제거 */
    text-decoration: none;
}
```

<br>

---

### 결과화면

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcWehOz%2FbtrRRuQoHlG%2F14iaCRXkm0jKULD6IuKmek%2Fimg.png" width="100%"/><br><br>

[티스토리 바로가기](https://onelight-stay.tistory.com/657)
