$(function () {
    var table = $.DataTable({
        "table": $("#dataTable"),
        "url": "/user/list",
        "type": "post",
        "columns": [
            {
                "data": "id",
                "render": function (data) {
                    return $.generateCheckbox(data);
                }
            },
            {"data": "username"},
            {"data": "email"},
            {"data": "phone"},
            {
                "render": function (data) {
                    return "<span class=\"label label-sm label-success\"> Approved </span>";
                }
            }
        ]
    });

    $("#sample_editable_1_new").on("click", function () {
        table.redirect("/user/list", "post", {id: "9"});
    });
});