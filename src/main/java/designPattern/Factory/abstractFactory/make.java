package designPattern.Factory.abstractFactory;

public class make {
    public static void main(String[] args) {
        PythonFactory pythonFactory = new PythonFactory();
        pythonFactory.getVideo().getVideo();
        pythonFactory.getArticle().getArtcile();

        MiFactory javaFactory = new MiFactory();
        javaFactory.getVideo().getVideo();
        javaFactory.getArticle().getArtcile();
    }
}
