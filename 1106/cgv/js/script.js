$(function() {

    var num = 0;

    $(".rightBtn").click(function() {

        if (num == 3) return false

        $(".slide_wrap").stop().animate({left : -1010*(num+1)}, 500);
        num++;


    });

    $(".leftBtn").click(function() {

        if (num == 0) return false

        $(".slide_wrap").stop().animate({left : -1010*(num-1)}, 500);
        num--;

    });


});