$(function(){
    var visual = $("#brandVisual>ul>li"); // 큰사진
    var button1 = $("#buttonList>li"); // pager 버튼
    var current = 0; // 현재

    button1.click(function(){
        var i = $(this).index(); // ★★★★★ 이놈이 기가막히게 중요한거였음
        // alert(i);
        button1.removeClass("on");
        button1.eq(i).addClass("on");
        // visual.
        move(i); // 함수의 매개변수로 넣어주면, 지역변수도 다른곳으로 갈수는 있다고 함 ㅇㅇ
    });

    function move(i) { // 이렇게 ㅇㅇ
        if(current == i) return; // 현재 활성화된 button과 클릭한 버튼이 같으면 빠져 나간다.
        var cu = visual.eq(current); // 얘는 0이고 (eq(0)번째)
        var ne = visual.eq(i); // 얘는 1일 때 (eq(1)번째) 인거임!
        cu.css("left","0").stop().animate({"left": "-100%"},500); //그래서 cu를 0에서 100만큼 옮기고
        ne.css("left","100%").stop().animate({"left": "0"},500); // ne를 100에서 0만큼 옮기면 슬라이드가 되고
        current = i; // 커렌트랑 i를 같게하면 다른 버튼을 눌렀을때 얘는 왼쪽으로 갈거고 i는 그 값을 받는거임!!!
    }

    function timer(){
        id = setInterval(function(){
            var n = current+1;
            if(n == 3) {
                n = 0;
            }
            button1.eq(n).trigger("click");
            // 버튼1을 컴퓨터에게 3초마다 n에 값에 따라 클릭을 강제로 시킴.
            // trigger("이벤트") == 노예한테 이벤트를 시키는거.
        },3000);
    }

    timer();

});