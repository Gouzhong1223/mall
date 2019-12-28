package com.gouzhong1223.mall.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Gouzhong
 * @company : www.gouzhong1223.com
 * @Description :
 * @date : create by QingSong in 2019-11-15 8:40 PM
 * @email : 1162864960@qq.com
 */
@Data
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pageNum;

    private int pageSize;

    private long total;

    private int totalPage;

    private List<T> list;

    public PageResult(int pageNum, int pageSize, long total, int totalPage, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.totalPage = totalPage;
        this.list = list;
    }
}
