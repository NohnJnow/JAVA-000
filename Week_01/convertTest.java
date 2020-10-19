package JVM_TEST.fundTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author Wu YuHao thecoco
 * @date 2020/10/17 6:33 下午
 */
public class convertTest extends ClassLoader{

    private static final String FILE = "/Users/thecoco/Downloads/2020-10-17/Hello/Hello.xlass";

    public static void main(String[] args) {
      try {
          Class helloClass = new convertTest().findClass("Hello");

          Method method = helloClass.getMethod("hello");

          method.invoke(helloClass.newInstance());
      } catch (Exception e){
          e.printStackTrace();
      }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] temp = getContent(FILE);
            for (int i = 0; i < Objects.requireNonNull(temp).length; i++){
                temp[i] = (byte)(255-temp[i]);
            }
            // 加载自定义Hello类
            return defineClass(name, temp, 0, temp.length);

        }catch (Exception e){
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    public static byte[] getContent(String filePath) throws IOException {
        File file = new File(filePath);
        long fileSize = file.length();
        if (fileSize > Integer.MAX_VALUE) {
            return null;
        }
        FileInputStream fi = new FileInputStream(file);
        byte[] buffer = new byte[(int) fileSize];
        int offset = 0;
        int numRead = 0;
        while (offset < buffer.length
                && (numRead = fi.read(buffer, offset, buffer.length - offset)) >= 0) {
            offset += numRead;
        }
        if (offset != buffer.length) {
            throw new IOException("Could not completely read file "
                    + file.getName());
        }
        fi.close();
        return buffer;
    }
}
