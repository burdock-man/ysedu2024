document.addEventListener("DOMContentLoaded", function() {

    var container = document.getElementById('map');
    var options = {
        center: new kakao.maps.LatLng(37.293579, 127.0122317),
        level: 4
    };
    var map = new kakao.maps.Map(container, options);

});