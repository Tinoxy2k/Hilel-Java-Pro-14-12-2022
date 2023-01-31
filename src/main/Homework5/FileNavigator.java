package main.Homework5;

import java.util.*;

public class FileNavigator {
    private final Map<String, List<FileData>> fileList = new HashMap<>();

    public void add(String fileDirectory, FileData fileData) {
        if (!fileDirectory.equals((fileData.getFilePath()))) {
            throw new IllegalArgumentException("The path currently exists");
        }
        if (fileList.containsKey(fileDirectory)) {
            fileList.get(fileDirectory).add(fileData);
        } else {
            fileList.put(fileDirectory, new ArrayList<>(List.of(fileData)));
        }
    }

    public List<FileData> findData(String fileDirectory) {
        return fileList.getOrDefault(fileDirectory, new ArrayList<>());
    }

    public List<FileData> filterSize(int fileSize) {
        List<FileData> sortedData = new ArrayList<>();
        for (List<FileData> subArList : fileList.values()) {
            for (FileData file : subArList) {
                if (file.getFileSize() <= fileSize) {
                    sortedData.add(file);
                }
            }
        }
        return sortedData;
    }

    public void remove(String fileDirectory) {
        fileList.remove(fileDirectory);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedFiles = this.filterSize(Integer.MAX_VALUE);
        sortedFiles.sort(FileData::compareTo);
        return sortedFiles;
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "fileList=" + fileList +
                '}';
    }
}
