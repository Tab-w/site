$(function () {
    var table = $('#dataTable');

    table.dataTable({

        "ajax": {
            "url": "/user/list",
            "type": "post",
            // "success": function (data) {
            //     console.log(data);
            // }
        },

        "columns": [
            {"data": "id"},
            {"data": "username"},
            {"data": "email"},
            {"data": "phone"}
        ],

        // "processing" : true,

        "serverSide" : true,

        "language": {
            "processing": "努力加载中...",
            "lengthMenu": "_MENU_ 条记录",
            "zeroRecords": "没有找到记录",
            "info": "第 _PAGE_ 页 (总共 _PAGES_ 页)",
            "infoEmpty": "无记录",
            "infoFiltered": "(从 _MAX_ 条记录过滤)",
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
        "dom": "<'row'<'col-md-6 col-sm-12'l>r>t<'row'<'col-md-5 col-sm-12'i><'col-md-7 col-sm-12'p>>",

        "lengthMenu": [
            [10, 50, 100],
            [10, 50, 100]
        ],
        "pageLength": 10,
        "pagingType": "bootstrap_full_number",

        // 保存状态 - 在页面重新加载的时候恢复状态（页码等内容）
        "stateSave": false,

        //页面内搜索
        "searching": false,

        //排序
        "ordering": false

        // "columnDefs": [
        //     {
        //         'orderable': false,
        //         'targets': [0]
        //     },
        //     {
        //         "className": "dt-left",
        //         "targets": [1]
        //     }
        // ],
        // "order": [
        //     [1, "asc"]
        // ]
    });


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
});