$(function() {

    const visual = $("#brandVisual ul li");
    const btn = $("#buttonList li");
    var current = 0; // btn.hasClass("on").index(); 


    btn.click(function() {

        var i = $(this).index();

        move(i);

        btn.removeClass("on");
        btn.eq(i).addClass("on");
        current = i;

        return false;

    });

    function move(i) {

        if(current < i) {
            visual.eq(i).css("left", "100%");
            visual.eq(current).stop().animate({left : "-100%"}, 500);
            visual.eq(i).stop().animate({left : "0"}, 500);
        } else if (current > i) {
            visual.eq(i).css("left", "-100%");
            visual.eq(current).stop().animate({left : "100%"}, 500);
            visual.eq(i).stop().animate({left : "0"}, 500);
        } else if (current == i) return false;

    }

    let id = setInterval(function() {
        let n = current + 1;
        if(n == 3) n = 0;
        btn.eq(n).trigger("click");
    }, 1000);

});