package com.gmg.trywithresource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author gmg
 * @title: Example
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/7/7 15:26
 */
public class Example {

    static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    /**
     * 有两个资源,资源之间用分号隔开。资源被关闭的顺序与它们被创建的顺序相反，也就是说writer 先被关闭，接着是zf。
     * @param zipFileName
     * @param outputFileName
     * @throws IOException
     */
    public static void writeToFileZipFileContents(String zipFileName, String outputFileName)
            throws IOException {

        Charset charset = Charset.forName("US-ASCII");
        Path outputFilePath = Paths.get(outputFileName);

        // Open zip file and create output file with try-with-resources statement

        try (
                ZipFile zf = new ZipFile(zipFileName);
                BufferedWriter writer = Files.newBufferedWriter(outputFilePath, charset)
        ) {

            // Enumerate each entry

            for (Enumeration entries = zf.entries(); entries.hasMoreElements();) {

                // Get the entry name and write it to the output file

                String newLine = System.getProperty("line.separator");
                String zipEntryName = ((ZipEntry)entries.nextElement()).getName() + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
    }


    public static void viewTable(Connection con) throws SQLException {

        String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

        try (Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");
                System.out.println(coffeeName + ", " + supplierID + ", " + price +
                        ", " + sales + ", " + total);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
