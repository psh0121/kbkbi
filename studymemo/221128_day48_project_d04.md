# [D+48]

## Front-end 미니 프로젝트 4일차

### : 스크롤 애니메이션 추가

<br>

### 오늘 한 일

\- 스크롤위치에 따라 현재섹션 위치와 섹션위치에 따른 Y의 상대값을 구하도록 설정<br>
\- section0에 대한 스크롤 애니메이션 추가 및 테스트<br><br>

### 파일 구성 및 내용

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmKpMy%2FbtrR9Nvsw1s%2FpkOfKJ5Yk0yAGMQKM5Si71%2Fimg.png" width="60%"/><br>

---

### • style.css

\- 스크롤 애니메이션에서 나타났다 사라졌다를 위해서 초기에 불투명도를 0으로 설정해주었다.<br>

```
.section0-message {
  opacity: 0;		/* 불투명도 : 0 */
  font-size: 4.5rem;
  font-weight: bold;
  width: 100%;
  height: 6rem;
  left: 0;
  top: 5em;
  text-align: center;
}
```

<br>

### • index.html

\- 각메시지마다 이벤트를 걸어주기 위해서 클래스명을 각각 a, b, c, d로 설정해 주었다.<br>

```
<section id="section-0" class="scroll-section">
    <div class="section0-product-name">
      <h1 class="product-name">Real Apple Pro</h1>
    </div>
    <div class="sticky-element section0-message a">
      <p>온전히 빠져들게 하는 빛깔</p>
    </div>
    <div class="sticky-element section0-message b">
      <!-- <p>나의 건강을 채워주는 향기</p> -->
    </div>
    <div class="sticky-element section0-message c">
      <!-- <p>깨끗한 자연의 신선함</p> -->
    </div>
    <div class="sticky-element section0-message d">
      <!-- <p>새롭게 입가를 찾아온 매혹</p> -->
    </div>
</section>
```

<br>

### • main.js

\- 스크롤이벤트 추가를 위해 필요한 함수들을 생성해 주었다.<br>
\- <b>getPrevSetionHeight</b> : 현재 섹션의 위에 있는 섹션의 높이의 합<br>
\- <b>playAnimation</b> : 애니메이션 동작 함수<br>
\- <b>calcValue</b> : 비율에따른 CSS값을 계산해주는 함수<br>

```
/ 현재 섹션의 위에 있는 섹션의 높이 합.
const getPrevSectionHeight = function()
{
  // 현재 섹션이 0 ==> 0
  // 현재 섹션 1 ==> section0의 높이
  // 현재 섹션 2 ==> section0의 높이 + section1의 높이
  let prevHeight = 0;

  for(let i = 0; i < currentSection; i++)
  {
      prevHeight = prevHeight + sectionSet[i].height;
  }

  return prevHeight;
}

// messageA_opacity_out : [0, 1, {start: 0.05, end: 0.14}]
const calcValue = function(values)
{
  let result = 0;
  let rate = 0;
  const height = sectionSet[currentSection].height;

  let partStart;  // start 스크롤값
  let partEnd;    // end 스크롤값 
  let partHeihgt; // end - start

  if(values.length === 2)
  {
      // 1. 스크롤 비율을 구한다.
      rate = sectionYOffset / height;

       // 2. 비율에 따른 실제 적용한 CSS값을 계산한다.
      result = (rate * (values[1] - values[0])) + values[0];
  }

  else if(values.length === 3)
  {
      // step01) 모든 값들을 비율이 아닌 실제화 한다.
      partStart =  values[2].start * height;  
      partEnd = values[2].end * height;
      partHeihgt = partEnd - partStart;

      // 설정한 범위값을 벗어난 값을 0또는 1로 설정해준다.
      if(sectionYOffset < partStart)
      {
          result = values[0];
      }
      else if(sectionYOffset > partEnd)
      {
          result = values[1];
      }
      else
      {
          // step02) sectionYOffset에서 partStart값을 빼내어 실제 범위내의 크기를 구하고
          // 범위간의 비율을 구한다.
          rate = (sectionYOffset - partStart) / partHeihgt;

          // step03) 값을 css화 하여 result안에 넣어준다.
          result = (rate * (values[1] - values[0])) + values[0];
      }
  }

  return result;
}

const playAnimation = function()
{
  let value;

  let scrollRate = sectionYOffset / sectionSet[currentSection].height;
  let objects = sectionSet[currentSection].objs;

  switch(currentSection)
  {
      case 0:
          
          if(scrollRate <= 0.25)
          {
              if(scrollRate <= sectionSet[currentSection].vals.messageA_opacity_out[2].end)
              {
                  value = calcValue(sectionSet[currentSection].vals.messageA_opacity_out);
              }
              else if(scrollRate > sectionSet[currentSection].vals.messageA_opacity_out[2].end)
              {
                  value = calcValue(sectionSet[currentSection].vals.messageA_opacity_in);
              }
              console.log('message A를 애니메이션');
          }
          else if((scrollRate > 0.25) && (scrollRate <= 0.5))
          {
              value = calcValue(sectionSet[currentSection].vals);    
              console.log('message B를 애니메이션');
          }
          else if((scrollRate > 0.5) && (scrollRate <= 0.75))
          {
              value = calcValue(sectionSet[currentSection].vals);    
              console.log('message C를 애니메이션');
          }
          else if((scrollRate > 0.75) && (scrollRate <= 1))
          {
              value = calcValue(sectionSet[currentSection].vals);    
              console.log('message D를 애니메이션');
          }

          // 1. messageA의 엘리먼트를 가지고 온다. --> 무한반복 우려 위에서한다.

          break;
      
      case 1:
          // 2. 스크롤 값에 따라 적용해야할 CSS값을 계산한다.
          // 3. 계산된 결과를 적용한다.
          break;
      
      default:
          break;
      
      
  }

  objects.messageA.style.opacity = value;
}
```

<br>

---

### 결과화면

<img src="https://blog.kakaocdn.net/dn/bKaxAx/btrSJx6wktA/NLHGBJbCJbGlfl4KK9NCK0/img.gif" width="100%"/><br><br>

[티스토리 바로가기](https://onelight-stay.tistory.com/664)
