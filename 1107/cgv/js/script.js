$(function() {

    var swiper = new Swiper(".mySwiper",{

        slidesPerView: 3,
        spaceBetween: 30,
        navigation: {
            nextEl: ".swiper-button-next",
            prevEl: ".swiper-button-prev",
        },
        autoplay: true,

    });

    $(".btn_eventCntrol").click(function() {
        if($(this).hasClass("on")==false) {
            $(this).addClass("on")
            swiper.autoplay.stop();
        } else {
            $(this).removeClass("on")
            swiper.autoplay.start();
        }
        return false
    });







    var num = 0;
    $(".leftBtn").css("display", "none");



    $(".rightBtn").click(function() {

        if(num == 2) {
            $(".rightBtn").css("display", "none");
        } else if($(".leftBtn").css("display", "none")) {
            $(".leftBtn").css("display", "block");
        }

        $(".slide_wrap").stop().animate({left : -1010*(num+1)}, 500);
        num++;

        return false;

    });


    $(".leftBtn").click(function() {

        if(num == 1) {
            $(".leftBtn").css("display", "none");
        } else if($(".rightBtn").css("display", "none")) {
            $(".rightBtn").css("display", "block");
        }

        $(".slide_wrap").stop().animate({left : -1010*(num-1)}, 500);
        num--;

        return false;

    });


});