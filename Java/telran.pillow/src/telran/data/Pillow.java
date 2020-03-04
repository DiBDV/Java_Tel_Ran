package telran.data;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Pillow {

    private int width;
    private int length;
    private String filling;
    private String cover;

    public Pillow(int width, int length, String filling, String cover){
        this.width = width;
        this.length = length;
        this.filling = filling;
        this.cover = cover;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getFilling() {
        return filling;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void display(){
        System.out.println("Pillow width: " + width);
        System.out.println("Pillow lenght: " + length);
        System.out.println("Pillow filling: " + filling);
        System.out.println("Pillow cover: " + cover);
    }

    //печать масива
    public static void printArray(Pillow[] pillows){
        for (Pillow p:pillows){
            p.display();
            System.out.println();
        }
    }

    //форматировааный вывод на печеть
    public static void printArrayPillow(Pillow[] pillows){
        for (int i = 0; i < pillows.length; i++){
            System.out.println("~~~~~~~~~~~~~~~" + "Pillow " + (i+1) + "~~~~~~~~~~~~~~~~~~");
            pillows[i].display();
        }
    }

}

//
//Pillow
//4 parameters
//getter/setter
//display();