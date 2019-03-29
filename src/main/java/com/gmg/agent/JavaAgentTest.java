package com.gmg.agent;

import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author gmg
 * @title: JavaAgentTest
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/3/29 17:59
 */

/**
 * java -javaagent:agent.jar -jar main.jar
 */
public class JavaAgentTest {
    public static void premain(String args, Instrumentation instrumentation) {
        instrumentation.addTransformer(((loader, className, classBeingRedefined, protectionDomain, classfileBuffer) -> {
            //保存字节码到本地文件
            Path path=Paths.get("classes/"+className+".class");
            try {
                Files.write(path,classfileBuffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return classfileBuffer;
        }));
    }
}
