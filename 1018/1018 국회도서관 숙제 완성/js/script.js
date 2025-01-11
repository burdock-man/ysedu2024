var slide = document.querySelector(".slideBox");
var slideImg = document.querySelectorAll(".slideBox img");

var slideCurrent = document.querySelector(".slideController .slide_current");
var slidePrev = document.querySelector(".slideController .prev");
var slideStop = document.querySelector(".slideController .stop");
var slideNext = document.querySelector(".slideController .next");

var slideShowNum = 1;
var slideTotal = slideImg.length;
var slideWidth = document.querySelector(".slideBox>img").offsetWidth;

var slideCopyObj = slideImg[0].cloneNode(true); // 슬라이드 이미지 복사 // 이건 보여지는 이미지가 한개니까 굳이 for문 돌릴 필요 없음.
slide.append(slideCopyObj); // 슬라이드 이미지 붙여넣기

var slideNum = 0;

function updateSlideCurrent() {
    slideCurrent.textContent = (slideNum % slideTotal) + 1;
}

slideNext.addEventListener("click", function(){

    if (slideNum==4) {
        slideNum = 0;
        slide.style.transition = "none";
        slide.style.marginLeft = 0;
    }
    setTimeout(function(){
        slideNum++;
        slideCurrent
        slide.style.transition = "margin-left 0.5s";
        slide.style.marginLeft = -slideWidth*slideNum+"px";
        updateSlideCurrent();
    },100);

});


slidePrev.addEventListener("click", function () {
    if (slideNum == 0) {
        slideNum = 4;
        slide.style.transition = "none";
        slide.style.marginLeft = -slideWidth*slideNum+"px";
    }
    setTimeout(function () {
        slideNum--;
        slide.style.transition = "margin-left 0.5s";
        slide.style.marginLeft = -slideWidth*slideNum+"px";
        updateSlideCurrent();
    }, 100);
});

// 자동 재생 및 정지 ============================================================

var slideAutoPlaying = true; // 자동 재생 상태를 추적
var autoPlayInterval; // 자동 재생 간격을 저장할 변수

function slideAuto() {
    if (slideNum == 4) {
        slideNum = 0;
        slide.style.transition = "none";
        slide.style.marginLeft = 0;
    }
    setTimeout(function () {
        slideNum++;
        slide.style.transition = "margin-left 0.5s";
        slide.style.marginLeft = -slideWidth * slideNum + "px";
        updateSlideCurrent();
    }, 100);
}

function startAutoPlay() {
    autoPlayInterval = setInterval(slideAuto, 5000);
    isAutoPlaying = true;
    slideStop.style.background = "url(./img/ico_i_stop.png) no-repeat center / cover";
} // url(./img/ico_i_stop.png) 이것때문에 애 많이 먹었음.

function stopAutoPlay() {
    clearInterval(autoPlayInterval);
    isAutoPlaying = false;
    slideStop.style.background = "url(./img/ico_i_play.png) no-repeat center / cover";
}

slideStop.addEventListener("click", function () {
    if (isAutoPlaying) {
        stopAutoPlay();
    } else {
        startAutoPlay();
    }
});

startAutoPlay();

// ============================================================================



// 탭 메뉴 ====================================================================
const tabButtons = document.querySelectorAll(".tabButton");
const tabMenus = document.querySelectorAll(".tabMenu .menu");

tabButtons.forEach(function(link, index) {
    link.addEventListener("click", function(e) {
        e.preventDefault(); // 이건 연결된 링크가 없어서 상관 없지만, 그냥 넣어봄.

        tabMenus.forEach(function(content) {
            content.style.display = "none";
        });

        tabMenus[index].style.display = "block";

        tabButtons.forEach(function(tab) {
            tab.classList.remove("active");
        });

        link.classList.add("active");
    });
});

// ============================================================================
