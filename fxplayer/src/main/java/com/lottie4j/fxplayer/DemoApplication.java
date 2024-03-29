package com.lottie4j.fxplayer;

import com.lottie4j.core.handler.FileLoader;
import com.lottie4j.core.model.Animation;
import com.lottie4j.fxplayer.player.LottiePlayer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class DemoApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        File f = new File(this.getClass().getResource("/lottie/java_duke.json").getFile());
        Animation animation = FileLoader.parseAnimation(f);

        System.out.println("Starting with W/H " + animation.width() + "/" + animation.height());

        LottiePlayer player = new LottiePlayer(animation);

        Group group = new Group();
        group.getChildren().add(player);

        Scene scene = new Scene(group, animation.width(), animation.height());
        primaryStage.setTitle(f.getName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
