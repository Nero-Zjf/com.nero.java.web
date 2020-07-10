package com.nero.java.jsp.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * @created nero
 * @date 2018/9/13 16:36
 */
public class TagDemo extends BodyTagSupport {
    private String title;

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();//获取JspWriter
        try {
            pageContext.getOut().print("<h1>title is "+title +"</h1><br>");
        } catch (IOException e) {
            throw new JspException(e.getMessage());
        }
        return EVAL_BODY_INCLUDE;//表示需要处理body并输出
    }

    //在处理完Body后再执行
    @Override
    public int doAfterBody() throws JspException {
        return EVAL_BODY_AGAIN;//表示再一次处理Body
    }

    //在执行完doAfterBody后再执行
    @Override
    public int doEndTag() throws JspException {
       return EVAL_PAGE;//表示处理标签后续的内容
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
