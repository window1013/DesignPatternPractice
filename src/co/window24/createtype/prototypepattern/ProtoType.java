package co.window24.createtype.prototypepattern;

import java.io.*;

/**
 * Created by yuanfei on 7/14/16.
 */
public class ProtoType implements Cloneable, Serializable {

    private String string;

    private SerializableObject object;

    // 浅复制
    public Object clone() throws CloneNotSupportedException {

        ProtoType protoType = (ProtoType) super.clone();
        return protoType;
    }

    // 深复制
    public Object deepClone() throws IOException, ClassNotFoundException {

        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObject() {
        return object;
    }

    public void setObject(SerializableObject object) {
        this.object = object;
    }
}

class SerializableObject implements Serializable {

    private static final long serialVersionUID = 1L;
}