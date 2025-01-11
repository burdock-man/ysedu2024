$(function(){
    $(".nav>ul").mouseenter(function(){
        $(this).addClass("over");
    });
    $(".nav>ul").mouseleave(function(){
        $(this).removeClass("over");
    });

    $(".mobile_tab").click(function(){
        $(".mobile_nav").addClass("active");
        $(".transparency").addClass("active");
        return false
    });
    $(".close").click(function(){
        $(".mobile_nav").removeClass("active");
        $(".transparency").removeClass("active");
        return false
    });
});