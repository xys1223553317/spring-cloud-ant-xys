<<<<<<< HEAD
if ($.fn.pagination){
=======
if ($.fn.pagination) {
>>>>>>> 6f52d5ba06d475efef117561f74d26b3f4345452
    $.fn.pagination.defaults.beforePageText = 'Sayfa';
    $.fn.pagination.defaults.afterPageText = ' / {pages}';
    $.fn.pagination.defaults.displayMsg = '{from} ile {to} arası gösteriliyor, toplam {total} kayıt';
}
<<<<<<< HEAD
if ($.fn.datagrid){
    $.fn.panel.defaults.loadingMessage = "Yükleniyor...";
}

if ($.fn.datagrid){
    $.fn.datagrid.defaults.loadingMessage = "Yükleniyor...";
    $.fn.datagrid.defaults.loadMsg = 'İşleminiz Yapılıyor, lütfen bekleyin ...';
}
if ($.fn.treegrid && $.fn.datagrid){
    $.fn.treegrid.defaults.loadMsg = $.fn.datagrid.defaults.loadMsg;
}
if ($.messager){
    $.messager.defaults.ok = 'Tamam';
    $.messager.defaults.cancel = 'İptal';
}
$.map(['validatebox','textbox','passwordbox','filebox','searchbox',
        'combo','combobox','combogrid','combotree',
        'datebox','datetimebox','numberbox',
        'spinner','numberspinner','timespinner','datetimespinner'], function(plugin){
    if ($.fn[plugin]){
        $.fn[plugin].defaults.missingMessage = 'Bu alan zorunludur.';
    }
});
if ($.fn.validatebox){
=======
if ($.fn.datagrid) {
    $.fn.panel.defaults.loadingMessage = "Yükleniyor...";
}

if ($.fn.datagrid) {
    $.fn.datagrid.defaults.loadingMessage = "Yükleniyor...";
    $.fn.datagrid.defaults.loadMsg = 'İşleminiz Yapılıyor, lütfen bekleyin ...';
}
if ($.fn.treegrid && $.fn.datagrid) {
    $.fn.treegrid.defaults.loadMsg = $.fn.datagrid.defaults.loadMsg;
}
if ($.messager) {
    $.messager.defaults.ok = 'Tamam';
    $.messager.defaults.cancel = 'İptal';
}
$.map(['validatebox', 'textbox', 'passwordbox', 'filebox', 'searchbox',
    'combo', 'combobox', 'combogrid', 'combotree',
    'datebox', 'datetimebox', 'numberbox',
    'spinner', 'numberspinner', 'timespinner', 'datetimespinner'], function (plugin) {
    if ($.fn[plugin]) {
        $.fn[plugin].defaults.missingMessage = 'Bu alan zorunludur.';
    }
});
if ($.fn.validatebox) {
>>>>>>> 6f52d5ba06d475efef117561f74d26b3f4345452
    $.fn.validatebox.defaults.rules.email.message = 'Lütfen geçerli bir email adresi giriniz.';
    $.fn.validatebox.defaults.rules.url.message = 'Lütfen geçerli bir URL giriniz.';
    $.fn.validatebox.defaults.rules.length.message = 'Lütfen {0} ile {1} arasında bir değer giriniz.';
    $.fn.validatebox.defaults.rules.remote.message = 'Lütfen bu alanı düzeltiniz.';
}
<<<<<<< HEAD
if ($.fn.calendar){
    $.fn.calendar.defaults.weeks = ['Pz','Pt','Sa','Ça','Pe','Cu','Ct'];
    $.fn.calendar.defaults.months = ['Oca', 'Şub', 'Mar', 'Nis', 'May', 'Haz', 'Tem', 'Ağu', 'Eyl', 'Eki', 'Kas', 'Ara'];
}
if ($.fn.datebox){
=======
if ($.fn.calendar) {
    $.fn.calendar.defaults.weeks = ['Pz', 'Pt', 'Sa', 'Ça', 'Pe', 'Cu', 'Ct'];
    $.fn.calendar.defaults.months = ['Oca', 'Şub', 'Mar', 'Nis', 'May', 'Haz', 'Tem', 'Ağu', 'Eyl', 'Eki', 'Kas', 'Ara'];
}
if ($.fn.datebox) {
>>>>>>> 6f52d5ba06d475efef117561f74d26b3f4345452
    $.fn.datebox.defaults.currentText = 'Bugün';
    $.fn.datebox.defaults.closeText = 'Kapat';
    $.fn.datebox.defaults.okText = 'Tamam';
}
<<<<<<< HEAD
if ($.fn.datetimebox && $.fn.datebox){
    $.extend($.fn.datetimebox.defaults,{
=======
if ($.fn.datetimebox && $.fn.datebox) {
    $.extend($.fn.datetimebox.defaults, {
>>>>>>> 6f52d5ba06d475efef117561f74d26b3f4345452
        currentText: $.fn.datebox.defaults.currentText,
        closeText: $.fn.datebox.defaults.closeText,
        okText: $.fn.datebox.defaults.okText
    });
<<<<<<< HEAD
    
    $.fn.datebox.defaults.formatter=function(date){
        var y=date.getFullYear();
        var m=date.getMonth()+1;
        var d=date.getDate();
        if(m<10){m="0"+m;}
        if(d<10){d="0"+d;}
        return d+"."+m+"."+y;
=======

    $.fn.datebox.defaults.formatter = function (date) {
        var y = date.getFullYear();
        var m = date.getMonth() + 1;
        var d = date.getDate();
        if (m < 10) {
            m = "0" + m;
        }
        if (d < 10) {
            d = "0" + d;
        }
        return d + "." + m + "." + y;
>>>>>>> 6f52d5ba06d475efef117561f74d26b3f4345452
    };
}
