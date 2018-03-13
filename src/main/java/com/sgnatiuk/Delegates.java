package com.sgnatiuk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class Delegates {

    interface WorkListener{
        void onSuccess(String result);
        void onFailure(Exception e);
    }

    static class ConsolePrintListener implements WorkListener{

        @Override
        public void onSuccess(String result) {
            System.out.println(result);
        }

        @Override
        public void onFailure(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    static class StoreToFileListener implements WorkListener{

        private WorkListener workListener;
        private Path path;

        public StoreToFileListener(WorkListener workListener, String filePath) {
            this.workListener = workListener;
            path = Paths.get(filePath);
        }

        @Override
        public void onSuccess(String result) {
            workListener.onSuccess(result);
            try {
                Files.write(path, Collections.singletonList(result));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void onFailure(Exception e) {
            workListener.onFailure(e);
        }
    }

    public static void main(String[] args) {
        WorkListener listener = new StoreToFileListener(
                new ConsolePrintListener(),
                "output.txt"
        );

        listener.onSuccess("some result");

        listener.onFailure(new Exception("something went wrong"));
    }
}
