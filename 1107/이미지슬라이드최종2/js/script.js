$(function() {

    var i = 0; // 클릭한 인덱스 번호
    var k = 0; // 현재 인덱스 번호 = current
    var repeat; //자동 슬라이드 관리 변수명

    $(".pager li").on("click", click_slide);
    // pager li의 클릭 기능을 켬. click_slide 함수 호출

    function click_slide () {

        $(".pager li").off("click");
        // 실행이 중복되지 않도록 전체 페이저의 클릭 기능을 끔.

        i = $(this).index();
        // 전역변수 i에 클릭한 li의 인덱스 번호를 저장.

        if(i > k) {
            $(".imgs li").eq(k).stop().animate({left : "-100%"}, 600);
            $(".imgs li").eq(i).css("left", "100%").stop().animate({left : "0"}, 600, function() {
                $(".pager li").on("click", click_slide);
            }); // 슬라이드가 끝난 후에 동작 - 콜백함수.
        } else if (i < k) {
            $(".imgs li").eq(k).stop().animate({left : "100%"}, 600);
            $(".imgs li").eq(i).css("left", "-100%").stop().animate({left : "0"}, 600, function() {
                $(".pager li").on("click", click_slide);
            });
        } else {
            $(".pager li").on("click", click_slide);
        }

        k = i;
        $(".pager li").removeClass("on").eq(i).addClass("on");

    }

    function timer () {
        repeat = setInterval(function() {
            i++;
            if(i == 5) {
                i = 0;
                $(".imgs li").eq(i).css("left", "-100%").stop().animate({left : "0"}, 600);
                $(".imgs li").eq(4).stop().animate({left : "100%"}, 600);
                $(".pager li").removeClass("on").eq(i).addClass("on");
                return
            } else {
                $(".imgs li").eq(i-1).stop().animate({left : "-100%"}, 600);
                $(".imgs li").eq(i).css("left", "100%").stop().animate({left : "0"}, 600);
                $(".pager li").removeClass("on").eq(i).addClass("on");
            }
        }, 1000);
    }

    timer();

    $("#img_slide").mouseover(function() {
        clearInterval(repeat);
    });

    $("#img_slide").mouseleave(function() {
        timer();
    });

    $(".next").on("click", next_slide);
    $(".prev").on("click", prev_slide);
    $(document).on("keydown", pressKey);

    function next_slide() {
        $(".next").off("click"); // next버튼 기능 멈춤
        $(document).off("keydown"); //키보드 사용 멈춤
        clearInterval(repeat); 

        i++;
        if(i == 5) i = 0;
        $(".imgs li").eq(i-1).stop().animate({left : "-100%"}, 600);
        $(".imgs li").eq(i).css("left", "100%").stop().animate({left : "0"}, 600, function() {
            $(".next").on("click", next_slide);
            $(document).on("keydown", pressKey);
        });
        $(".pager li").removeClass("on").eq(i).addClass("on");
        k = i;
    }

    function prev_slide() {
        $(".prev").off("click");
        $(document).off("keydown");
        clearInterval(repeat); 

        i--;
        if(i == -1) i = 4;
        // $(".imgs li").eq(i+1).stop().animate({left : "100%"}, 600);
        $(".imgs li").eq((i + 1) % 5).stop().animate({left : "100%"}, 600);
        $(".imgs li").eq(i).css("left", "-100%").stop().animate({left : "0"}, 600, function() {
            $(".prev").on("click", prev_slide);
            $(document).on("keydown", pressKey);
        });
        $(".pager li").removeClass("on").eq(i).addClass("on");
        k = i;
    }

    function pressKey(e) {  // 키코드 https://blog.outsider.ne.kr/322 참조
        if(e.keyCode == 65 || e.keyCode == 37) { // a나 ←키를 눌렀을 때
            prev_slide();
        } else if (e.keyCode == 68 || e.keyCode == 39) { // d나 →키를 눌렀을 때
            next_slide();
        }
    }



});