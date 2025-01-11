$(function() {

    var a = $(".s2").offset().top;
    var b= $(window).height();  //브라우저의 높이
    //console.log(a,b);
    $(window).scroll(function(){
        var sct = $(window).scrollTop();
        var offset2 = (sct - $(".s2").offset().top);
        var offset3 = (sct - $(".s3").offset().top);
        var offset4 = (sct - $(".s4").offset().top);
        var offset5 = (sct - $(".s5").offset().top);
        var offset6 = (sct - $(".s6").offset().top);
        console.log(offset2,offset3,offset4,offset5,offset6);

        if(sct > $(".s2").offset().top -  $(window).height()){
            $(".s2 .sec_img").css({'transform':`translate(${offset2}px, 0px)`});
        };
        if(sct > $(".s3").offset().top -  $(window).height()){
            $(".s3 .sec_img").css({'transform':`translate(${offset3}px, 0px)`});
        };
        if(sct > $(".s4").offset().top -  $(window).height()){
            $(".s4 .sec_img").css({'transform':`translateY(${offset4-150}px)`});
        };
        if(sct > $(".s5").offset().top -  $(window).height()){
            $(".s5 .sec_img").css({'transform':`translate(0px, ${offset5*1.3}px)`});
        };
        if(sct > $(".s6").offset().top -  $(window).height()){
            $(".s6 .sec_img").css({'transform':`translate(${offset6}px, 0px)`});
        };

    });


});
