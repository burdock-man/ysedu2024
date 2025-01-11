$(function(){

    // 서브웨이 배너 ============================================================================

    $(".s_ban").bxSlider({
        auto:true,
        pager:true,
        controls:false,
    });

    // var sbBtn = $(".s_ban_ctrl li");
    // var sbImg = $(".s_ban_img li");
    // var sbCurr = 0;

    // $(sbBtn).click(function () {
    //     var sbDir = sbCurr > $(sbBtn).index(this) ? "100%" : "-100%";
    //     sbImg.eq(sbCurr).stop().animate({"left":sbDir},1000);
    //     sbCurr = $(sbBtn).index(this);
    //     sbImg.eq(sbCurr).css("left",(parseInt(sbDir))*-1+"%").stop().animate({"left":"0%"},1000);
    //     $(sbBtn).removeClass("on");
    //     $(this).addClass("on");
    // });

    // function sbAuto(){
    //     if(sbCurr == $(sbBtn).length-1) {
    //         $(sbBtn).eq(0).trigger("click");
    //     } else {
    //         $(sbBtn).eq(sbCurr+1).trigger("click");
    //     }
    // }

    // var sbSlideStop = setInterval(sbAuto,5000);

    // $(".s_ban_img").click(function(){
    //     if ($(".s_ban_img").hasClass("on")) {
    //         sbSlideStop = setInterval(sbAuto,5000);
    //         $(".s_ban_img").removeClass("on");
    //     } else {
    //         clearInterval(sbSlideStop);
    //         $(".s_ban_img").addClass("on");
    //     }
    // });


    // 국민건강보험 홍보 ============================================================================

    var npPrevBtn = $(".n_pr_ctrl .prevBtn");
    var npStopBtn = $(".n_pr_ctrl .stopBtn");
    var npNextBtn = $(".n_pr_ctrl .nextBtn");
    var npTxt = $(".n_pr_ctrl .currNum");
    var npImg = $(".n_pr_img ul li");
    var npNum = 0;

    $(npNextBtn).click(function () {
        $(npImg[npNum]).stop().animate({"left":"-100%"}, 500);
        npNum = (npNum+1) % npImg.length;
        $(npImg[npNum]).css("left", "100%").stop().animate({"left":"0%"}, 500);
        $(npTxt).text(npNum+1);
    });

    $(npPrevBtn).click(function () {
        $(npImg[npNum]).stop().animate({"left":"100%"}, 500);
        npNum = (npNum - 1 + npImg.length) % npImg.length;
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

    var ssBtn = $(".s_side_ctrl li");
    var ssImg = $(".s_side_img li");
    var ssCurr = 0;

    ssBtn.click(function () {
        var ssDir = ssCurr > $(ssBtn).index(this) ? "100%" : "-100%";
        ssImg.eq(ssCurr).stop().animate({"left":ssDir},1000);
        ssCurr = $(ssBtn).index(this);
        $(ssImg[ssCurr]).css("left",(parseInt(ssDir))*-1+"%").stop().animate({"left":"0%"},1000);
        ssBtn.removeClass("on");
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