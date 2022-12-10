# [D+53]

## Front-end 미니 프로젝트 9일차

### : 리코딩 완성

<br>

### 오늘 한 일

\- 리코딩 완성<br><br>

### 파일 구성 및 내용

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmKpMy%2FbtrR9Nvsw1s%2FpkOfKJ5Yk0yAGMQKM5Si71%2Fimg.png" width="60%"/><br>

---

### • style.css

```
video {
  width: 100%;
  margin: 0 auto;
  z-index: -5;
  opacity: 0.8;
}

.show-section0 .section0-message{
  display: block;
}

.section2-message {
  position: fixed;
  top: 5em;
  left: 0;
  width: 100%;
  display: none;
  text-align: center;
  font-size: 5rem;
  font-weight: bold;
  opacity: 0;
}

.show-section2 .section2-message {
  display: block;
}

#section0-canvas {
  /* absolute - 이미지를 가장상단에 위치시켜야 하기 때문에 일반적인 문서의 흐름을 제거한다. */
  position: fixed;
  left: 0;
  top: 0;
  width: 100%;
  z-index: -10;
  text-align: center;
}
```

<br>

### • index.html

```
<!-- section2 -->
  <section class="section2">
    <p id="section2-message-0" class="section2-message">
      아침에 사과 1개<br>챙겨보는건 어떨까요?
    </p>
    <video src="./video/apple.mp4" loop muted autoplay></video>
</section>
```

<br>

### • main.js

```
// calcValue : 애니메이션에 적용하기 위한 값을 CSS화 한다.
	//  - parameter : 각영역의 투명도설정값 ([0, 1, { start: 0.05, end: 0.14 }])
	//  - return : CSS화한 값
	const calcValue = function (value) 
	{
		let rate;
		let result;
		let height = sectionSet[currentSection].height;
	
		// 비율에 기반한 CSS화한 값
		let startValue = height * value[2].start;
		let endValue = height * value[2].end;
		let heightValue = endValue - startValue;
	
		// 설정범위에 벗어났을 경우 값의 가장 끝 값인 value[0]과 value[1]로
		// 임의로 값을 지정해준다.
		if(sectionYOffset < startValue)
		{
			result = value[0];
		}
		else if(sectionYOffset > endValue)
		{
			result = value[1];
		}
		else
		{
			rate = (sectionYOffset - startValue) / heightValue;
	
			result = (rate * (value[1] - value[0])) + value[0];
		}
		return result;
	};
	
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
				// opacity 값 초기화
				sectionSet[2].elemInfo.message.map((el) => {
					el.style.opacity = 0;
				});
	
				opacityValue = sectionSet[2].opacitySettingsValues;
				translateYValue = sectionSet[2].tanslateYSettingsValues;
				messageValue = sectionSet[2].elemInfo.message;
	
				// message0
				if(yOffsetRate < 0.25)
				{
					value = calcValue(opacityValue.message0_opacity_out);
					messageValue[0].style.opacity = value;
	
					value = calcValue(translateYValue.message0_translateY_out);
					messageValue[0].style.transform = `translateY(${value}%)`;
				}
	
				else	// 0.25범위 지나면 opacity를 1로 계속 유지하도록 설정
				{
					messageValue[0].style.opacity = 1;
				}
	
				break;
		}
	};
```

<br>

---

### 결과화면

<img src="https://blog.kakaocdn.net/dn/Bcpwh/btrThkLYY0V/XX0H1I3cJIWK5RqG3m5cKK/img.gif" width="100%"/><br><br>

[티스토리 바로가기](https://onelight-stay.tistory.com/672)
