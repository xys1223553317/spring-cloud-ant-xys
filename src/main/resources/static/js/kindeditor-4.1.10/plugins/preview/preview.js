/*******************************************************************************
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5015bc2c1aab6efba5f481d960db7d224786927d
* KindEditor - WYSIWYG HTML Editor for Internet
* Copyright (C) 2006-2011 kindsoft.net
*
* @author Roddy <luolonghao@gmail.com>
* @site http://www.kindsoft.net/
* @licence http://www.kindsoft.net/license.php
*******************************************************************************/

KindEditor.plugin('preview', function(K) {
	var self = this, name = 'preview', undefined;
	self.clickToolbar(name, function() {
		var lang = self.lang(name + '.'),
			html = '<div style="padding:10px 20px;">' +
				'<iframe class="ke-textarea" frameborder="0" style="width:708px;height:400px;"></iframe>' +
				'</div>',
			dialog = self.createDialog({
				name : name,
				width : 750,
				title : self.lang(name),
				body : html
			}),
			iframe = K('iframe', dialog.div),
			doc = K.iframeDoc(iframe);
		doc.open();
		doc.write(self.fullHtml());
		doc.close();
		K(doc.body).css('background-color', '#FFF');
		iframe[0].contentWindow.focus();
	});
<<<<<<< HEAD
=======
 * KindEditor - WYSIWYG HTML Editor for Internet
 * Copyright (C) 2006-2011 kindsoft.net
 *
 * @author Roddy <luolonghao@gmail.com>
 * @site http://www.kindsoft.net/
 * @licence http://www.kindsoft.net/license.php
 *******************************************************************************/

KindEditor.plugin('preview', function (K) {
    var self = this, name = 'preview', undefined;
    self.clickToolbar(name, function () {
        var lang = self.lang(name + '.'),
            html = '<div style="padding:10px 20px;">' +
                '<iframe class="ke-textarea" frameborder="0" style="width:708px;height:400px;"></iframe>' +
                '</div>',
            dialog = self.createDialog({
                name: name,
                width: 750,
                title: self.lang(name),
                body: html
            }),
            iframe = K('iframe', dialog.div),
            doc = K.iframeDoc(iframe);
        doc.open();
        doc.write(self.fullHtml());
        doc.close();
        K(doc.body).css('background-color', '#FFF');
        iframe[0].contentWindow.focus();
    });
>>>>>>> 6f52d5ba06d475efef117561f74d26b3f4345452
=======
>>>>>>> 5015bc2c1aab6efba5f481d960db7d224786927d
});
