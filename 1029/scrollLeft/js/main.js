$(function () {

    var cont01 = $(".cont1").offset().left;
    var cont02 = $(".cont2").offset().left;
    var cont03 = $(".cont3").offset().left;
    var cont04 = $(".cont4").offset().left;


    // console.log(cont01,cont02,cont03,cont04);
    // 0 736 1472 2208

    $(window).scroll(function () {

        var sTop = Math.floor($(window).scrollTop());
        var sLeft = Math.floor($(window).scrollLeft());
        $(".scroll_left").text(sLeft); 

        for(var i = 0; i < $(".content").length; i++) {
            if (sLeft >= $(".content").eq(i).offset().left-100) {
                    $("nav ul li").removeClass("on");
                    $("nav ul li").eq(i).addClass("on");
                }
        }


        // if (sLeft >= cont01) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(0).addClass("on");
        // }
        // if (sLeft >= cont02-100) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(1).addClass("on");
        // }
        // if (sLeft >= cont03-100) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(2).addClass("on");
        // }
        // if (sLeft >= cont04-100) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(3).addClass("on");
        // }

    });

    $("nav ul li").click(function () {

        var i = $(this).index();
        // alert(i);
        var offset_l = $(".content").eq(i-1).offset().left;

        $("html, body").stop().animate({scrollLeft : offset_l}, 500);
        $("nav ul li").removeClass("on");
        $(this).addClass("on");

    });

    var scrollPosition = 0;

    $(".content").mousewheel(function(event,d) {

        console.log(event.originalEvent.delaY);
        event.preventDefault(); // 세로스크롤 금지.
        scrollPosition += event.originalEvent.deltaY;
        // scrollPosition += (-d*100);
        $("html, body").scrollLeft(scrollPosition);

        // scrollPosition += event.originalEvent.deltaY;
        // 마우스휠이벤트에서 세로방향스크롤
        // 양수값 : 마우스 휠을 아래로 내렸을때 (+100)
        // 음수값 : 마우스 휠을 위로 올렸을때 (-100)


        // if(d > 0) {
        //     var prev = $(this).prev().offset().left;
        //     $("html, body").stop().animate({scrollLeft : prev}, 1000, "easeOutBounce");
        // }
        // if(d < 0) {
        //     var next = $(this).next().offset().left;
        //     $("html, body").stop().animate({scrollLeft : next}, 1000, "easeOutBounce");
        // }

    });

});