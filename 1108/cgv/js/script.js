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







    var tap = $(".specialHall_list li");
    var tapImg = $(".specialHall_content .tapContent a");



    function tapAuto () {
        let i = $(".specialHall_list li.on").index();
        i = (i + 1) % tap.length;
        tap.eq(i).trigger("mouseover");
    }

    // var tapStop = setInterval(tapAuto, 1000);

    tap.mouseover(function() {
        // clearInterval(tapStop);
        tap.removeClass("on");
        $(this).addClass("on");
        tapImg.removeClass("on");
        tapImg.eq($(this).index()).addClass("on");
    });



});