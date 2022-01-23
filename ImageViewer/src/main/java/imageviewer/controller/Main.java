package imageviewer.controller;

import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        File folder = new File("Poner aquí la ruta al directorio de imagenes");
        FileImageLoader imageLoader = new FileImageLoader(folder);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame(imageLoader);
        mainFrame.getImageDisplay().show(image);
    }
}
