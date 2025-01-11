var sub = document.querySelectorAll(".sub");
function slideUp() {
//     sub.forEach(function(item) {
//         item.style.height = "0px";
// }
    for(let i = 0; i < sub.length; i++) {
        sub[i].style.height = "0px"
    }
}

var menuLiA = document.querySelectorAll(".m_menu>li>a");

// menuLiA.forEach(function(item) {
//     item.addEventListener("click", function() {
//         var subHeight = getComputedStyle(this.nextElementSibling).height;
//         // getComputedStyle == DOM요소의 현재스타일을 가져오기 위한 메서드
//     });
// });

for(let i = 0; i < menuLiA.length; i++) {

    menuLiA[i].addEventListener("click", function() {
        
        var subHeight = getComputedStyle(this.nextElementSibling).height;

        if(subHeight === "0px") {
            slideUp();
            this.nextElementSibling.style.height = "108px";
        } else {
            this.nextElementSibling.style.height = "0px";
        }

    });
}