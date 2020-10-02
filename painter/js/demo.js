$(document).ready(function($) {
	$('#style-switcher > h2 > a').on('click', function(e){
		e.preventDefault();

		if($('#style-switcher').hasClass('open')){
			$('#style-switcher').removeClass('open');
		} else {
			$('#style-switcher').addClass('open');
		}
	});

	$("#skin-style").change(function(e){
		if( $(this).val() != 'dark'){
			$('body').removeClass('dark');         
		} else{
			 $('body').addClass('dark');      
		}
	});

	$('#colors a').on('click', function(e){
        $('style[id^="less:"]').remove();
        $('link#skins').attr({ 'href' : $(this).attr('data-value') });
    	less.refresh();
    });

	$('#bg a').on('click', function(e){
		e.preventDefault();
		$('body').removeClass('bg1').removeClass('bg2').removeClass('bg3').removeClass('bg4').removeClass('bg5').removeClass('bg6').removeClass('bg7').removeClass('bg8').removeClass('bg9').removeClass('bg10').removeClass('bg11').removeClass('bg12');
		if($(this).attr('data-value') != 'pattern'){
			$('body').removeClass('no-image').addClass('pattern').addClass($(this).attr('data-value'));
		} else {
			$('body').removeClass('pattern').addClass('no-image');
		}
	});

	$('#reset a').on('click', function(){
		$('style[id^="less:"]').remove();
        $('link#skins').attr({ 'href' : 'css/skins/teal.less' });
    	less.refresh();

    	$('#skin-style').val('light');

		$('body').removeClass('dark').removeClass('bg1').removeClass('bg2').removeClass('bg3').removeClass('bg4').removeClass('bg5').removeClass('bg6').removeClass('bg7').removeClass('bg8').removeClass('bg9').removeClass('bg10').removeClass('bg11').removeClass('bg12').removeClass('no-image').addClass('pattern');
	});
});