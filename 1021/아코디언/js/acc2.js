const btnCollapse = document.querySelector("#btn-collapse"); // all 버튼
const heading = document.querySelectorAll(".panel-heading");
const question = document.querySelectorAll(".panel-question"); // heading 과 body를 감싸는 question
const p_body = document.querySelectorAll(".panel-body");

heading.forEach (function(headingElement){
    headingElement.addEventListener("click", function(e){
        question.forEach(function(q){
            q.classList.remove("on");
        });
        e.target.parentNode.classList.add("on");
    });
});

var allOn = true;

btnCollapse.addEventListener("click", function(){

    if (allOn) {
        question.forEach(function(q){
            q.classList.remove("on");
            allOn = false;
        });
    } else {
        question.forEach(function(q){
            q.classList.add("on");
            allOn = true;
        });
    }
});