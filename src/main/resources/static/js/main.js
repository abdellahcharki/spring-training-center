$(()=>{
  
  
  $(".main-slider").slick({
    autoplay:true,
    dots:false,
    arrows: false,
    infinite:true
  })
 

  $(".dedede").slick({
    slidesToShow: 3,
    slidesToScroll: 3,
   autoplay:true
  })


  // galary

 
  
$('.fotorama').fotorama({
  height:600,
  width: '100%',
  allowfullscreen: true,
  nav: 'thumbs',
  autoplay:true,
  keyboard:true
});


  var map = L.map('map').setView([34.036638, -5.001500], 13);

	var tiles = L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
		maxZoom: 30,
		attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
	}).addTo(map);

	var marker = L.marker([34.036638, -5.001500]).addTo(map);

30 


}); // ende

