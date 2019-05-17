/**
 * 弹窗
 */
function layer_show(title,url,w,h,callback){
	if (title == null || title == '') {
		title=false;
	};
	if (url == null || url == '') {
		layer.msg('页面不存在',{icon: 5,time:3000});
		return false;
	};
	if (w == null || w == '') {
		w=800;
	};
	if (h == null || h == '') {
		h=($(window).height() - 50);
	};
	layer.open({
		type: 2,
		area: [w+'px', h+'px'],
		fix: false, //不固定
		maxmin: true,
		shade:0.4,
		title: title,
		content: [url],
		success:function(layero,index){
        },
		end:function () {
			(callback && typeof(callback) === "function") && callback();
		}
	});
}

//loading对象
var loading;

/**
 * 显示loading
 */
function showLoading(){
	loading = layer.open({
	    type: 3,
	    // content: '加载中...',
	    icon: 1,
	    shade: [0.6, '#000'], //透明度和背景颜色
	});
}

/**
 * 隐藏loading
 */
function hideLoading(){
	layer.close(loading);
}

/**
 * 显示提示框
 * @param {String} content 提示框内容
 * @param {Number} icon 提示框样式，0:提示/1:成功/2:错误/3:疑问/4:锁/5:哭脸/6:笑脸
 * @param {String} title 提示框标题
 * @param {Function} callback 回调函数
 */
function showTips(content, icon, title, callback){
	layer.alert(content, {title: title, skin: 'layui-layer-molv', closeBtn: 0, shade: [0.6, '#000'], icon: icon}, function(index){
		(callback && typeof(callback) === "function") && callback();
		layer.close(index);
	});
}

/**
 * 显示错误提示框
 * @param {String} content 提示框内容
 * @param {String} title 提示框标题
 * @param {Function} callback 回调函数
 */
function showErrorTips(content, title, callback){
	showTips(content, 2, title, callback);
}

/**
 * 显示成功提示框
 * @param {String} content 提示框内容
 * @param {String} title 提示框标题
 * @param {Function} callback 回调函数
 */
function showSuccessTips(content, title, callback){
	showTips(content, 1, title, callback);
}

/**
 * 显示消息框
 * @param {String} content 消息框内容
 * @param {Number} time 关闭时间，单位毫秒，默认为0不关闭
 * @param {Function} callback 回调函数
 */
function showMessage(content, time, callback){
	layer.msg(content, {shade: [0.1, '#fff']}, function(index){
		(callback && typeof(callback) === "function") && callback();
		layer.close(index);
	});
}

/**
 * 确认框
 * @param {String} content 确认内容
 * @param {Object} callback 确认后回调的函数
 */
function showConfirm(content, callback){
	layer.confirm(content, {title: '确认信息', skin: 'layui-layer-molv', closeBtn: 0, shade: [0.6, '#000']}, function(index){
		(callback && typeof(callback) === "function") && callback();
		layer.close(index);
	});
}

/**
 * 获取form表单所有数据
 * @param {String} formid 表单id
 */
function getFormJson(formid) {
	var o = {};
	var a = $(formid).serializeArray();
	$.each(a, function() {
		if(o[this.name] !== undefined) {
			if(!o[this.name].push) {
				o[this.name] = [o[this.name]];
			}
			o[this.name].push(this.value || '');
		} else {
			o[this.name] = this.value || '';
		}
	});
	return o;
}

/**
 * 获取url中的参数
 * @param {String} name 参数名
 */
function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}

/**
 * 获取checkbox选中的值
 * @param {String} name checkbox表单name值
 * @return {Array} 返回value数组，如果长度为0表示未选中
 */
function get_ckbox_val(name){ 
	var chk_value = [];
	$('input[name="' + name + '"]:checked').each(function() {
		chk_value.push($(this).val());
	});
	return chk_value;
}

