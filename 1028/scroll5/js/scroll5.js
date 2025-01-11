$(function () {

    $(window).scroll(function () {
        var sTop = Math.floor($(window).scrollTop());
        $(".s_top").text(sTop);
        if (sTop >= 400 && sTop <= 1200) {
            $(".left1").addClass("on");
        } else {
            $(".left1").removeClass("on");
        }
        if (sTop >= 800 && sTop <= 1800) {
            $(".right1").addClass("on");
        } else {
            $(".right1").removeClass("on");
        }
        if (sTop >= 2500 && sTop <= 3300) {
            setTimeout(function () {
                $(".s4_1").addClass("active");
            },0);
            setTimeout(function () {
                $(".s4_2").addClass("active");
            },100);
            setTimeout(function () {
                $(".s4_3").addClass("active");
            },200);
            setTimeout(function () {
                $(".s4_4").addClass("active");
            },300);
            setTimeout(function () {
                $(".s4_5").addClass("active");
            },400);
        } else {
            $(".s4_cover div").removeClass("active");
        }

    });

});