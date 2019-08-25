var count = 120; //间隔函数，1秒执行
var InterValObj1; //timer变量，控制时间
var curCount1;//当前剩余秒数
/*发送短信*/
function sendMessage() {
    curCount1 = count;
    var tel = $("#patient_tel").val();
    $.ajax({
        url: "/hospital/user/code",
        type: "post",
        data: {"patient_tel": tel},
        success: function (data) {
            alert("发送成功");
        }
    })
    /*   var phone = $.trim($('#phone1').val());
       if (!phoneReg.test(phone)) {
           alert(" 请输入有效的手机号码");
           return false;
       }*/
    //设置button效果，开始计时

    $("#btnSendCode1").attr("disabled", "true");
    $("#btnSendCode1").val(+curCount1 + "秒再获取");
    InterValObj1 = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次
    //向后台发送处理数据
}

function SetRemainTime() {
    if (curCount1 == 0) {
        window.clearInterval(InterValObj1);//停止计时器
        $("#btnSendCode1").removeAttr("disabled");//启用按钮
        $("#btnSendCode1").val("重新发送");
    } else {
        curCount1--;
        $("#btnSendCode1").val(+curCount1 + "秒再获取");
    }
}

$(function () {
    $("#patient_add").change(function () {
        var patient_add = $(this).val();
        $.ajax({
            url: "/hospital/user/point",
            type: "post",
            data: {"patient_add": patient_add},
            dataType: "json",
            success: function (data) {
                if (data != null) {
                    $("#patient_e").val(data.lng);
                    $("#patient_n").val(data.lat);
                } else {
                    $("#patient_e").val(null);
                    $("#patient_n").val("");
                }
                console.log(data);
            }
        })
    })
})
