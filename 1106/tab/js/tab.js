// const targetLink = document.querySelectorAll('.tab_menu a'); //탭버튼
// const tabContent=document.querySelectorAll('#tabContent>div');
// // 탭내용

// //targetLink 배열을 forEach로 순회

// targetLink.forEach(function(link){

//     link.addEventListener('click',function(e){
//         e.preventDefault(); //링크금지
//         let orgTarget = e.target.getAttribute('href');
       
//         let tabTarget = orgTarget.replace("#","");
        
//         tabContent.forEach(function(content){
//             content.style.display = "none";
//         }); 
        
//         document.getElementById(tabTarget).style.display="block";

//         targetLink.forEach(function(link2){
//             link2.classList.remove('active');
//             e.target.classList.add('active');
//         });

       
//     }); 

// });

$(".tab_menu a").click(function() {
    let orgTarget = $(this).attr("href");
    $("#tabContent > div").hide();
    $(orgTarget).show();
    $(".tab_menu a").removeClass("active");
    $(this).addClass("active");

    return false;
});