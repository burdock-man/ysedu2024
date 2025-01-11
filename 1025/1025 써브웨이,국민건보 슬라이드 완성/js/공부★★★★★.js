$(function(){

    // 서브웨이 배너 ============================================================================

    var sbBtn = $(".s_ban_ctrl li");
    var sbImg = $(".s_ban_img li");
    var sbCurr = 0;

    $(sbBtn).click(function () {

        var sbShow = $(sbBtn).index(this);

        $(sbBtn).removeClass("on");
        $(this).addClass("on");

        if (sbCurr > sbShow) {
            $(sbImg[sbShow]).css("left","-100%");
            $(sbImg[sbCurr]).stop().animate({"left":"100%"}, 1000);
            $(sbImg[sbShow]).stop().animate({"left":"0%"}, 1000);
        } else if (sbCurr < sbShow) {
            $(sbImg[sbShow]).css("left","100%");
            $(sbImg[sbCurr]).stop().animate({"left":"-100%"}, 1000);
            $(sbImg[sbShow]).stop().animate({"left":"0%"}, 1000);
        } else if (sbShow == sbCurr) return

        sbCurr = sbShow;

    });

    function sbAuto(){
        if(sbCurr == $(sbBtn).length-1) {
            $(sbBtn).eq(0).trigger("click");
        } else {
            $(sbBtn).eq(sbCurr+1).trigger("click");
        }
    }

    var sbSlideStop = setInterval(sbAuto,5000);

    $(".s_ban_img").click(function(){
        if ($(".s_ban_img").hasClass("on")) {
            sbSlideStop = setInterval(sbAuto,5000);
            $(".s_ban_img").removeClass("on");
        } else {
            clearInterval(sbSlideStop);
            $(".s_ban_img").addClass("on");
        }
    });


    // 간소화한 sbBtn 클릭 이벤트 코딩. 참고할것.
    // $(sbBtn).click(function(){
    //     var sbShow = $(sbBtn).index(this);
    //     $(sbBtn).removeClass("on");
    //     $(this).addClass("on");
    //     if (sbCurr === sbShow) return;
    //     var direction = sbShow > sbCurr ? "100%" : "-100%";
    //     $(sbImg[sbShow]).css("left", direction).stop().animate({"left": "0%"}, 500);
    //     $(sbImg[sbCurr]).stop().animate({"left": (direction === "100%" ? "-100%" : "100%")}, 500);
    //     sbCurr = sbShow;
    // });
    

    // 국민건강보험 홍보 ============================================================================

    var npPrevBtn = $(".n_pr_ctrl .prevBtn");
    var npStopBtn = $(".n_pr_ctrl .stopBtn");
    var npNextBtn = $(".n_pr_ctrl .nextBtn");
    var npTxt = $(".n_pr_ctrl .currNum");
    var npImg = $(".n_pr_img ul li");
    var npNum = 0;

    $(npNextBtn).click(function () {

        $(npImg[npNum]).stop().animate({"left":"-100%"}, 500); // 우선 커렌트 이미지 왼쪽으로 뺴고

        npNum = (npNum+1) % npImg.length; // 커렌트에 +1값 붙여서 다음 인덱스가 올 준비. (%가 들어간 이유는 4가 될 때 커렌트값이 0이됨.)
        $(npImg[npNum]).css("left", "100%").stop().animate({"left":"0%"}, 500); // 앞에 올 사진을 오른쪽에 붙이고 보여줌.
    
        $(npTxt).text(npNum+1); // 콘크롤박스에 현재 사진 기입.

    });

    $(npPrevBtn).click(function () {

        $(npImg[npNum]).stop().animate({"left":"100%"}, 500);

        npNum = (npNum - 1 + npImg.length) % npImg.length; // -1이 될 때 3이 나오는 계산식이 성립하면 됨. (인덱스번호는 0,1,2,3이니까.)
        $(npImg[npNum]).css("left", "-100%").stop().animate({"left":"0%"}, 500);
    
        $(npTxt).text(npNum+1);

    });

    function npAuto () {
        $(npNextBtn).trigger("click");
    }

    var npSlideStop = setInterval(npAuto,5000);

    $(npStopBtn).click(function () {
        if ($(npStopBtn).hasClass("on")) {
            npSlideStop = setInterval(npAuto,5000);
            $(npStopBtn).removeClass("on");
        } else {
            clearInterval(npSlideStop);
            $(npStopBtn).addClass("on");
        }
    });



    // 서브웨이 사이드 ============================================================================

    // var ssImg = $(".s_side_img li");
    // var ssBtn = $(".s_side_ctrl li");
    // var ssCurr = 0;

    // $(ssBtn).click(function () {
    //     var ssDir = ssCurr > $(ssBtn).index(this) ? "100%" : "-100%";
    //     $(ssImg[ssCurr]).stop().animate({"left":ssDir},1000);
    //     ssCurr = $(ssBtn).index(this);
    //     // $(ssImg[ssCurr]).css("left",-ssDir).stop().animate({"left":"0%"},1000);
    //     // 이걸 써봤는데 도저히 안되는 이유가 -ssDir때문이었음. -(-100%)면 당연히 100%일줄 알았는데 프로그래밍에는 그런 논리가 안먹힘.
    //     // 아래와 같이 parseInt로 100만 추출 한 뒤, -1을 곱해주고 스트링"%"를 써주면 된다.
    //     $(ssImg[ssCurr]).css("left", parseInt(ssDir)*-1+"%").stop().animate({"left":"0%"},1000);
    //     $(ssBtn).removeClass("on");
    //     $(this).addClass("on");
    // });

    //     이런저런 시도를 했고 결국 성공했으니 레퍼런스 없이 다시 해보자.

    var ssBtn = $(".s_side_ctrl li");
    var ssImg = $(".s_side_img li");
    var ssCurr = 0;

    ssBtn.click(function () {
        var ssDir = ssCurr > $(ssBtn).index(this) ? "100%" : "-100%";
        ssImg.eq(ssCurr).stop().animate({"left":ssDir},1000); // 대괄호로 인덱스번호를 지정해주는 경우가 아니면 변수로 선언된 쿼리는 호출할 때 &() 안써도 된다.
        ssCurr = $(ssBtn).index(this);
        $(ssImg[ssCurr]).css("left",(parseInt(ssDir))*-1+"%").stop().animate({"left":"0%"},1000);
        ssBtn.removeClass("on"); // 위에처럼 대괄호로 인덱스번호 지정할땐 변수에 &() 써야함.
        $(this).addClass("on");
    });

    function ssAuto () {
        if (ssCurr == ssImg.length-1) {
            ssBtn.eq(0).trigger("click");
        } else {
            ssBtn.eq(ssCurr+1).trigger("click");
        }
    }

    var ssStop = setInterval(ssAuto,5000);

    $(".s_side_img").click(function () {
        if ($(".s_side_img").hasClass("on")) {
            ssStop = setInterval(ssAuto,5000);
            $(".s_side_img").removeClass("on")
        } else {
            clearInterval(ssStop);
            $(".s_side_img").addClass("on");
        }
    });



    // 국민건강보험 배너 ============================================================================

    var nbImg = $(".n_ban_img > li");
    var nbPrevBtn = $(".n_ban_ctrl .prevBtn");
    var nbStopBtn = $(".n_ban_ctrl .stopBtn");
    var nbNextBtn = $(".n_ban_ctrl .nextBtn");
    var nbMoreBtn = $(".n_ban_ctrl .moreBtn");
    var nbTxt = $(".n_ban_ctrl .currNum");
    var nbNum = 0;

    nbNextBtn.click(function () {
        nbImg.eq(nbNum).stop().animate({"left":"-100%"},500);
        nbNum = (nbNum + 1) % nbImg.length;
        nbImg.eq(nbNum).css("left","100%").stop().animate({"left":"0"},500);
        nbTxt.text(nbNum+1);
    });

    nbPrevBtn.click(function () {
        nbImg.eq(nbNum).stop().animate({"left":"100%"},500);
        nbNum = (nbNum + nbImg.length - 1) % nbImg.length;
        nbImg.eq(nbNum).css("left","-100%").stop().animate({"left":"0"},500);
        nbTxt.text(nbNum+1);
    });

    function nbAuto () {
        nbNextBtn.trigger("click");
    }

    var nbSlideStop = setInterval(nbAuto, 5000);

    nbStopBtn.click(function () {
        if (nbStopBtn.hasClass("on")) {
            nbSlideStop = setTimeout(nbAuto, 5000);
            nbStopBtn.removeClass("on");
        } else {
            clearInterval(nbSlideStop);
            nbStopBtn.addClass("on");
        }
    });

});