//初始化Markdown编辑器
var contentEditor;
$(function () {
    contentEditor = editormd("md-content", {
        width: "100%",//宽度
        height: 500,//高度
        syncScrolling: "single",//单滚动条
        path: "../editormd/lib/"//依赖的包路径
    });
});

//获得md并发布
function getMd() {
    var as = document.getElementsByTagName('pre');
    let markdown = "";
    let count = 0;
    for (var i = 0, j = as.length; i < j; i++) {
        if (i == j - count / 2) {
            if (confirm("确认发布？") == true) {
                console.log(markdown);//发布
                return;
            } else {
                return;
            }
        }
        let textLine = as[i].innerText
        if (textLine.indexOf("```") != -1) {
            count += 1;
        }
        markdown += textLine + "\n";
    }
    if (confirm("确认发布？") == true) {
        console.log(markdown);
    }
}

//发布方法(id,标题，分类，数据)
function send(id, title, classify, data) {

}