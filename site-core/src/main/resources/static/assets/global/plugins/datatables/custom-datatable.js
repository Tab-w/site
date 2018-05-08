$.extend({
    DataTable: function (options) {

        var table = options.table;

        /**
         * 初始化
         */
        table.dataTable({
            "ajax": {
                "url": options.url,
                "data": options.data,
                "type": "post"
            },

            "columns": options.columns,

            //延迟渲染
            "deferRender": true,

            "processing": true,

            //服务器模式
            "serverSide": true,

            // 保存状态 - 在页面重新加载的时候恢复状态（页码等内容）
            "stateSave": false,

            //页面内搜索
            "searching": false,

            //排序
            "ordering": false,

            "lengthMenu": [
                [10, 50, 100],
                [10, 50, 100]
            ],
            "pageLength": 10,
            "pagingType": "bootstrap_full_number",

            "language": {
                "processing": "加载中...",
                "lengthMenu": "_MENU_条记录",
                "zeroRecords": "没有找到任何记录",
                "info": "第_PAGE_页 (总共_PAGES_页,_MAX_条记录)",
                "infoEmpty": "无记录",
                "infoFiltered": "",
                "paginate": {
                    "previous": "上一页",
                    "next": "上一页",
                    "last": "尾页",
                    "first": "首页"
                }
            },

            // 定义 dataTable 的组件元素的显示和显示顺序
            // l - length changing input control
            // f - filtering input
            // t - table!
            // i - table information summary
            // p - pagination control
            // r - processing display element
            "dom": "<'row'<'col-md-6 col-sm-12'l>r>t<'row'<'col-md-5 col-sm-12'i><'col-md-7 col-sm-12'p>>"
        });

        /**
         * 根据参数重新加载table
         * @param url
         * @param type
         * @param data
         */
        table.redirect = function (url, type, data) {
            var settings = table.fnSettings();
            settings.ajax = {
                "url": url,
                "type": type,
                "data": data
            };
            table.fnDraw();
        };

        /**
         * 全选checkbox改变
         */
        table.find('.group-checkable').change(function () {
            var set = $(this).attr("data-set");
            var checked = $(this).is(":checked");
            $(set).each(function () {
                if (checked) {
                    $(this).prop("checked", true);
                    $(this).parents('tr').addClass("active");
                } else {
                    $(this).prop("checked", false);
                    $(this).parents('tr').removeClass("active");
                }
            });
        });

        /**
         * 每行的checkbox改变
         */
        table.on('change', 'tbody tr .checkboxes', function () {
            $(this).parents('tr').toggleClass("active");
            var set = table.find('.group-checkable').attr("data-set");
            var checked = true;
            $(set).each(function () {
                if (!$(this).prop("checked")) {
                    checked = false;
                }
            });
            if (checked) {
                table.find('.group-checkable').prop("checked", true);
            } else {
                table.find('.group-checkable').prop("checked", false);
            }
        });

        return table;
    },

    /**
     * 生成checkbox
     * @param data
     * @returns {string}
     */
    generateCheckbox: function (data) {
        var checkBox = "";
        checkBox += "<label class=\"mt-checkbox mt-checkbox-single mt-checkbox-outline\">";
        checkBox += "    <input type=\"checkbox\" class=\"checkboxes\" value=\"" + data + "\" />";
        checkBox += "    <span></span>";
        checkBox += "</label>";
        return checkBox;
    }
});
