function next_slide(){

    $(".next").off("click"); // next버튼 기능 멈춤
    $(document).off("keydown"); //키보드 사용 멈춤
    clearInterval(repeat); //자동슬라이드 멈춤

    i++;
    if(i == 5) i = 0;
    
    $(".imgs li").eq(i).css("left", "100%").animate({
        "left": 0
    }, 600);
    $(".imgs li").eq(i - 1).css("left", "0%").animate({
        "left": "-100%"
    }, 600, function () {
        $(".next").on("click", next_slide);
        $(document).on("keydown", pressKey);
        timer();
    });
    $(".pager li").removeClass("on").eq(i).addClass("on");
    k = i; 

}