$(function(){
    var pop_prev = $(".slide_but p .prev");
    var pop_next = $(".slide_but p .next");
    var pop_pause = $(".slide_but p .pause");

    var popCurrent = 0;
    var popIndex = 0;
    var total = $(".pop_slide li").length // 사진 갯수 - 11

    pop_next.click(function(){
        popIndex = popCurrent+1;
        if(popIndex == total) popIndex = 0;
        var pop_cu = $(".pop_slide li").eq(popCurrent);
        var pop_ne = $(".pop_slide li").eq(popIndex);

        pop_cu.css("left","0").stop().animate({"left":"-100%"},600);
        pop_ne.css("left","100%").stop().animate({"left":"0"},600);
        
        popCurrent = popIndex;
        $(".slide_but p strong").text(popIndex+1);
    });

    pop_prev.click(function(){
        popIndex = popCurrent -1;
        if(popIndex == -1) popIndex = total -1;
        var pop_cu = $(".pop_slide li").eq(popCurrent);
        var pop_ne = $(".pop_slide li").eq(popIndex);

        pop_cu.css("left","0").stop().animate({"left":"100%"},600);
        pop_ne.css("left","-100%").stop().animate({"left":"0"},600);

        popCurrent = popIndex;

        $(".slide_but p strong").text(popIndex+1);
    });

    var id = setInterval(pop_auto,3000);

    function pop_auto () {
        pop_next.trigger("click");
    }

    pop_pause.click(function(){
        if (pop_pause.hasClass("on") == false) {
            clearInterval(id);
            pop_pause.addClass("on");
        } else {
            id = setInterval(pop_auto,3000);
            pop_pause.removeClass("on");
        }
    });

});