# [D+50]

## Front-end 미니 프로젝트 6일차

### : 섹션 애니메이션 추가 및 가이드코드 완성

<br>

### 오늘 한 일

\- section0에 대한  canvas 애니메이션 추가<br>
\- section1에 대한 스타일 적용 <br>
\- 가이드 코드 완성<br><br>

### 파일 구성 및 내용

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmKpMy%2FbtrR9Nvsw1s%2FpkOfKJ5Yk0yAGMQKM5Si71%2Fimg.png" width="60%"/><br>

---

### • style.css

\- canvas에 대한 스타일을 설정해 주었다.<br>
\- section1에 대한 스타일을 설정해 주었다.<br>
\- footer에 대한 스타일을 수정해 주었다.<br>

```
footer {
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;

  height: 4em;
  width: 100%;
  background-color: darkgray;

  font-size: 2rem;
  font-weight: bold;

  color: black;
}

.section0-canvas {
  left: 0;
  top: 0;
  width: 100%;

  text-align: center;
  z-index: -5;
}

.section1-message {
  max-width: 100%;
}

.section1-description {
  font-size: 2.5rem;
  max-width: 1000px;
  margin: 0 auto;
  line-height: 3em;
}

.section1-description>strong {
  float: left;
  font-size: 4.5rem;
}

.local-nav-sticky .local-nav {
  position: fixed;
  left: 0;
  top: 0;

  border-bottom: 1px solid gray;

  -webkit-backdrop-filter: saturate(180%) blur(15px);
  -moz-backdrop-filter: saturate(180%) blur(15px);
  -o-backdrop-filter: saturate(180%) blur(15px);
  backdrop-filter: saturate(180%) blur(15px);
}

.local-nav-sticky .local-nav-links {
  border: none;
}
```

<br>

### • index.html

\- section0에 canvas태그를 사용해 이미지를 추가 시켜 주었다.<br>

```
<div class="sticky-element section0-canvas">
      <canvas id="main-canvas" width="1920" height="1080"></canvas>
</div>
```

<br>

### • main.js

\- canvas에 대한 애니메이션을 추가해 주었다.<br>
\- 일정부분 스크롤 하였을 때 nav가 상단에 고정되도록 해주었다.<br>
\- <b>setCanvas</b> : 모든 이미지를 로딩하고 0번째 이미지를 캔버스에 출력한다.<br>
\- <b>setLocalnavMenu</b> : 스크롤값이 localnav를 넘어감에 따라 localnav의 position이 fixed로 변경되도록 한다.<br>

```
// setCanvas = 모든 이미지를 로딩하고 0번째 이미지를 캔버스에 출력한다.
const setCanvas = function()
{
    let imageCount = sectionSet[0].vals.imageCount;
    let canvasImages = sectionSet[0].objs.canvasImages;
    let imageElement;
    
    // 파일을 로딩한다.
    for(let i = 0; i < imageCount; i++)
    {
        imageElement = new Image();
        imageElement.src = `./image/apple_${i}.png`;

        // 로딩한 파일을 배열에 넣어준다.
        canvasImages.push(imageElement);
    }

    // load 이벤트 발생!!!
    imageElement.addEventListener('load', () => {
        // 캔버스에 0번째 이미지를 드로잉한다.
        sectionSet[0].objs.context.drawImage(canvasImages[0], 0, 0);
    })
}

// setLocalnavMenu = 스크롤값이 localnav를 넘어감에 따라 localnav의 position fixed로 변경
// --> class를 붙여주거나 떼어줌으로써 position값을 변경할 수 있다.
const setLocalnavMenu = function()
{
    // yOffset값이 localnav크기를 넘어갔다면 --> 클래스 추가 (position fixed)
    if(yOffset > 44)
    {
        document.body.classList.add('local-nav-sticky');
    }

    // yOffset값이 localnav크기를 넘어가지 않았다면 --> 클래스 삭제 (position absolute)
    else
    {
        document.body.classList.remove('local-nav-sticky');
    }
}

////////////////////////////////////////////////////////
// 이벤트 핸들러

    // scroll 이벤트 발생!!!
    // --> scroll은 system이기 때문에 가장 상위에 이벤트를 추가해준다.
    window.addEventListener('scroll', () => {

        // yOffset = 현재 얼마나 스크롤이 되었는가
        yOffset = window.scrollY;

        // currentSection = 현재 섹션위치
        // sectionYOffset = 섹션에 따른 yOffset의 상대값
        currentSection = getCurrentSection();
        sectionYOffset = yOffset - getPrevSectionHeight();

        // setBodyID(currentSection) : 현재섹션 위치를 기반으로 body엘리먼트 id값 새로고침
        setBodyID(currentSection);

        // setLocalnavMenu() : 상단의 nav를 yOffset값에 의한 고정 유무를 설정
        setLocalnavMenu();

        // playAnimation() : CSS에 따른 애니메이션 동작
        playAnimation();
    });

    // load 이벤트 발생!!!
    // --> load는 전체페이지가 로드된 이후에 이벤트가 발생된다.
    window.addEventListener('load', () => {
        
        // setLayout() : 섹션에 대한 높이를 설정해 준다.
        setLayout();

        // currentSection = 현재 섹션위치
        // sectionYOffset = 섹션에 따른 yOffset의 상대값
        currentSection = getCurrentSection();
        sectionYOffset = yOffset - getPrevSectionHeight();

        // setCanvas() : 모든 이미지를 로딩하고 0번째 이미지를 캔버스에 출력
        setCanvas();

        // setBodyID(currentSection) : 현재섹션 위치를 기반으로 body엘리먼트 id값 새로고침
        setBodyID(currentSection);

        // setLocalnavMenu() : 상단의 nav를 yOffset값에 의한 고정 유무를 설정
        setLocalnavMenu();

    })

    // 사이즈를 재설정 해주었을 때 값들을 일부 다시 수정해주어야 한다.
    window.addEventListener("resize", () => {
        
        // setLayout() : 섹션에 대한 높이를 설정해 준다.
        setLayout();

        // currentSection = 현재 섹션위치
        // sectionYOffset = 섹션에 따른 yOffset의 상대값
        currentSection = getCurrentSection();
        sectionYOffset = yOffset - getPrevSectionHeight();

        // setBodyID(currentSection) : 현재섹션 위치를 기반으로 body엘리먼트 id값 새로고침
        setBodyID(currentSection);

        // setLocalnavMenu() : 상단의 nav를 yOffset값에 의한 고정 유무를 설정
        setLocalnavMenu();

    })
```

<br>

---

### 결과화면

<img src="https://blog.kakaocdn.net/dn/c2lqVR/btrSYlXmKS7/eLFd6Nq2N6EFTu1sU1LozK/img.gif" width="100%"/><br><br>

[티스토리 바로가기](https://onelight-stay.tistory.com/668)
