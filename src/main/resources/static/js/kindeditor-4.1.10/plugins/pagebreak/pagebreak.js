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

KindEditor.plugin('pagebreak', function(K) {
	var self = this;
	var name = 'pagebreak';
	var pagebreakHtml = K.undef(self.pagebreakHtml, '<hr style="page-break-after: always;" class="ke-pagebreak" />');

	self.clickToolbar(name, function() {
		var cmd = self.cmd, range = cmd.range;
		self.focus();
		var tail = self.newlineTag == 'br' || K.WEBKIT ? '' : '<span id="__kindeditor_tail_tag__"></span>';
		self.insertHtml(pagebreakHtml + tail);
		if (tail !== '') {
			var p = K('#__kindeditor_tail_tag__', self.edit.doc);
			range.selectNodeContents(p[0]);
			p.removeAttr('id');
			cmd.select();
		}
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

KindEditor.plugin('pagebreak', function (K) {
    var self = this;
    var name = 'pagebreak';
    var pagebreakHtml = K.undef(self.pagebreakHtml, '<hr style="page-break-after: always;" class="ke-pagebreak" />');

    self.clickToolbar(name, function () {
        var cmd = self.cmd, range = cmd.range;
        self.focus();
        var tail = self.newlineTag == 'br' || K.WEBKIT ? '' : '<span id="__kindeditor_tail_tag__"></span>';
        self.insertHtml(pagebreakHtml + tail);
        if (tail !== '') {
            var p = K('#__kindeditor_tail_tag__', self.edit.doc);
            range.selectNodeContents(p[0]);
            p.removeAttr('id');
            cmd.select();
        }
    });
>>>>>>> 6f52d5ba06d475efef117561f74d26b3f4345452
=======
>>>>>>> 5015bc2c1aab6efba5f481d960db7d224786927d
});
