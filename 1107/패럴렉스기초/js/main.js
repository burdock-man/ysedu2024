$(function() {

    var top1 = $("#item1").offset().top;

    var left1 = $("#item1").offset().left;
    var left2 = $("#item2").offset().left;
    var left3 = $("#item3").offset().left;
    var left4 = $("#item4").offset().left;
    var left5 = $("#item5").offset().left;

    console.log(left1, left2, left3, left4, left5);

    // for (var i = 0; i < $("ul li").length; i++) {

    // }

    $(window).scroll(function() {
        var sct = $(this).scrollTop();
        $("#value").text(Math.floor(sct));

        $("#item1").css({"top" : top1 + sct / 4});
        $("#item2").css({"top" : top1 + sct / 5,
            "left" : left2 + sct / 20
        });
        $("#item3").css({"top" : top1 + sct / 6});
        $("#item4").css({"top" : top1 + sct / 7,
            "left" : left4 + sct / -50
        });
        $("#item5").css({"top" : top1 + sct / 8});
    })

});