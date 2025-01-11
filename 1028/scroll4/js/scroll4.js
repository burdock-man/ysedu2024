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
        if (sTop > 2500 && sTop <= 3400) {
            $(".s4_cover div").addClass("active");
        } else {
            $(".s4_cover div").removeClass("active");
        }
    });

});