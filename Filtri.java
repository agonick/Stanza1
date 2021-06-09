package EserciziImmagini;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Filtri {

    public static void main(String[] args) throws Exception {
        BufferedImage Immagine = ImageIO.read(new File("freaked.jpg"));
        filtroBiancoENero(Immagine);
        filtroSpecchio(Immagine);
        filtroGBR(Immagine);
        filtroNegativo(Immagine);
        filtroPosterize(Immagine,50);

    }

    public static boolean filtroBiancoENero (BufferedImage Immagine) throws Exception {

        BufferedImage ImmagineFiltrata = new BufferedImage(Immagine.getWidth(), Immagine.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        for (int col = 0; col < Immagine.getWidth(); col++) {
            for (int row = 0; row < Immagine.getHeight(); row++) {
                Color pixelInput = new Color(Immagine.getRGB(col, row));
                int luma = ((pixelInput.getRed() * 77) / 255) + ((pixelInput.getGreen() * 150) / 255) + ((pixelInput.getBlue() * 28) / 255);
                Color pixelOutput = new Color(luma, luma, luma);
                ImmagineFiltrata.setRGB(col, row, pixelOutput.getRGB());
            }
        }
        return ImageIO.write(ImmagineFiltrata, "jpg", new File("freakedGray.jpg"));
    }

    public static boolean filtroSpecchio (BufferedImage Immagine) throws Exception {

        BufferedImage ImmagineFiltrata = new BufferedImage(Immagine.getWidth(), Immagine.getHeight(), BufferedImage.TYPE_3BYTE_BGR);

        for (int col = 0; col < Immagine.getWidth(); col++) {
            for (int row = 0; row < Immagine.getHeight(); row++) {
            Color PixelInput = new Color(Immagine.getRGB(col,row));
            ImmagineFiltrata.setRGB(Immagine.getWidth()-col-1,row,PixelInput.getRGB());
            }
        }
        return ImageIO.write(ImmagineFiltrata, "jpg", new File("freakedSpecchiata.jpg"));
    }

    public static boolean filtroGBR (BufferedImage Immagine) throws Exception {

        BufferedImage ImmagineFiltrata = new BufferedImage(Immagine.getWidth(), Immagine.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        int R,G,B;

        for (int col = 0; col < Immagine.getWidth(); col++) {
            for (int row = 0; row < Immagine.getHeight(); row++) {
                Color pixelInput = new Color(Immagine.getRGB(col,row));
                R = pixelInput.getRed();
                G = pixelInput.getGreen();
                B = pixelInput.getBlue();
                Color newPixel = new Color(G,B,R);
                ImmagineFiltrata.setRGB(col,row,newPixel.getRGB());
            }
        }
        return ImageIO.write(ImmagineFiltrata, "jpg", new File("freakedGBR.jpg"));
    }

    public static boolean filtroNegativo (BufferedImage Immagine) throws Exception {

        BufferedImage ImmagineFiltrata = new BufferedImage(Immagine.getWidth(), Immagine.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        int R,G,B;

        for (int col = 0; col < Immagine.getWidth(); col++) {
            for (int row = 0; row < Immagine.getHeight(); row++) {
                Color pixelInput = new Color(Immagine.getRGB(col,row));
                R = 255 - pixelInput.getRed();
                G = 255 - pixelInput.getGreen();
                B = 255 - pixelInput.getBlue();
                Color newPixel = new Color(R,G,B);
                ImmagineFiltrata.setRGB(col,row,newPixel.getRGB());
            }
        }
        return ImageIO.write(ImmagineFiltrata, "jpg", new File("freakedNegativo.jpg"));
    }

    public static boolean filtroPosterize (BufferedImage Immagine,int livelli) throws Exception {


        BufferedImage ImmagineFiltrata = new BufferedImage(Immagine.getWidth(), Immagine.getHeight(), BufferedImage.TYPE_3BYTE_BGR);

        int R=0;
        int G=0;
        int B=0;

        for (int col = 0; col < Immagine.getWidth(); col++) {
            for (int row = 0; row < Immagine.getHeight(); row++) {

                Color pixelInput = new Color(Immagine.getRGB(col,row));

                //MAPPATURA DEL ROSSO
                for(int i=1;i <= livelli; i++) {
                    if (pixelInput.getRed() <= (255 / livelli) * i) {
                        R = (255 / livelli) * (i - 1);
                        break;
                    }

                }

                //MAPPATURA DEL VERDE
                for(int i=1;i <= livelli; i++) {
                    if (pixelInput.getGreen() <= (255 / livelli) * i) {
                        G = (255 / livelli) * (i - 1);
                        break;
                    }
                }

                //MAPPATURA DEL BLUE
                for(int i=1;i <= livelli; i++) {
                    if (pixelInput.getBlue() <= (255 / livelli) * i) {
                        B = (255 / livelli) * (i - 1);
                        break;
                    }
                }

                //CREO IL NUOVO PIXEL CON I COLORI MAPPATI
                Color newPixel = new Color(R,G,B);
                ImmagineFiltrata.setRGB(col,row,newPixel.getRGB());
            }
        }


        return ImageIO.write(ImmagineFiltrata, "jpg", new File("freakedPosterize.jpg"));
    }


}



