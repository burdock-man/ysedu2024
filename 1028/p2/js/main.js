$(function () {

    $(window).scroll(function () {

        var scTop = Math.floor($(window).scrollTop());
        $("h3").text(scTop);

        if (scTop >= 0 && scTop <= 700) {
            $(".area1").addClass("on");
        } else {
            $(".area1").removeClass("on");
        }
        if (scTop >= 450 && scTop <= 1400) {
            $(".area2").addClass("on");
        } else {
            $(".area2").removeClass("on");
        }
        if (scTop >= 1200 && scTop <= 2100) {
            $(".area3").addClass("on");
        } else {
            $(".area3").removeClass("on");
        }
        if (scTop >= 1800 && scTop <= 2800) {
            $(".area4").addClass("on");
        } else {
            $(".area4").removeClass("on");
        }
        if (scTop >= 2500 && scTop <= 3500) {
            $(".area5").addClass("on");
        } else {
            $(".area5").removeClass("on");
        }
    });
});