<!--用户管理JS -->
$(function () {

    /**
     * 表格JS
     * @type {string}
     */
    $.jgrid.defaults.styleUI = 'Bootstrap';

    /**
     *自适应宽度
     */
    $(window).bind('resize', function () {
        var width = $('.jqGrid_wrapper').width();
        $('#table_list_1').setGridWidth(width);
    });

    /**
     *查询所 有用户信息
     */
    $.ajax({
        'url': rootPath + "/admin/alluser",
        'type': 'POST',
        'async': true,
        'cache': false,
        'dataType': 'json',
        'success': function (data) {
            $("#table_list_1").jqGrid({
                data: data,
                datatype: "local",
                height: 250,
                autowidth: true,
                shrinkToFit: true,
                rowNum: 14,
                rowList: [10, 20, 30],
                colNames: ['序号', '用户名', '密码', '真实姓名', '身份', '邮箱', '电话', '创建时间', '更新时间', '状态', '最后IP', 'IP地址', '操作'],
                colModel: [
                    {
                        name: 'id',
                        index: 'id',
                        width: 60,
                        sorttype: "int"
                    },
                    {
                        name: 'username',
                        index: 'username',
                        width: 90
                    },
                    {
                        name: 'password',
                        index: 'password',
                        width: 80
                    },
                    {
                        name: 'realname',
                        index: 'realname',
                        width: 100
                    },
                    {
                        name: 'state',
                        index: 'state',
                        width: 80
                    },
                    {
                        name: 'email',
                        index: 'email',
                        width: 80
                    },
                    {
                        name: 'tel',
                        index: 'tel',
                        width: 80
                    },
                    {
                        name: 'creattime',
                        index: 'creattime',
                        width: 80
                    },
                    {
                        name: 'updatetime',
                        index: 'updatetime',
                        width: 80
                    },
                    {
                        name: 'isexist',
                        index: 'isexist',
                        width: 80
                    },
                    {
                        name: 'lastip',
                        index: 'lastip',
                        width: 80
                    },
                    {
                        name: 'iplocation',
                        index: 'iplocation',
                        width: 80
                    },
                    {
                        name: 'total',
                        index: 'total',
                        width: 80
                    }
                ],
                pager: "#pager_list_1",
                viewrecords: true,
                hidegrid: false
            });
        },
        'error': function (e) {
            console.log(e);
        }
    });


    /**
     * 插入新用户
     */
    $("#insert_user").click(function () {
        var url = rootPath+"/admin/insertuser"
        debugger;
        var username = $.trim($("#in_username").val());
        var password = $.trim($("#in_password").val());
        var realname = $.trim($("#in_realname").val());
        var state = $.trim($("#in_state").val());
        var email = $.trim($("#in_email").val());
        var tel = $.trim($("#in_tel").val());

        var params ={
            "username": username,
            "password": password,
            "realname": realname,
            "state": state,
            "email": email,
            "tel":tel
        };
        $.ajax({
            'url': url,
            'type': 'POST',
            'data': params,
            'async': true,
            'cache': false,
            'dataType': 'json',
            'success': function(result) {
                console.log(result)
            },
            'error': function(e) {
                console.log(e);
            }
        })
    })



})