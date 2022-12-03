# [D+45]

## Front-end 미니 프로젝트 2일차

### : 네비게이터 레이아웃 설정 및 section 크기 설정

<br>

### 오늘 한 일

\- 네비게이터 레이아웃 설정<br>
\- section영역을 집합으로 만들어 크기 설정<br><br>

### 파일 구성 및 내용

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FboVZ8g%2FbtrR9Gi0E22%2Fxe5dKNhqr7Ki7dZsaJrAlk%2Fimg.png" width="60%"/><br>

---

### • style.css

\- 상단 네비게이터에 대한 스타일 재설정 및 display를 flex로 설정해 주었다.<br>
\- 본문 영역 사이즈를 임시로 설정해 주었다.<br>

```
.global-nav {
    position: absolute;
    width: 100%;
    height: 44px;
    left: 0;
    top: 0;
}

.local-nav {
    position: absolute;
    width: 100%;
    height: 52px;
    left: 0;
    top: 45px;
}

.global-nav-links {
    display: flex;
    align-items: center;
    justify-content: space-between;
    height: 100%;
    max-width: 1000px;
    margin: 0 auto;
}

.local-nav-links {
    display: flex;              /* display 모드를 flex로 설정한다. */
    align-items: center;        /* 내부 아이템을 세로 중앙정렬 */
    justify-content: right;     /* 내부 아이템을 가로 우측정렬 */
    height: 100%;
    max-width: 1000px;
    margin: 0 auto;
    border-bottom: 1px solid gray;
}

.local-nav-product-link {
    font-size: 1.5rem;          /* 폰트는 rem */
    font-weight: bold;
    margin-right: auto;         /* 가질수 있는 margin의 최댓값 : auto */

}

/* Overview Compare Buy */
.local-nav-link {
    margin-left: 2em;           /* margin을 상대크기로 설정 - 간격은 em */
}

.product-name h1 {
    font-size: 7.5rem;
    text-align: center;
}

.sticky-element {
    display: none;
    position: fixed;
}

.scroll-section {
    border: 1px solid red;
}
```

 <br>

### • main.js

\- 본문 section정보들의 집합 정리 및 사이즈 설정 및 위치를 설정해 주었다.<br>

```
(() => {

    let yOffset = 0;

    // section 정보 집합
    const sectionSet = [
        // section-0의 정보들 - 높이, 배수, 엘리먼트정보
        {
            height : 0,
            hMultiple : 5,
            objs : {
                container : document.querySelector('#section-0')
            }
        },
        // section-1의 정보들
        {
            height : 0,
            hMultiple : 5,
            objs : {
                container : document.querySelector('#section-1')
            }
        }
    ];

////////////////////////////////////////////////////////
// 일반함수

// Element의 크기, 위치등을 설정
const setLayout = function()
{
    // section-0과 section-1의 높이를 설정한다.
    for(let i = 0; i < sectionSet.length; i++)
    {
        sectionSet[i].height = window.innerHeight * sectionSet[i].hMultiple;
        console.log('클라이언트 창 높이 : ' + window.innerHeight);
        console.log(i + '번째 섹션 높이 : ' + sectionSet[i].height);
        sectionSet[i].objs.container.style.height = `${sectionSet[0].height}px`;
    }

}



////////////////////////////////////////////////////////
// 이벤트 핸들러

    // 스크롤은 system이기 때문에 상위 window에 이벤트추가
    window.addEventListener('scroll', () => {
        yOffset = window.scrollY;

        console.log(yOffset);
    });

    // load : 모든 작업이 끝났다.
    window.addEventListener('load', () => {
        // section-0하고 section-1하고의 높이를 설정한다.
        setLayout();
    })
})();
```

<br>

---

### 결과화면

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FUT3Vh%2FbtrSa7GVREk%2FricUbOpj9ptWOeUu3kGZZk%2Fimg.png" width="100%"/><br><br>

[티스토리 바로가기](https://onelight-stay.tistory.com/659)
