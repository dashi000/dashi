package com.dd;

public class Attachment//����
{
    private String name;	//�ļ���

    private byte[] contents; 
    //�ļ����ݷ����ֽ�����

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public byte[] getContents()
    {
        return contents;
    }

    public void setContents(byte[] contents)
    {
        this.contents = contents;
    }
}
