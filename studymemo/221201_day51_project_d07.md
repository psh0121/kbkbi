# [D+51]

## Front-end 미니 프로젝트 7일차

### : 리코딩 시작 및 섹션0 애니메이션 설정

<br>

### 오늘 한 일

\- global nav, local nav 제작<br>
\- section 레이아웃 설정<br>
\- section0 애니메이션 설정<br><br>

### 파일 구성 및 내용

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmKpMy%2FbtrR9Nvsw1s%2FpkOfKJ5Yk0yAGMQKM5Si71%2Fimg.png" width="60%"/><br>

---

### • style.css

```
@charset 'utf-8';

html {
  font-family: 'Noto Sans KR', sans-serif;
  font-size: 14px;
}

body {
  word-spacing: -0.08rem;
  letter-spacing: -0.03rem;
  overflow-x: hidden;
}

a {
  text-decoration: none;
  font-size: 0.9rem;
  color: white;
}

.global {
  /* absolute - section영역설정을 위한 독립영역생성 */
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 44px;
  padding: 0 5% 0 5%;
  background-color: black;
}

.global-container {
  /* flex - global-container안 global-item들의 배치 수평적 구조 목적 */
  display: flex;
  max-width: 1000px;
  height: 100%;
  align-items: center;
  justify-content: space-between;
  margin: 0 auto;
}

.local {
  /* absolute - section영역설정을 위한 독립영역생성 */
  position: absolute;
  top: 44px;
  left: 0;
  width: 100%;
  height: 52px;
  padding: 0 5% 0 5%;
  border-bottom: 1px solid gray;
}

.local-container {
  /* flex - global-container안 global-item들의 배치 수평적 구조 목적 */
  display: flex;
  max-width: 1000px;
  height: 100%;
  align-items: center;
  justify-content: right;
  margin: 0 auto;
}

.local-item-main {
  margin-right: auto;
  font-size: 1.5rem;
}

.local-item {
  margin-left: 1em;
}

.local-item, .local-item-main {
  color: black;
  font-weight: bold;
}

/* static - section은 기존문서의 흐름을 따르도록 한다. */

.section0-main {
  padding-top: 2em;
  text-align: center;
  font-size: 6rem;
}

.section0-message {
  /* fixed - 스크롤이벤트 발생시 애니메이션효과 추가할 것 */
  position: fixed;
  width: 100%;
  display: none;
  text-align: center;
  font-size: 5rem;
  font-weight: bold;
  opacity: 0;
}

.show-section0 .section0-message {
  display: block;
}

.section1, footer {
  border: 2px solid red;
}
```

<br>

### • index.html

```
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>

  <!-- 웹폰트 -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;700&display=swap" rel="stylesheet">

  <!-- 스타일 -->
  <link rel="stylesheet" href="./reset.css">
  <link rel="stylesheet" href="./style.css">
</head>
<body class ="show-section0">
  
  <!-- global nav -->
  <nav class="global">
    <div class="global-container">
      <a href="#" class="global-item">Home</a>
      <a href="#" class="global-item">History</a>
      <a href="#" class="global-item">Store</a>
      <a href="#" class="global-item">Contact</a>
    </div>
  </nav>
  
  <!-- local nav -->
  <nav class="local">
    <div class="local-container">
      <a href="#" class="local-item-main">RealApplePeach</a>
      <a href="#" class="local-item">Overview</a>
      <a href="#" class="local-item">Compare</a>
      <a href="#" class="local-item">Buy</a>
    </div>
  </nav>

  <!-- section0 -->
  <section class="section0">
    <div class="section0-main"><h1>Apple taste</h1></div>

    <div id="section0-message-0" class="section0-message">
      <p>온전히 빠져들게 하는 빛깔</p>
    </div>
    <div id="section0-message-1" class="section0-message">
      <p>나의 건강을 채워주는 향기</p>
    </div>
    <div id="section0-message-2" class="section0-message">
      <p>깨끗한 자연의 신선함</p>
    </div>
    <div id="section0-message-3" class="section0-message">
      <p>새롭게 입가를 찾아온 매혹</p>
    </div>
  </section>

  <!-- section1 -->
  <section class="section1">
    <div class="section1-message">
      <p>
        진짜 사과 이야기
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
  
  <!-- footer -->
  <footer>
    <div>
      <p>Copyleft 2022 PARK SUHYEON Allright reserved.</p>
    </div>
  </footer>

  <script src="./main.js"></script>
</body>
</html>
```

<br>

### • main.js

```
(() => {
	/*
  currentScrollY : 현재 scrollY 위치값
  currentSection : 현재 섹션위치
  sectionYOffset : 현재 섹션에 따른 scrollY 상대값
  */
	let currentScrollY = 0;
	let currentSection = 0;
	let sectionYOffset = 0;

	// sectionSet : n번째 섹션에 대한 각종 정보집합
	const sectionSet = [
		// section0
		{
			height: 0,
			multiplyValue: 5,
			elemInfo: {
				section: document.querySelector(".section0"),
				message: [
					document.querySelector("#section0-message-0"),
					document.querySelector("#section0-message-1"),
					document.querySelector("#section0-message-2"),
					document.querySelector("#section0-message-3"),
				],
			},
			opacitySettingsValues: {
				message0_opacity_out: [0, 1, { start: 0.05, end: 0.14 }],
				message0_opacity_in: [1, 0, { start: 0.15, end: 0.24 }],

				message1_opacity_out: [0, 1, { start: 0.25, end: 0.34 }],
				message1_opacity_in: [1, 0, { start: 0.35, end: 0.44 }],

				message2_opacity_out: [0, 1, { start: 0.45, end: 0.54 }],
				message2_opacity_in: [1, 0, { start: 0.55, end: 0.64 }],

				message3_opacity_out: [0, 1, { start: 0.65, end: 0.74 }],
				message3_opacity_in: [1, 0, { start: 0.75, end: 0.84 }],
			},
		},
		// section1
		{
			height: 0,
			multiplyValue: 3,
			elemInfo: {
				section: document.querySelector(".section1"),
			},
		},
	];

	/////////////////////////////////////////////////////////
	// 일반 함수

	// setLayout : window창 크기에 대한  section 사이즈 영역 설정
	//  - parameter : x
	//  - return : x
	const setLayout = function () {
		const currentHeight = window.innerHeight;

		for (let i = 0; i < sectionSet.length; i++) {
			sectionSet[i].height = currentHeight * sectionSet[i].multiplyValue;
			sectionSet[i].elemInfo.section.style.height = `${sectionSet[i].height}px`;
		}
	};

	// getCurrentSection : scrollY 위치에 따른 현재 section 위치 구하기
	//  - parameter : x
	//  - return : 현재 섹션 값
	const getCurrentSection = function () {
		let value = 0;
		let sum = 0;
		let index = 0;

		for (let i = 0; i < sectionSet.length; i++) {
			sum = sum + sectionSet[i].height;

			if (currentScrollY <= sum) {
				value = index;
				break;
			}
			index++;
		}

		return value;
	};

	// getSectionYOffset : 현재 섹션 위치에 따른 scrollY의 상대값 구하기
	//  - parameter : x
	//  - return : 현재 섹션 위치에 따른 scrollY 상대값
	const getSectionYOffset = function () {
		let value = currentScrollY;

		for (let i = 0; i < currentSection; i++) {
			value = value - sectionSet[i].height;
		}

		return value;
	};

	// setBodyClass : 현재 섹션 위치에 따른 body class 업데이트
	//                section0의 내용이 다른 섹션에 위치하게 했을 때 안보이게 하기위한 것
	//  - parameter : x
	//  - return : x
	const setBodyClass = function () {
		document.body.className = `show-section${currentSection}`;
	};

	// calcValue : 애니메이션에 적용하기 위한 값을 CSS화 한다.
	//  - parameter : 각영역의 투명도설정값 ([0, 1, { start: 0.05, end: 0.14 }])
	//  - return : CSS화한 값
	const calcValue = function (opacityValue) {
		let rate;
		let result;
		let height = sectionSet[currentSection].height;

		let startValue = height * opacityValue[2].start;
		let endValue = height * opacityValue[2].end;
		let heightValue = endValue - startValue;

		rate = (sectionYOffset - startValue) / heightValue;

		result = rate * (opacityValue[1] - opacityValue[0]) + opacityValue[0];

		if (result < 0) {
			result = 0;
		} else if (result > 1) {
			result = 1;
		}

		return result;
	};

	// playAnimation : 섹션에 따른 애니메이션 동작 시키기
	//  - parameter : x
	//  - return : x
	const playAnimation = function () {
		let value;
		let opacityValue;
		let messageValue;

		const yOffsetRate = sectionYOffset / sectionSet[currentSection].height;

		switch (currentSection) {
			case 0:
				sectionSet[0].elemInfo.message.map((el) => {
					el.style.opacity = 0;
				});

				opacityValue = sectionSet[0].opacitySettingsValues;
				messageValue = sectionSet[0].elemInfo.message;

				if (yOffsetRate < 0.15) {
					value = calcValue(opacityValue.message0_opacity_out);
					messageValue[0].style.opacity = value;
				} else if (yOffsetRate >= 0.15 && yOffsetRate < 0.25) {
					value = calcValue(opacityValue.message0_opacity_in);
					messageValue[0].style.opacity = value;
				} else if (yOffsetRate >= 0.25 && yOffsetRate < 0.35) {
					value = calcValue(opacityValue.message1_opacity_out);
					messageValue[1].style.opacity = value;
				} else if (yOffsetRate >= 0.35 && yOffsetRate < 0.45) {
					value = calcValue(opacityValue.message1_opacity_in);
					messageValue[1].style.opacity = value;
				} else if (yOffsetRate >= 0.45 && yOffsetRate < 0.55) {
					value = calcValue(opacityValue.message2_opacity_out);
					messageValue[2].style.opacity = value;
				} else if (yOffsetRate >= 0.55 && yOffsetRate < 0.65) {
					value = calcValue(opacityValue.message2_opacity_in);
					messageValue[2].style.opacity = value;
				} else if (yOffsetRate >= 0.65 && yOffsetRate < 0.75) {
					value = calcValue(opacityValue.message3_opacity_out);
					messageValue[3].style.opacity = value;
				} else if (yOffsetRate >= 0.75 && yOffsetRate < 0.85) {
					value = calcValue(opacityValue.message3_opacity_in);
					messageValue[3].style.opacity = value;
				} else {
				}
				break;

			case 1:
				break;
		}
	};
	/////////////////////////////////////////////////////////
	// 이벤트 핸들러

	window.addEventListener("load", () => {
		setLayout();

		currentScrollY = window.scrollY;
		currentSection = getCurrentSection();
		sectionYOffset = getSectionYOffset();

		setBodyClass();
	});

	window.addEventListener("scroll", () => {
		currentScrollY = window.scrollY;
		currentSection = getCurrentSection();
		sectionYOffset = getSectionYOffset();

		setBodyClass();

		playAnimation();
	});
})();
```

<br>

---

### 결과화면

<img src="https://blog.kakaocdn.net/dn/lyBVC/btrTlsaIWFW/ZFVmXAWqsk5e2alcFhxyIK/img.gif" width="100%"/><br><br>

[티스토리 바로가기](https://onelight-stay.tistory.com/670)
