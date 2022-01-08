package com.java.ccs.study.commonstudy.base.common.io;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author caocs
 * @date 2021/11/22
 */
public class ReaderWriterTest {

    public static void main(String[] args) {
        File file = new File("hello.txt");
        System.out.println(file.getAbsolutePath());
        // InputStream inputStream = new FileInputStream();
    }

    @Test
    public void test01() throws IOException {
        // 实例化File类的对象，指明要操作的文件
        File file = new File("src/main/resources/Hello.txt");
        System.out.println(file.getAbsolutePath());
        // 提供具体的流(字符)
        FileReader fileReader = new FileReader(file);
        // 返回读入的一个字符。如果达到文件末尾则返回-1
        int data = fileReader.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fileReader.read();
        }

        // 关闭流
        fileReader.close();
    }

    @Test
    public void test02() {
        // 实例化File类的对象，指明要操作的文件
        File file = new File("src/main/resources/Hello.txt");
        System.out.println(file.getAbsolutePath());
        // 提供具体的流(字符)
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            // 返回读入的一个字符。如果达到文件末尾则返回-1
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void test03() {
        // 实例化File类的对象，指明要操作的文件
        File file = new File("src/main/resources/Hello.txt");
        System.out.println(file.getAbsolutePath());
        // 提供具体的流(字符)
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            // 每次返回读入charBuff数组中的字符的个数。如果达到末尾则返回-1
            char[] charBuff = new char[5];
            int length;
            while ((length = fileReader.read(charBuff)) != -1) {
                for (int i = 0; i < length; i++) {
                    System.out.print(charBuff[i]);
                }

                // String str = new String(charBuff); // 错误写法,会把最后的字符也输出出来。
                String str = new String(charBuff, 0, length); // 正确写法。
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void test04() {
        // 实例化File类的对象，指明要操作的文件
        File file = new File("src/main/resources/Hello1.txt");
        System.out.println(file.getAbsolutePath());
        // 提供具体的流(字符)
        FileWriter fileWriter = null;
        try {
            // fileWriter = new FileWriter(file,false);
            fileWriter = new FileWriter(file, true);
            fileWriter.write("hahhahha");
            fileWriter.write("hddddahhahha");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void test05() {
        File sourceFile = new File("src/main/resources/Hello.txt");
        File targetFile = new File("src/main/resources/Hello_copy.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(sourceFile);
            fileWriter = new FileWriter(targetFile, false);

            char[] charBuff = new char[5];
            int length;
            while ((length = fileReader.read(charBuff)) != -1) {
                fileWriter.write(charBuff, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
