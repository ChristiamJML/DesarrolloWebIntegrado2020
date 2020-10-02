var $ = jQuery.noConflict();

var _animate = true;

$(document).ready(function($) {
	/* ---------------------------------------------------------------------- */
	/*	Slider - [Flexslider]
	/* ---------------------------------------------------------------------- */
  	try {
		$('.flexslider').flexslider({
			animation: "fade"
		});

		$('.flexslider .flex-caption > h1 > a').append('<span class="arrow transition-all"></span>');
	} catch(err) {

	}

	/* ---------------------------------------------------------------------- */
	/* =  Dropdown Menu - Superfish
	/* ---------------------------------------------------------------------- */
	try {
		$('ul.sf-menu').superfish({
			delay: 400,
			autoArrows: false,
			speed: 'fast',
			animation: {opacity:'show', height:'show'}
		});
	} catch (err){

	}

	//Center
	/**/$('.sf-menu.center > li > a').on('mouseenter', function(){
		$left = ($(this).width()/2) - ($(this).parent('li').find(' > ul.sub-menu').width()/2);
		$(this).parent('li').find(' > ul.sub-menu').css({'left' : $left});
	});

	/* ---------------------------------------------------------------------- */
	/*	Portfolio
	/* ---------------------------------------------------------------------- */
	try {
		$("a.fancy-image").fancybox({
			nextEffect	: 'elastic',
			prevEffect	: 'elastic',
			openEffect	: 'fade',
	    	closeEffect	: 'fade',
	          helpers: {
	              title : {
	                  type : 'float'
	              }
	          }
		});

		$('a.fancy-video').fancybox({
			maxWidth	: 800,
			maxHeight	: 600,
			fitToView	: false,
			width		: '75%',
			height		: '75%',
			type 		: 'iframe',
			autoSize	: false,
			closeClick	: false,
			openEffect	: 'fade',
			closeEffect	: 'fade'
		});
	} catch(err) {

	}

	/* ---------------------------------------------------------------------- */
	/*	Page animation
	/* ---------------------------------------------------------------------- */
	$('#main-menu a:not(.external), a.has-page').on('click', function(e){
		e.preventDefault();

		if(_animate == true || $('#content section[data-page="'+ $(this).attr('href') +'"]').hasClass('open_page')) { return; }

		_animate = true;

		$('#main-menu a').removeClass('active');
		$(this).addClass('active');

		$curr_page = $('#content section.open_page[data-page]').attr('data-page');
		$next_page = $(this).attr('href');

		$('#content section[data-page]').removeClass('open_page');
		$('#content section[data-page="'+ $next_page +'"]').addClass('open_page');

		$next_height = $('section[data-page="'+ $next_page +'"]').outerHeight();

		$('#content section[data-page="'+ $curr_page +'"]').animate({'top': $next_height}, {duration: 500, easing: 'easeInCubic', complete: function(){
			$(this).hide();

			$('.progress span').css({'width': '0px'}); //Reset skills

			$('#content').delay(10).animate({'height': $next_height}, 300, function(){
				$('#content section[data-page="'+ $next_page +'"]').css({'top': $next_height});
				$('#content section[data-page="'+ $next_page +'"]').show().delay(250).animate({'top': 0}, {duration: 500, easing: 'easeOutCubic', complete: function(){
					_animate = false;
					my_skills(); //Animate skills
					$('html, body').animate({scrollTop: 0}, 'slow');
				}});
			});
		}});
	});

	/* ---------------------------------------------------------------------- */
	/*	Portfolio
	/* ---------------------------------------------------------------------- */
	$('.portfolio-filter li a').on('click', function(e){
		e.preventDefault();

		if($(this).hasClass('active')){ return false; }

		$filter = $(this).attr('data-filter');

		$('.portfolio-filter li a').removeClass('active');
		$(this).addClass('active');

		$('.portfolio-item').hide();

		if($filter == '*'){
			$('.portfolio-item').fadeIn(500, function(){
				resize();
			});
		} else {
			$('.portfolio-item[data-filter*="'+ $filter +'"]').fadeIn(500, function(){
				resize();
			});
		}
	});

	$('.portfolio-item a img').each(function(){
		$(this).after('<b class="l_1"></b><b class="l_2"></b><b class="l_3"></b><b class="l_4"></b><i class="icon"></i>');
	});

	//Photo ID - zoom icon
	$('.photo-id a').append('<i class="icon"></i>');

	//Placeholder
	$('input, textarea').placeholder();

	/* ---------------------------------------------------------------------- */
	/*	Google Maps
	/* ---------------------------------------------------------------------- */
	try {
		var map_address = 'Al Masjid Al Haram Road, Makkah, Makkah Province, Saudi Arabia';

		$('#map').gMap({
			address: map_address,
			zoom: 16,
			markers: [
				{ 'address' : map_address }
			]
		});
	} catch(err) {

	}

	/* ---------------------------------------------------------------------- */
	/*	Contact Form
	/* ---------------------------------------------------------------------- */
	$('.form.contact .submit').on('click', function(e){
		e.preventDefault();
		
		$this = $(this);
		
		$.ajax({
			type: "POST",
			url: "contact.php",
			dataType: 'json',
			cache: false,
			data: $('.form.contact').serialize(),
			success: function(data) {
				if(data.info != 'error'){
					$this.parents('form').find('input[type=text],textarea,select').filter(':visible').val('');
					$('.message').hide().removeClass('success').removeClass('error').addClass('success').html(data.msg).fadeIn('slow').delay(5000).fadeOut('slow');
				} else {
					$('.message').hide().removeClass('success').removeClass('error').addClass('error').html(data.msg).fadeIn('slow').delay(5000).fadeOut('slow');
				}
			}
		});
	});

	/* ---------------------------------------------------------------------- */
	/*	Contact Form
	/* ---------------------------------------------------------------------- */
	$(window).bind('resize', function(){		
		resize();
	});
});

/* ---------------------------------------------------------------------- */
/*	Loading & First animation
/* ---------------------------------------------------------------------- */
$(window).load(function(){
	$('body').imagesLoaded(function(){
		$('#content section[data-page]').each(function(){
			$(this).css({'height': $(this).outerHeight()});
		});

		$('#content section.open_page').css({'top': $('#content section.open_page').outerHeight()});

		$('#loading').fadeOut(500, function(){
			$('#content').animate({'height': $('#content section.open_page').outerHeight()}, {duration: 500, easing: 'easeInCubic', complete: function(){
				$('#content section.open_page').delay(200).animate({'top': '0'}, {duration: 500, easing: 'easeOutCubic', complete: function(){
					$('a[href="'+ $('section.open_page').attr('data-page') +'"]').addClass('active');
					$('#logo').addClass('animation');

					_animate = false;
					my_skills();
				}});
			}});
		});
	});
});

/* ---------------------------------------------------------------------- */
/*	My Skills
/* ---------------------------------------------------------------------- */
function my_skills(){
	$('.progress span').each(function(){
		$(this).animate({'width': $(this).attr('data-value') + '%'}, {duration: 700, easing: 'easeOutCubic'});
	});
}

function resize(){
	$('section[data-page]').css({'height': 'auto'}).each(function(){
		if($(this).hasClass('open_page')){
			$(this).stop().animate({'height': $(this).outerHeight()}, {duration: 500, easing: 'easeOutCubic', complete: function(){
				$('#content').stop().animate({'height': $('#content section.open_page').outerHeight()}, {duration: 500, easing: 'easeInCubic'});
			}});
		} else {
			$(this).css({'height': $(this).outerHeight()});
		}
	});	
}