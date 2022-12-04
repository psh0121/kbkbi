# [D+47]

## Front-end 미니 프로젝트 3일차

### : section 레이아웃 설정

<br>

### 오늘 한 일

\- section 레이아웃 설정<br><br>

### 파일 구성 및 내용

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmKpMy%2FbtrR9Nvsw1s%2FpkOfKJ5Yk0yAGMQKM5Si71%2Fimg.png" width="60%"/><br>

---

### • style.css

\- section에 대한 디자인을 재설정해 주었다.<br>

```
.product-name {
    font-size: 7.5rem;
    text-align: center;
    margin-top: 2em;
}

.sticky-element {
    display: none;
    position: fixed;
}

.section0-message {
    font-size: 4.5rem;
    font-weight: bold;
    width: 100%;
    height: 6rem;
    left : 0;
    top: 5em;
    text-align: center;
}

#show-section0 .sticky-element{
    display: block;
}
```

<br>

### • main.js

\- 스크롤을 내릴때 마다 section영역에 대한 정보를 알려주는 이벤트를 작성하였다.<br>

```
const setBodyID = function(section)
{
    document.body.setAttribute('id', `show-section${section}`);
}

////////////////////////////////////////////////////////
// 이벤트 핸들러

    // 스크롤은 system이기 때문에 상위 window에 이벤트추가
    window.addEventListener('scroll', () => {
        yOffset = window.scrollY;

        // 현재 섹션값을 가지고 온 뒤 body 아이디 설정
        currentSection = getCurrentSection();       // 스크롤할때마다 섹션위치를 업데이트
        setBodyID(currentSection);  // currentSection을 통해 받아온 섹션 위치를 통해 body의 id값 새로고침
    });
```

<br>

---

### 결과화면

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fpcx6H%2FbtrSjuObJgT%2FTM8q4NPspQQfTeYsLMfgfK%2Fimg.png" width="100%"/><br><br>

[티스토리 바로가기](https://onelight-stay.tistory.com/661)
