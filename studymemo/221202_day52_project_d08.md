# [D+52]

## Front-end 미니 프로젝트 8일차

### : 섹션 완성

<br>

### 오늘 한 일

\- section2 추가 및 전반적인 section 완성<br>
\- section2 동영상 추가<br><br>

### 파일 구성 및 내용

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmKpMy%2FbtrR9Nvsw1s%2FpkOfKJ5Yk0yAGMQKM5Si71%2Fimg.png" width="60%"/><br>

---

### • style.css

```
footer {
  /* flex - footer안에 있는 내용을 가운데로 정렬해줄 것이다. */
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 5em;
  background-color: gray;
  color: black;
  font-weight: bold;
}

video {
  margin: 0 auto;
  border: 3px solid palegoldenrod;
}
```

<br>

### • index.html

```
<!-- section2 -->
<section class="section2">
    <p class="section2-message">맛있는 사과</p>
    <video src="./video/apple.mp4" loop muted autoplay width="1000px"></video>
</section>
```

<br>

### • main.js

```
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
				canvas: document.querySelector("#section0-canvas")
			},
			opacitySettingsValues: {	// 투명도 애니메이션 셋팅 값들
				message0_opacity_out: [0, 1, { start: 0.05, end: 0.14 }],
				message0_opacity_in: [1, 0, { start: 0.15, end: 0.24 }],

				message1_opacity_out: [0, 1, { start: 0.25, end: 0.34 }],
				message1_opacity_in: [1, 0, { start: 0.35, end: 0.44 }],

				message2_opacity_out: [0, 1, { start: 0.45, end: 0.54 }],
				message2_opacity_in: [1, 0, { start: 0.55, end: 0.64 }],

				message3_opacity_out: [0, 1, { start: 0.65, end: 0.74 }],
				message3_opacity_in: [1, 0, { start: 0.75, end: 0.84 }],
			},
			tanslateYSettingsValues: {	// 글자 위치 애니메이션 셋팅 값들
				message0_translateY_out: [0, -20, { start: 0.05, end: 0.14 }],
				message0_translateY_in: [-20, -40, { start: 0.15, end: 0.24 }],

				message1_translateY_out: [0, -20, { start: 0.25, end: 0.34 }],
				message1_translateY_in: [-20, -40, { start: 0.35, end: 0.44 }],

				message2_translateY_out: [0, -20, { start: 0.45, end: 0.54 }],
				message2_translateY_in: [-20, -40, { start: 0.55, end: 0.64 }],

				message3_translateY_out: [0, -20, { start: 0.65, end: 0.74 }],
				message3_translateY_in: [-20, -40, { start: 0.75, end: 0.84 }],
			},
			imageSettingsValues: {	// 캔버스 이미지 애니메이션 셋팅 값들
				imageCount: 500,
				imageRange: [0, 499, {start: 0, end: 1}],
				image_in: [1, 0, {start: 0.85, end: 1}],
				images: []
			}
		},
		// section1
		{
			height: 0,
			multiplyValue: 2,
			elemInfo: {
				section: document.querySelector(".section1")
			},
		},
		// section2
		{
			height:0,
			multiplyValue: 1,
			elemInfo: {
				section: document.querySelector(".section2"),
				message: document.querySelector(".section2-message")
			}
		}
	];
    
    /////////////////////////////////////////////////////////
	// 일반 함수
    
    // playAnimation : 섹션에 따른 애니메이션 동작 시키기
	//  - parameter : x
	//  - return : x
	const playAnimation = function () 
	{
		let value;
		let opacityValue;
		let translateYValue;
		let messageValue;

		let imageIndex = 0;
		

		const yOffsetRate = sectionYOffset / sectionSet[currentSection].height;

		let canvasCtx;
		let images;
		let imageRange;

		switch (currentSection) 
		{
			case 0:		// section0

				// cnavas info
				canvasCtx = sectionSet[currentSection].elemInfo.canvas.getContext('2d');
				images = sectionSet[currentSection].imageSettingsValues.images;
				imageRange = sectionSet[currentSection].imageSettingsValues.imageRange;

				imageIndex = Math.floor(calcValue(imageRange));
				canvasCtx.drawImage(images[imageIndex], 0, 0);

				// opacitiy 값 초기화
				sectionSet[0].elemInfo.message.map((el) => {
					el.style.opacity = 0;
				});

				opacityValue = sectionSet[0].opacitySettingsValues;
				translateYValue = sectionSet[0].tanslateYSettingsValues;
				messageValue = sectionSet[0].elemInfo.message;

				// message0
				if (yOffsetRate < 0.15) 
				{
					value = calcValue(opacityValue.message0_opacity_out);
					messageValue[0].style.opacity = value;
					
					value = calcValue(translateYValue.message0_translateY_out);
					messageValue[0].style.transform = `translateY(${value}%)`;
				} 
				else if (yOffsetRate >= 0.15 && yOffsetRate < 0.25) 
				{
					value = calcValue(opacityValue.message0_opacity_in);
					messageValue[0].style.opacity = value;

					value = calcValue(translateYValue.message0_translateY_in);
					messageValue[0].style.transform = `translateY(${value}%)`;
				}

				// message1
				else if (yOffsetRate >= 0.25 && yOffsetRate < 0.35) 
				{
					value = calcValue(opacityValue.message1_opacity_out);
					messageValue[1].style.opacity = value;

					value = calcValue(translateYValue.message1_translateY_out);
					messageValue[1].style.transform = `translateY(${value}%)`;
				} 
				else if (yOffsetRate >= 0.35 && yOffsetRate < 0.45) 
				{
					value = calcValue(opacityValue.message1_opacity_in);
					messageValue[1].style.opacity = value;

					value = calcValue(translateYValue.message1_translateY_in);
					messageValue[1].style.transform = `translateY(${value}%)`;
				}

				// message2
				else if (yOffsetRate >= 0.45 && yOffsetRate < 0.55) 
				{
					value = calcValue(opacityValue.message2_opacity_out);
					messageValue[2].style.opacity = value;

					value = calcValue(translateYValue.message2_translateY_out);
					messageValue[2].style.transform = `translateY(${value}%)`;
				} 
				else if (yOffsetRate >= 0.55 && yOffsetRate < 0.65) 
				{
					value = calcValue(opacityValue.message2_opacity_in);
					messageValue[2].style.opacity = value;

					value = calcValue(translateYValue.message2_translateY_in);
					messageValue[2].style.transform = `translateY(${value}%)`;
				}

				// message3
				else if (yOffsetRate >= 0.65 && yOffsetRate < 0.75) 
				{
					value = calcValue(opacityValue.message3_opacity_out);
					messageValue[3].style.opacity = value;

					value = calcValue(translateYValue.message3_translateY_out);
					messageValue[3].style.transform = `translateY(${value}%)`;
				} 
				else if (yOffsetRate >= 0.75 && yOffsetRate < 0.85) 
				{
					value = calcValue(opacityValue.message3_opacity_in);
					messageValue[3].style.opacity = value;

					value = calcValue(translateYValue.message3_translateY_in);
					messageValue[3].style.transform = `translateY(${value}%)`;
				}

				else 
				{
					value = calcValue(sectionSet[currentSection].imageSettingsValues.image_in);
					sectionSet[currentSection].elemInfo.canvas.style.opacity = value;
				}

				break;

			case 1:		// section1
				break;

			case 2:		// section2
				break;
		}
	};

	// setCanvasImage : 이미지를 로딩하고 캔버스에 이미지를 셋팅한다.
	//  - parameter : x
	//  - return : x
	const setCanvasImage = function() 
	{
		const imageCount = sectionSet[0].imageSettingsValues.imageCount;
		const imagesArr = sectionSet[0].imageSettingsValues.images;
		let imageElem;

		for(let i = 0; i < imageCount; i++)
		{
			imageElem = new Image();
			imageElem.src = `./image/apple_${i}.png`;

			imagesArr.push(imageElem);
		}

		const ctx = sectionSet[0].elemInfo.canvas.getContext('2d');

		imageElem.addEventListener("load", () => {
			ctx.drawImage(imagesArr[0], 0, 0);
		});
		
	};

	// fixLocalNav : 스크롤을 내릴때 global nav 영역을 벗어나면 position fixed로 변경
	//  - parameter : x
	//  - return : x
	const fixLocalNav = function()
	{
		if(currentScrollY > 44)
		{
			document.body.id = "fix-local";
		}
		else 
		{
			document.body.removeAttribute("id");
		}
	}

	/////////////////////////////////////////////////////////
	// 이벤트 핸들러

	// 로딩된후에 발생되는 이벤트!
	window.addEventListener("load", () => {

		setLayout();

		currentScrollY = window.scrollY;
		currentSection = getCurrentSection();
		sectionYOffset = getSectionYOffset();

		setBodyClass();
		
		setCanvasImage();
	});

	// 스크롤을 진행했을시에 발생되는 이벤트!
	window.addEventListener("scroll", () => {
		currentScrollY = window.scrollY;
		currentSection = getCurrentSection();
		sectionYOffset = getSectionYOffset();

		setBodyClass();

		playAnimation();

		fixLocalNav();
	});

	// window창의 크기를 변경해주었을때 발생되는 이벤트!
	window.addEventListener("resize", () => {
		setLayout();

		currentScrollY = window.scrollY;
		currentSection = getCurrentSection();
		sectionYOffset = getSectionYOffset();

		setBodyClass();
	});

	// 글자에 마우스를 댔다가 뗐다가 했을때 발생되는 이벤트!
	(sectionSet[2].elemInfo.message).addEventListener("mouseenter",() => {
		sectionSet[2].elemInfo.message.style.color = "red";
	});

	(sectionSet[2].elemInfo.message).addEventListener("mouseleave",() => {
		sectionSet[2].elemInfo.message.style.color = "white";
	});
```

<br>

---

### 결과화면

<img src="https://blog.kakaocdn.net/dn/lyBVC/btrTlsaIWFW/ZFVmXAWqsk5e2alcFhxyIK/img.gif" width="100%"/><br><br>

[티스토리 바로가기](https://onelight-stay.tistory.com/671)
