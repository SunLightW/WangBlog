<!--用户管理JS -->
$(function () {

    /**
     * 表格JS
     * @type {string}
     */

    /*
     *查询所 有用户信息
     */
    $('#paperlist').bootstrapTable({
        url: rootPath + "/admin/alluser",   //请求后台的URL（*）
        method: 'get',                      //请求方式（*）
        contentType: "application/x-www-form-urlencoded",/*支持跨域**/
        toolbar: '#toolbar',                //工具按钮用哪个容器
        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
        sortable: false,                     //是否启用排序
        sortOrder: "asc",                   //排序方式
        // queryParams: oTableInit.queryParams,//传递参数（*）
        sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1,                       //初始化加载第一页，默认第一页
        pageSize: 10,                       //每页的记录行数（*）
        pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
        search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: true,
        showColumns: true,                  //是否显示所有的列
        showRefresh: true,                  //是否显示刷新按钮
        minimumCountColumns: 2,             //最少允许的列数
        clickToSelect: true,                //是否启用点击选中行
        height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
        showToggle: true,                    //是否显示详细视图和列表视图的切换按钮
        cardView: false,                    //是否显示详细视图
        detailView: false,                   //是否显示父子表
        columns: [{
            checkbox: true
        }, {
            field: 'username',
            title: '用户名'
        }, {
            field: 'password',
            title: '密码'
        }, {
            field: 'realname',
            title: '真实姓名'
        }, {
            field: 'state',
            title: '身份'
        }, {
            field: 'email',
            title: '邮箱'
        }, {
            field: 'tel',
            title: '电话'
        }, {
            field: 'createtime',
            title: '创建时间'
        }, {
            field: 'updatetime',
            title: '更新时间'
        }, {
            field: 'isexist',
            title: '状态'
        }, {
            field: 'lastip',
            title: '最后IP'
        }, {
            field: 'iplocation',
            title: 'IP地址'
        }]
    });

    /**
     * 插入新用户
     */
    $("#insert_user").click(function () {
        var url = rootPath + "/admin/insertuser"
        debugger;
        var username = $.trim($("#in_username").val());
        var password = $.trim($("#in_password").val());
        var realname = $.trim($("#in_realname").val());
        var state = $.trim($("#in_state").val());
        var email = $.trim($("#in_email").val());
        var tel = $.trim($("#in_tel").val());

        var params = {
            "username": username,
            "password": password,
            "realname": realname,
            "state": state,
            "email": email,
            "tel": tel
        };
        $.ajax({
            'url': url,
            'type': 'POST',
            'data': params,
            'async': true,
            'cache': false,
            'dataType': 'json',
            'success': function (result) {
                console.log(result)
            },
            'error': function (e) {
                console.log(e);
            }
        })
    });
});