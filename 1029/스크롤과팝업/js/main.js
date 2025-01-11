$(function() {

    // var at01 = $("#area1").offset().top;
    // var at02 = $("#area2").offset().top;
    // var at03 = $("#area3").offset().top;
    // var at04 = $("#area4").offset().top;
    // var at05 = $("#area5").offset().top;
    // var at06 = $("#area6").offset().top;
    var dTop = $("#floatdiv").offset().top
    // console.log(at01, at02, at03, at04, at05, at06);
    // console.log(dTop);


    $(window).scroll(function() {
        var sct = Math.floor($(window).scrollTop());
        $("#sTop").text(sct);

        if(sct > 100) {
            $("nav").addClass("fixed");
            $("#floatdiv").addClass("on");
        } else {
            $("nav").removeClass("fixed");
            $("#floatdiv").removeClass("on");
        }

        $("#floatdiv").stop().animate({top : sct+dTop}, 600);



        $(".main").each(function(i) {
            if (sct >= $(".main").eq(i).offset().top-100) {
                $("nav ul li").removeClass("on");
                $("nav ul li").eq(i).addClass("on");
                $("#floatdiv ul li").removeClass("on");
                $("#floatdiv ul li").eq(i).addClass("on");
            }
        });

        // for(var i = 0; i < 6; i++) {
        //     if (sct >= $("section > div").eq(i).offset().top-100) {
        //         $("nav ul li").removeClass("on");
        //         $("nav ul li").eq(i).addClass("on");
        //         $("#floatdiv ul li").removeClass("on");
        //         $("#floatdiv ul li").eq(i).addClass("on");
        //     }
        // }

        // if(sct >= at01-100) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(0).addClass("on");
        //     $("#floatdiv ul li").removeClass("on");
        //     $("#floatdiv ul li").eq(0).addClass("on");
        // }
        // if(sct >= at02-100) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(1).addClass("on");
        //     $("#floatdiv ul li").removeClass("on");
        //     $("#floatdiv ul li").eq(1).addClass("on");
        // }
        // if(sct >= at03-100) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(2).addClass("on");
        //     $("#floatdiv ul li").removeClass("on");
        //     $("#floatdiv ul li").eq(2).addClass("on");
        // }
        // if(sct >= at04-100) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(3).addClass("on");
        //     $("#floatdiv ul li").removeClass("on");
        //     $("#floatdiv ul li").eq(3).addClass("on");
        // }
        // if(sct >= at05-100) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(4).addClass("on");
        //     $("#floatdiv ul li").removeClass("on");
        //     $("#floatdiv ul li").eq(4).addClass("on");
        // }
        // if(sct >= at06-100) {
        //     $("nav ul li").removeClass("on");
        //     $("nav ul li").eq(5).addClass("on");
        //     $("#floatdiv ul li").removeClass("on");
        //     $("#floatdiv ul li").eq(5).addClass("on");
        // }


    });

    $("nav ul li").click(function() {
        var i = $(this).index();
        var offset_nav = $(".main").eq(i).offset().top;
        
        // $("nav ul li").removeClass("on");
        // $(this).addClass("on");

        $("html, body").stop().animate({scrollTop : offset_nav}, 1000, "easeOutBounce");

        return false
    });

    $("#floatdiv ul li").click(function() {
        var i = $(this).index();
        var offset_nav = $(".main").eq(i).offset().top;
        
        // $("nav ul li").removeClass("on");
        // $(this).addClass("on");

        $("html, body").stop().animate({scrollTop : offset_nav}, 1000, "easeOutBounce");

        return false
    });

    // $(".main").mousewheel(function(event, d) {
    //     // event 마우스 휠의 정보
    //     // d 이동 방향
    //     // console.log(d); // 마우스 휠을 위로 스크롤하면 양수(+1) 아래는 음수 (-1)

    //     if(d > 0) { // 휠 위로
    //         var prev = $(this).prev().offset().top;
    //         $("html").stop().animate({scrollTop : prev}, 1000, "easeOutBounce");
    //     }
    //     if(d < 0) { // 휠 아래로
    //         var next = $(this).next().offset().top;
    //         $("html").stop().animate({scrollTop : next}, 1000, "easeOutBounce");
    //     }

    // });

    $("html").mousewheel(function(event, d) {
        // 현재 스크롤 위치에서 가장 가까운 .main 요소를 찾음
        var currentSection = $(".main").filter(function() {
            return $(window).scrollTop() < $(this).offset().top + $(this).outerHeight();
        }).first();
        
        if(d > 0) { // 휠 위로
            var prev = currentSection.prev().offset().top;
            $("html").stop().animate({scrollTop: prev}, 1000, "easeOutBounce");
        }
        if(d < 0) { // 휠 아래로
            var next = currentSection.next().offset().top;
            $("html").stop().animate({scrollTop: next}, 1000, "easeOutBounce");
        }
    });


    $("#popup").draggable();
    $("#notice_wrap").draggable();

    if($.cookie('pop') != 'no') {
        $("#popup").show();
    }

    $("#popup").eq(0).click(function() {
        $("#popup").fadeOut("fast");
        // 서서히 사라짐
    });
    $("#popup area").ep(1).click(function() {
        $.cookie('pop','no',{expires:1});
        
        $("#popup").fadeOut("fast");

    });

    if($.cookie("popup") != "none") {
        $("#notice_wrap").hide();
    }

    var chk = $("#expiresChk");

    $(".closeBtn").on("click", closePop());

    function closePop () {
        if (chk.is(":checked")) {
            $.cookie("popup","none",{expires:3});
            // chk 변수(체크박스)가 checked를 가지고있으면
            // popup에 none을 3일동안 저장해라.
        }
        $("#notice_wrap").fadeOut("fast");
    }

    
    $("#nav, #popup, #notice_wrap").mousewheel(function(event) {
        event.preventDefault();  // 기본 스크롤 동작 차단
        event.stopPropagation(); // 상위 요소로 이벤트 전파 중단
    });
    

});