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

KindEditor.plugin('clearhtml', function(K) {
	var self = this, name = 'clearhtml';
	self.clickToolbar(name, function() {
		self.focus();
		var html = self.html();
		html = html.replace(/(<script[^>]*>)([\s\S]*?)(<\/script>)/ig, '');
		html = html.replace(/(<style[^>]*>)([\s\S]*?)(<\/style>)/ig, '');
		html = K.formatHtml(html, {
			a : ['href', 'target'],
			embed : ['src', 'width', 'height', 'type', 'loop', 'autostart', 'quality', '.width', '.height', 'align', 'allowscriptaccess'],
			img : ['src', 'width', 'height', 'border', 'alt', 'title', '.width', '.height'],
			table : ['border'],
			'td,th' : ['rowspan', 'colspan'],
			'div,hr,br,tbody,tr,p,ol,ul,li,blockquote,h1,h2,h3,h4,h5,h6' : []
		});
		self.html(html);
		self.cmd.selection(true);
		self.addBookmark();
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

KindEditor.plugin('clearhtml', function (K) {
    var self = this, name = 'clearhtml';
    self.clickToolbar(name, function () {
        self.focus();
        var html = self.html();
        html = html.replace(/(<script[^>]*>)([\s\S]*?)(<\/script>)/ig, '');
        html = html.replace(/(<style[^>]*>)([\s\S]*?)(<\/style>)/ig, '');
        html = K.formatHtml(html, {
            a: ['href', 'target'],
            embed: ['src', 'width', 'height', 'type', 'loop', 'autostart', 'quality', '.width', '.height', 'align', 'allowscriptaccess'],
            img: ['src', 'width', 'height', 'border', 'alt', 'title', '.width', '.height'],
            table: ['border'],
            'td,th': ['rowspan', 'colspan'],
            'div,hr,br,tbody,tr,p,ol,ul,li,blockquote,h1,h2,h3,h4,h5,h6': []
        });
        self.html(html);
        self.cmd.selection(true);
        self.addBookmark();
    });
>>>>>>> 6f52d5ba06d475efef117561f74d26b3f4345452
=======
>>>>>>> 5015bc2c1aab6efba5f481d960db7d224786927d
});
