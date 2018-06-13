function getTimeNow() {
	var date = new Date();
	var year = date.getFullYear();
	var month = date.getMonth() + 1;
	var day = date.getDate();
	var time = date.toTimeString().substring(8, 0);
	var week = '星期' + '日一二三四五六'.charAt(new Date().getDay());
	document.getElementById("getTimeNow").innerHTML = year + "年" + month + "月"
			+ day + "日 " + time + " " + week;
}
setInterval(function() {
	getTimeNow()
}, 1000);