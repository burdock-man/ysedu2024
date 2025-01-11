// const targetLink = document.querySelectorAll('.tab_menu a');
// const tabContent=document.querySelectorAll('#tabContent>div');

// for(let i=0; i<targetLink.length;i++){
//     targetLink[i].addEventListener('click',function(e){
//         e.preventDefault();
//         const orgTarget = e.target.getAttribute('href');
//         const tabTarget=orgTarget.replace("#","");
//         for(let j=0; j<tabContent.length; j++){
//             tabContent[j].style.display="none"
//         }
//         document.getElementById(tabTarget).style.display='block';

//         for(let k=0; k<targetLink.length; k++){
//             targetLink[k].classList.remove('active');
//             e.target.classList.add('active'); 
//         }
//     }); 
// }

$(function(){
    $(".tab_menu a").click(function(){
        let orgTarget = $(this).attr("href");
        $("#tabContent > div").hide();
        $(orgTarget).show(); // id 선택자로 인식
        $(".tab_menu a").removeClass("active");
        $(this).addClass("active");

        return false // 링크 금지!!! 아하!
    });

});