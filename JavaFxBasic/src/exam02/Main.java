package exam02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {


    @Override//처음에 실행할대 실행해야 하는 코드가 있을대 쓰는거
    public void init() throws Exception {
        System.out.println("init()");
    }

    @Override//ui를 보여줘야 할대 ui를 만드는 코드
    public void start(Stage primaryStage) throws Exception {//primaryStage는 기본 창(무대)이다
        System.out.println("start()");
        primaryStage.setTitle("나의 JavaFX 윈도우");//창에 제목을 넣을때


        //신 만들기
        //AnchorPane anchorPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Main.fxml"));//FXMLLoader는 fxml파일을 로드
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));//이건 두번째 방법
        AnchorPane anchorPane = (AnchorPane) fxmlLoader.load();


        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);//장면을 무대위로 올리는것

        //사이즈(가능하면 제일 마지막)
        //primaryStage.setWidth(600);//윈도우 사이즈 고정
        //primaryStage.setHeight(400);//윈도우 사이즈 고정
        primaryStage.setMaximized(true);//처음부터 화면을 꽉 채우게 넣고 싶다

        primaryStage.show();//기본 윈도우를 보이게 해라
    }

    @Override//제일 마지막에 프로세서가 종료가 될때
    public void stop() throws Exception {
        System.out.println("stop()");
    }

    public static void main(String[] args) {
        launch(args);//launch는 Application가 가지고 있는 정적 메소드다
    }
}
