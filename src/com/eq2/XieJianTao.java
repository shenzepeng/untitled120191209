package com.eq2;

import java.io.*;

/**
 * @Auther: szp
 * @Date: 2019/12/9 21:22
 * @Description: 沈泽鹏写点注释吧
 */
public class XieJianTao {
    private Integer id;
    private Integer personId;
    private String content;
    private String filePath;
    private Integer motherId;

    public Integer getMotherId() {
        return motherId;
    }

    @Override
    public String toString() {
        return "XieJianTao{" +
                "id=" + id +
                ", personId=" + personId +
                ", content='" + content + '\'' +
                ", filePath='" + filePath + '\'' +
                ", motherId=" + motherId +
                '}';
    }

    public void setMotherId(Integer motherId) {
        this.motherId = motherId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 入参
     * @param words
     * @param path
     */
    public void  writeWords(String words,String path) throws IOException {
        File file=new File(path);
        Writer writer=new OutputStreamWriter(new FileOutputStream(file));
        writer.write(words);
        writer.close();
    }
}
