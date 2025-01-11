var sub = document.querySelectorAll(".sub");
var menuLiA = document.querySelectorAll(".m_menu>li>a");
// var  = document.querySelector("");

function slideUp () {
    sub.forEach (function(item){
        item.style.height = "0px";
    });
}

menuLiA.forEach(function(item){
    item.addEventListener("click",function(){
        var subHeight = getComputedStyle(this.nextElementSibling).height;
        // getComputedStyle은 이번에 새로나온 놈이라는데 어려워보인다. 애초에 nextElementSibling도 모르겠음.
        // getComputedStyle == DOM 요소의 현재 스타일을 가져오기위한 매서드
        // 이 메서드를 사용하면 특징 요소에 적용된 모든 스타일 속성과 그 값에 대한 정보를 얻는다.
        if (subHeight == "0px") {
            slideUp(); // 다른 sub를 닫는 함수.
            this.nextElementSibling.style.height = "108px";
        }
    });
});
