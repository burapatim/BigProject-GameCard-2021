package cardgame;

import java.util.Random;
import java.util.Timer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CardGame extends Application {

    int numberAll;
    int countGame;
    int count = 1;
    int numberMe;
    int numberU;

    Button btnBack = new Button("MAIN MEMU");

    TextArea txtAr = new TextArea();

    ImageView imgStartBg = new ImageView(new Image("file:C:/cardgame/StartBg.jpg"));
    ImageView imgStart = new ImageView(new Image("file:C:/cardgame/Start.png"));
    ImageView imgManual = new ImageView(new Image("file:C:/cardgame/Manual.png"));

    TextField txt = new TextField();
    Label lblMoney = new Label();

    ImageView imgWin = new ImageView(new Image("file:C:/cardgame/Win.png"));
    ImageView imgLose = new ImageView(new Image("file:C:/cardgame/Lose.png"));
    ImageView imgGameOver = new ImageView(new Image("file:C:/cardgame/GameOver.png"));

    ImageView imgMoney = new ImageView(new Image("file:C:/cardgame/Money.png"));
    ImageView imgNext = new ImageView(new Image("file:C:/cardgame/Next.png"));
    ImageView imgDrawCard = new ImageView(new Image("file:C:/cardgame/Drawcard.png"));
    ImageView imgBet = new ImageView(new Image("file:C:/cardgame/Bet.png"));
    ImageView imgA1 = new ImageView(new Image("file:C:/cardgame/A1.jpg"));
    ImageView imgA2 = new ImageView(new Image("file:C:/cardgame/A2.jpg"));
    ImageView imgA3 = new ImageView(new Image("file:C:/cardgame/A3.jpg"));
    ImageView imgA4 = new ImageView(new Image("file:C:/cardgame/A4.jpg"));
    ImageView imgB1 = new ImageView(new Image("file:C:/cardgame/B1.jpg"));
    ImageView imgB2 = new ImageView(new Image("file:C:/cardgame/B2.jpg"));
    ImageView imgB3 = new ImageView(new Image("file:C:/cardgame/B3.jpg"));
    ImageView imgB4 = new ImageView(new Image("file:C:/cardgame/B4.jpg"));

    ImageView imgC1 = new ImageView(new Image("file:C:/cardgame/C1.jpg"));
    ImageView imgC2 = new ImageView(new Image("file:C:/cardgame/C2.jpg"));
    ImageView imgC3 = new ImageView(new Image("file:C:/cardgame/C3.jpg"));
    ImageView imgC4 = new ImageView(new Image("file:C:/cardgame/C4.jpg"));

    ImageView imgD1 = new ImageView(new Image("file:C:/cardgame/D1.jpg"));
    ImageView imgD2 = new ImageView(new Image("file:C:/cardgame/D2.jpg"));
    ImageView imgD3 = new ImageView(new Image("file:C:/cardgame/D3.jpg"));
    ImageView imgD4 = new ImageView(new Image("file:C:/cardgame/D4.jpg"));

    ImageView imgE1 = new ImageView(new Image("file:C:/cardgame/E1.jpg"));
    ImageView imgE2 = new ImageView(new Image("file:C:/cardgame/E2.jpg"));
    ImageView imgE3 = new ImageView(new Image("file:C:/cardgame/E3.jpg"));
    ImageView imgE4 = new ImageView(new Image("file:C:/cardgame/E4.jpg"));

    ImageView imgF1 = new ImageView(new Image("file:C:/cardgame/F1.jpg"));
    ImageView imgF2 = new ImageView(new Image("file:C:/cardgame/F2.jpg"));
    ImageView imgF3 = new ImageView(new Image("file:C:/cardgame/F3.jpg"));
    ImageView imgF4 = new ImageView(new Image("file:C:/cardgame/F4.jpg"));

    ImageView imgG1 = new ImageView(new Image("file:C:/cardgame/G1.jpg"));
    ImageView imgG2 = new ImageView(new Image("file:C:/cardgame/G2.jpg"));
    ImageView imgG3 = new ImageView(new Image("file:C:/cardgame/G3.jpg"));
    ImageView imgG4 = new ImageView(new Image("file:C:/cardgame/G4.jpg"));

    ImageView imgH1 = new ImageView(new Image("file:C:/cardgame/H1.jpg"));
    ImageView imgH2 = new ImageView(new Image("file:C:/cardgame/H2.jpg"));
    ImageView imgH3 = new ImageView(new Image("file:C:/cardgame/H3.jpg"));
    ImageView imgH4 = new ImageView(new Image("file:C:/cardgame/H4.jpg"));

    ImageView imgI1 = new ImageView(new Image("file:C:/cardgame/I1.jpg"));
    ImageView imgI2 = new ImageView(new Image("file:C:/cardgame/I2.jpg"));
    ImageView imgI3 = new ImageView(new Image("file:C:/cardgame/I3.jpg"));
    ImageView imgI4 = new ImageView(new Image("file:C:/cardgame/I4.jpg"));

    ImageView imgI5 = new ImageView(new Image("file:C:/cardgame/I5.jpg"));
    ImageView imgI6 = new ImageView(new Image("file:C:/cardgame/I6.jpg"));
    ImageView imgI7 = new ImageView(new Image("file:C:/cardgame/I7.jpg"));
    ImageView imgI8 = new ImageView(new Image("file:C:/cardgame/I8.jpg"));

    ImageView imgJ1 = new ImageView(new Image("file:C:/cardgame/J1.jpg"));
    ImageView imgJ2 = new ImageView(new Image("file:C:/cardgame/J2.jpg"));
    ImageView imgJ3 = new ImageView(new Image("file:C:/cardgame/J3.jpg"));
    ImageView imgJ4 = new ImageView(new Image("file:C:/cardgame/J4.jpg"));

    ImageView imgK1 = new ImageView(new Image("file:C:/cardgame/K1.jpg"));
    ImageView imgK2 = new ImageView(new Image("file:C:/cardgame/K2.jpg"));
    ImageView imgK3 = new ImageView(new Image("file:C:/cardgame/K3.jpg"));
    ImageView imgK4 = new ImageView(new Image("file:C:/cardgame/K4.jpg"));

    ImageView imgQ1 = new ImageView(new Image("file:C:/cardgame/Q1.jpg"));
    ImageView imgQ2 = new ImageView(new Image("file:C:/cardgame/Q2.jpg"));
    ImageView imgQ3 = new ImageView(new Image("file:C:/cardgame/Q3.jpg"));
    ImageView imgQ4 = new ImageView(new Image("file:C:/cardgame/Q4.jpg"));

    ImageView imgFlot1 = new ImageView(new Image("file:C:/cardgame/flot.jpg"));
    ImageView imgFlot2 = new ImageView(new Image("file:C:/cardgame/flot.jpg"));
    ImageView imgFlot3 = new ImageView(new Image("file:C:/cardgame/flot.jpg"));
    ImageView imgBg = new ImageView(new Image("file:C:/cardgame/bg.png"));

    Random rd = new Random();
    int decard[] = {1, 2, 3, 4};
    int rdCard[] = {-1, -1, -1, -1, -1, -1};

    int Money = 500;
    int number1, number2, number3, number4, number5 = 0, number6 = 0;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

        Timer tm = new Timer();

        imgNext.setFitHeight(100);
        imgNext.setFitWidth(100);
        imgNext.relocate(600, 400);

        imgMoney.setFitWidth(100);
        imgMoney.setFitHeight(100);
        imgMoney.relocate(180, 500);

        lblMoney.relocate(320, 560);
        lblMoney.setFont(new Font("Broadway", 25));
        lblMoney.setText(Integer.toString(Money));
        lblMoney.setTextFill(Color.rgb(255, 243, 234));

        imgBet.relocate(235, 220);
        txt.relocate(470, 555);
        txt.setFont(new Font("Broadway", 18));
        txt.setPrefWidth(80);
        txt.setAlignment(Pos.CENTER);
        imgDrawCard.setVisible(false);
        imgDrawCard.relocate(500, 200);
        while (rdCard[0] == -1 || rdCard[1] == -1 || rdCard[2] == -1 || rdCard[3] == -1 || rdCard[4] == -1 || rdCard[5] == -1) {
            if (rdCard[0] == -1) {
                rdCard[0] = rd.nextInt(52) + 1;
            } else if (rdCard[1] == -1 || rdCard[1] == rdCard[0]) {
                rdCard[1] = rd.nextInt(52) + 1;
            } else if (rdCard[2] == -1 || rdCard[2] == rdCard[0] || rdCard[2] == rdCard[1]) {
                rdCard[2] = rd.nextInt(52) + 1;
            } else if (rdCard[3] == -1 || rdCard[3] == rdCard[0] || rdCard[3] == rdCard[1] || rdCard[3] == rdCard[2]) {
                rdCard[3] = rd.nextInt(52) + 1;
            } else if (rdCard[4] == -1 || rdCard[4] == rdCard[0] || rdCard[4] == rdCard[1] || rdCard[4] == rdCard[2] || rdCard[4] == rdCard[3]) {
                rdCard[4] = rd.nextInt(52) + 1;
            } else if (rdCard[5] == -1 || rdCard[5] == rdCard[0] || rdCard[5] == rdCard[1] || rdCard[5] == rdCard[2] || rdCard[5] == rdCard[3] || rdCard[5] == rdCard[4]) {
                rdCard[5] = rd.nextInt(52) + 1;
            }
        }

        System.out.println(rdCard[0]);
        System.out.println(rdCard[1]);
        System.out.println(rdCard[2]);
        System.out.println(rdCard[3]);
        System.out.println(rdCard[4]);
        stage.setTitle("CardGame");
        stage.getIcons().add(new Image("file:C:/cardgame/icon.png"));

        imgBg.setScaleX(0.8);
        imgBg.setScaleY(0.8);
        Label lbl = new Label();
        lbl.setGraphic(imgBg);
        lbl.relocate(0 - 100, 0 - 120);

        ImageView imgBtn = new ImageView(new Image("file:C:/cardgame/flot.jpg"));
        Button btn = new Button();
        btn.setGraphic(imgBtn);
        btn.relocate(165, 220);
        btn.setPrefSize(69, 95);

        Pane pane = new Pane();
        pane.getChildren().addAll(lbl, btn, imgA1, imgA2, imgA3, imgA4, imgB1, imgB2, imgB3, imgB4, imgC1, imgC2, imgC3, imgC4, imgD1, imgD2, imgD3, imgD4, imgE1, imgE2, imgE3, imgE4, imgF1, imgF2, imgF3, imgF4, imgG1, imgG2, imgG3, imgG4, imgH1, imgH2, imgH3, imgH4, imgI1, imgI2, imgI3, imgI4, imgI5, imgI6, imgI7, imgI8, imgJ1, imgJ2, imgJ3, imgJ4, imgK1, imgK2, imgK3, imgK4, imgQ1, imgQ2, imgQ3, imgQ4, imgFlot1, imgFlot2, imgFlot3, imgBet, imgDrawCard, lblMoney, btnBack, txt, imgMoney, imgNext, imgGameOver, imgWin, imgLose, imgStartBg, imgStart, imgManual, txtAr);

        btnBack.relocate(300, 550);
        btnBack.setFont(new Font("Eras Bold ITc", 20));

        btnBack.setVisible(false);
        btnBack.setOnAction(e -> {
            imgStart.setVisible(true);
            imgStartBg.setVisible(true);
            imgManual.setVisible(true);
            txt.setVisible(true);
            imgMoney.setVisible(true);
            lblMoney.setVisible(true);
            btnBack.setVisible(false);
            imgLose.setVisible(false);
            imgWin.setVisible(false);
            imgGameOver.setVisible(false);
            randomCard();
            Money = 500;
            imgA1.setVisible(false);
            imgA2.setVisible(false);
            imgA3.setVisible(false);
            imgA4.setVisible(false);

            imgB1.setVisible(false);
            imgB2.setVisible(false);
            imgB3.setVisible(false);
            imgB4.setVisible(false);

            imgC1.setVisible(false);
            imgC2.setVisible(false);
            imgC3.setVisible(false);
            imgC4.setVisible(false);

            imgD1.setVisible(false);
            imgD2.setVisible(false);
            imgD3.setVisible(false);
            imgD4.setVisible(false);

            imgE1.setVisible(false);
            imgE2.setVisible(false);
            imgE3.setVisible(false);
            imgE4.setVisible(false);

            imgF1.setVisible(false);
            imgF2.setVisible(false);
            imgF3.setVisible(false);
            imgF4.setVisible(false);

            imgG1.setVisible(false);
            imgG2.setVisible(false);
            imgG3.setVisible(false);
            imgG4.setVisible(false);

            imgH1.setVisible(false);
            imgH2.setVisible(false);
            imgH3.setVisible(false);
            imgH4.setVisible(false);

            imgI1.setVisible(false);
            imgI2.setVisible(false);
            imgI3.setVisible(false);
            imgI4.setVisible(false);

            imgI5.setVisible(false);
            imgI6.setVisible(false);
            imgI7.setVisible(false);
            imgI8.setVisible(false);

            imgJ1.setVisible(false);
            imgJ2.setVisible(false);
            imgJ3.setVisible(false);
            imgJ4.setVisible(false);

            imgK1.setVisible(false);
            imgK2.setVisible(false);
            imgK3.setVisible(false);
            imgK4.setVisible(false);

            imgQ1.setVisible(false);
            imgQ2.setVisible(false);
            imgQ3.setVisible(false);
            imgQ4.setVisible(false);

            imgFlot1.setVisible(false);
            imgFlot2.setVisible(false);
            imgFlot3.setVisible(false);

            lblMoney.setText(Integer.toString(Money));
            count = 0;

        });

        
        
        txtAr.setFont(new Font("Tahoma", 15));
        txtAr.relocate(140, 250);
        txtAr.setPrefSize(552, 300);
        txtAr.setText("\t\t\t\t\t\tวิธีการเล่น  "
                + "\n" + "\t1 . เริ้มเล่นเกมโดยกดคลิ๊กตรงกองไพ่ที่คว่ำอยู่ทางซ้ายมือเพื่อทำการแจกไพ่"
                + "\n" + "\t2 . ใส่จำนวนเงินด้านล่างเพื่อเดิมพัน"
                + "\n" + "\t3 . หากต้องการจั่วเพิ่มให้คลิ๊กตรงรูปมือด้านขวา"
                + "\n" + "\t4 . เริ่มเดิมพันให้คลิกที่ BET ที่อยู่ตรงกลาง"
                + "\n" + "\t5 . เมื่อเริ่มเกมจะมีเงินมาให้จำนวน 500"
                + "\n" + "\t6 . ถ้าได้เงินมากกว่า 2000 จะชนะ"
                + "\n" + "\t7 . ถ้าเงินเหลือน้อยกว่า 0 จะแพ้"
                + "\n" + "\t8. ถ้าต้องการเริ่่มเล่นเกมใหม่ให้กดที่ MANE MENU");
        txtAr.setVisible(false);

        imgGameOver.setFitWidth(400);
        imgGameOver.setFitHeight(400);
        imgGameOver.relocate(200, 0);

        imgWin.setFitWidth(200);
        imgWin.setFitHeight(200);
        imgWin.relocate(310, 300);

        imgLose.setFitWidth(200);
        imgLose.setFitHeight(200);
        imgLose.relocate(310, 300);

        imgStartBg.relocate(0, 0);
        imgStartBg.setFitWidth(800);
        imgStartBg.setFitHeight(600);

        imgStart.relocate(175, 55);
        imgStart.setFitWidth(200);
        imgStart.setFitHeight(200);

        imgManual.relocate(415, 107);
        imgManual.setFitWidth(200);
        imgManual.setFitHeight(100);

        imgGameOver.setVisible(false);
        imgWin.setVisible(false);
        imgLose.setVisible(false);
        imgFlot1.relocate(258, 52);
        imgFlot2.relocate(357, 52);
        imgFlot3.relocate(460, 52);
        imgA1.setVisible(false);
        imgA2.setVisible(false);
        imgA3.setVisible(false);
        imgA4.setVisible(false);

        imgB1.setVisible(false);
        imgB2.setVisible(false);
        imgB3.setVisible(false);
        imgB4.setVisible(false);

        imgC1.setVisible(false);
        imgC2.setVisible(false);
        imgC3.setVisible(false);
        imgC4.setVisible(false);

        imgD1.setVisible(false);
        imgD2.setVisible(false);
        imgD3.setVisible(false);
        imgD4.setVisible(false);

        imgE1.setVisible(false);
        imgE2.setVisible(false);
        imgE3.setVisible(false);
        imgE4.setVisible(false);

        imgF1.setVisible(false);
        imgF2.setVisible(false);
        imgF3.setVisible(false);
        imgF4.setVisible(false);

        imgG1.setVisible(false);
        imgG2.setVisible(false);
        imgG3.setVisible(false);
        imgG4.setVisible(false);

        imgH1.setVisible(false);
        imgH2.setVisible(false);
        imgH3.setVisible(false);
        imgH4.setVisible(false);

        imgI1.setVisible(false);
        imgI2.setVisible(false);
        imgI3.setVisible(false);
        imgI4.setVisible(false);

        imgI5.setVisible(false);
        imgI6.setVisible(false);
        imgI7.setVisible(false);
        imgI8.setVisible(false);

        imgJ1.setVisible(false);
        imgJ2.setVisible(false);
        imgJ3.setVisible(false);
        imgJ4.setVisible(false);

        imgK1.setVisible(false);
        imgK2.setVisible(false);
        imgK3.setVisible(false);
        imgK4.setVisible(false);

        imgQ1.setVisible(false);
        imgQ2.setVisible(false);
        imgQ3.setVisible(false);
        imgQ4.setVisible(false);

        imgFlot1.setVisible(false);
        imgFlot2.setVisible(false);
        imgFlot3.setVisible(false);
        Scene scene = new Scene(pane, 800, 600);
        stage.setScene(scene);
        btn.setOnAction(e -> {
            count = 1;
            imgDrawCard.setVisible(true);
            java.util.TimerTask tt = new java.util.TimerTask() {
                @Override
                public void run() {

                    if (count == 1) {
                        if (rdCard[0] == 1) {
                            imgA1.relocate(252, 410);
                            imgA1.setVisible(true);
                            number1 = 1;
                        } else if (rdCard[0] == 2) {
                            imgA2.relocate(252, 410);
                            imgA2.setVisible(true);
                            number1 = 1;
                        } else if (rdCard[0] == 3) {
                            imgA3.relocate(252, 410);
                            imgA3.setVisible(true);
                            number1 = 1;
                        } else if (rdCard[0] == 4) {
                            imgA4.relocate(252, 410);
                            imgA4.setVisible(true);
                            number1 = 1;
                        } else if (rdCard[0] == 5) {
                            imgB1.relocate(252, 410);
                            imgB1.setVisible(true);
                            number1 = 2;
                        } else if (rdCard[0] == 6) {
                            imgB2.relocate(252, 410);
                            imgB2.setVisible(true);
                            number1 = 2;
                        } else if (rdCard[0] == 7) {
                            imgB3.relocate(252, 410);
                            imgB3.setVisible(true);
                            number1 = 2;
                        } else if (rdCard[0] == 8) {
                            imgB4.relocate(252, 410);
                            imgB4.setVisible(true);
                            number1 = 2;
                        } else if (rdCard[0] == 9) {
                            imgC1.relocate(252, 410);
                            imgC1.setVisible(true);
                            number1 = 3;
                        } else if (rdCard[0] == 10) {
                            imgC2.relocate(252, 410);
                            imgC2.setVisible(true);
                            number1 = 3;
                        } else if (rdCard[0] == 11) {
                            imgC3.relocate(252, 410);
                            imgC3.setVisible(true);
                            number1 = 3;
                        } else if (rdCard[0] == 12) {
                            imgC4.relocate(252, 410);
                            imgC4.setVisible(true);
                            number1 = 3;
                        } else if (rdCard[0] == 13) {
                            imgD1.relocate(252, 410);
                            imgD1.setVisible(true);
                            number1 = 4;
                        } else if (rdCard[0] == 14) {
                            imgD2.relocate(252, 410);
                            imgD2.setVisible(true);
                            number1 = 4;
                        } else if (rdCard[0] == 15) {
                            imgD3.relocate(252, 410);
                            imgD3.setVisible(true);
                            number1 = 4;
                        } else if (rdCard[0] == 16) {
                            imgD4.relocate(252, 410);
                            imgD4.setVisible(true);
                            number1 = 4;
                        } else if (rdCard[0] == 17) {
                            imgE1.relocate(252, 410);
                            imgE1.setVisible(true);
                            number1 = 5;
                        } else if (rdCard[0] == 18) {
                            imgE2.setVisible(true);
                            imgE2.relocate(252, 410);
                            number1 = 5;
                        } else if (rdCard[0] == 19) {
                            imgE3.relocate(252, 410);
                            imgE3.setVisible(true);
                            number1 = 5;
                        } else if (rdCard[0] == 20) {
                            imgE4.relocate(252, 410);
                            imgE4.setVisible(true);
                            number1 = 5;
                        } else if (rdCard[0] == 21) {
                            imgF1.relocate(252, 410);
                            imgF1.setVisible(true);
                            number1 = 6;
                        } else if (rdCard[0] == 22) {
                            imgF2.relocate(252, 410);
                            imgF2.setVisible(true);
                            number1 = 6;
                        } else if (rdCard[0] == 23) {
                            imgF3.relocate(252, 410);
                            imgF3.setVisible(true);
                            number1 = 6;
                        } else if (rdCard[0] == 24) {
                            imgF4.relocate(252, 410);
                            imgF4.setVisible(true);
                            number1 = 6;
                        } else if (rdCard[0] == 25) {
                            imgG1.relocate(252, 410);
                            imgG1.setVisible(true);
                            number1 = 7;
                        } else if (rdCard[0] == 26) {
                            imgG2.relocate(252, 410);
                            imgG2.setVisible(true);
                            number1 = 7;
                        } else if (rdCard[0] == 27) {
                            imgG3.relocate(252, 410);
                            imgG3.setVisible(true);
                            number1 = 7;
                        } else if (rdCard[0] == 28) {
                            imgG4.relocate(252, 410);
                            imgG4.setVisible(true);
                            number1 = 7;
                        } else if (rdCard[0] == 29) {
                            imgH1.relocate(252, 410);
                            imgH1.setVisible(true);
                            number1 = 8;
                        } else if (rdCard[0] == 30) {
                            imgH2.relocate(252, 410);
                            imgH2.setVisible(true);
                            number1 = 8;
                        } else if (rdCard[0] == 31) {
                            imgH3.relocate(252, 410);
                            imgH3.setVisible(true);
                            number1 = 8;
                        } else if (rdCard[0] == 32) {
                            imgH4.relocate(252, 410);
                            imgH4.setVisible(true);
                            number1 = 8;
                        } else if (rdCard[0] == 33) {
                            imgI1.relocate(252, 410);
                            imgI1.setVisible(true);
                            number1 = 9;
                        } else if (rdCard[0] == 34) {
                            imgI2.relocate(252, 410);
                            imgI2.setVisible(true);
                            number1 = 9;
                        } else if (rdCard[0] == 35) {
                            imgI3.relocate(252, 410);
                            imgI3.setVisible(true);
                            number1 = 9;
                        } else if (rdCard[0] == 36) {
                            imgI4.relocate(252, 410);
                            imgI4.setVisible(true);
                            number1 = 9;
                        } else if (rdCard[0] == 37) {
                            imgI5.relocate(252, 410);
                            imgI5.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 38) {
                            imgI6.relocate(252, 410);
                            imgI6.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 39) {
                            imgI7.relocate(252, 410);
                            imgI7.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 40) {
                            imgI8.relocate(252, 410);
                            imgI8.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 41) {
                            imgJ1.relocate(252, 410);
                            imgJ1.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 42) {
                            imgJ2.relocate(252, 410);
                            imgJ2.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 43) {
                            imgJ3.relocate(252, 410);
                            imgJ3.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 44) {
                            imgJ4.relocate(252, 410);
                            imgJ4.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 45) {
                            imgQ1.relocate(252, 410);
                            imgQ1.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 46) {
                            imgQ2.relocate(252, 410);
                            imgQ2.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 47) {
                            imgQ3.relocate(252, 410);
                            imgQ3.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 48) {
                            imgQ4.relocate(252, 410);
                            imgQ4.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 49) {
                            imgK1.relocate(252, 410);
                            imgK1.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 50) {
                            imgK2.relocate(252, 410);
                            imgK2.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 51) {
                            imgK3.relocate(252, 410);
                            imgK3.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[0] == 52) {
                            imgK4.relocate(252, 410);
                            imgK4.setVisible(true);
                            number1 = 0;
                        }
                    }
                    if (count == 2) {
                        if (rdCard[1] == 1) {
                            imgA1.relocate(258, 52);
                            imgA1.setVisible(true);
                            number2 = 1;
                        } else if (rdCard[1] == 2) {
                            imgA2.relocate(258, 52);
                            imgA2.setVisible(true);
                            number2 = 1;
                        } else if (rdCard[1] == 3) {
                            imgA3.relocate(258, 52);
                            imgA3.setVisible(true);
                            number2 = 1;
                        } else if (rdCard[1] == 4) {
                            imgA4.relocate(258, 52);
                            imgA4.setVisible(true);
                            number2 = 1;
                        } else if (rdCard[1] == 5) {
                            imgB1.relocate(258, 52);
                            imgB1.setVisible(true);
                            number2 = 2;
                        } else if (rdCard[1] == 6) {
                            imgB2.relocate(258, 52);
                            imgB2.setVisible(true);
                            number2 = 2;
                        } else if (rdCard[1] == 7) {
                            imgB3.relocate(258, 52);
                            imgB3.setVisible(true);
                            number2 = 2;
                        } else if (rdCard[1] == 8) {
                            imgB4.relocate(258, 52);
                            imgB4.setVisible(true);
                            number2 = 2;
                        } else if (rdCard[1] == 9) {
                            imgC1.relocate(258, 52);
                            imgC1.setVisible(true);
                            number2 = 3;
                        } else if (rdCard[1] == 10) {
                            imgC2.relocate(258, 52);
                            imgC2.setVisible(true);
                            number2 = 3;
                        } else if (rdCard[1] == 11) {
                            imgC3.relocate(258, 52);
                            imgC3.setVisible(true);
                            number2 = 3;
                        } else if (rdCard[1] == 12) {
                            imgC4.relocate(258, 52);
                            imgC4.setVisible(true);
                            number2 = 3;
                        } else if (rdCard[1] == 13) {
                            imgD1.relocate(258, 52);
                            imgD1.setVisible(true);
                            number2 = 4;
                        } else if (rdCard[1] == 14) {
                            imgD2.relocate(258, 52);
                            imgD2.setVisible(true);
                            number2 = 4;
                        } else if (rdCard[1] == 15) {
                            imgD3.relocate(258, 52);
                            imgD3.setVisible(true);
                            number2 = 4;
                        } else if (rdCard[1] == 16) {
                            imgD4.relocate(258, 52);
                            imgD4.setVisible(true);
                            number2 = 4;
                        } else if (rdCard[1] == 17) {
                            imgE1.relocate(258, 52);
                            imgE1.setVisible(true);
                            number2 = 5;
                        } else if (rdCard[1] == 18) {
                            imgE2.setVisible(true);
                            imgE2.relocate(258, 52);
                            number2 = 5;
                        } else if (rdCard[1] == 19) {
                            imgE3.relocate(258, 52);
                            imgE3.setVisible(true);
                            number2 = 5;
                        } else if (rdCard[1] == 20) {
                            imgE4.relocate(258, 52);
                            imgE4.setVisible(true);
                            number2 = 5;
                        } else if (rdCard[1] == 21) {
                            imgF1.relocate(258, 52);
                            imgF1.setVisible(true);
                            number2 = 6;
                        } else if (rdCard[1] == 22) {
                            imgF2.relocate(258, 52);
                            imgF2.setVisible(true);
                            number2 = 6;
                        } else if (rdCard[1] == 23) {
                            imgF3.relocate(258, 52);
                            imgF3.setVisible(true);
                            number2 = 6;
                        } else if (rdCard[1] == 24) {
                            imgF4.relocate(258, 52);
                            imgF4.setVisible(true);
                            number2 = 6;
                        } else if (rdCard[1] == 25) {
                            imgG1.relocate(258, 52);
                            imgG1.setVisible(true);
                            number2 = 7;
                        } else if (rdCard[1] == 26) {
                            imgG2.relocate(258, 52);
                            imgG2.setVisible(true);
                            number2 = 7;
                        } else if (rdCard[1] == 27) {
                            imgG3.relocate(258, 52);
                            imgG3.setVisible(true);
                            number2 = 7;
                        } else if (rdCard[1] == 28) {
                            imgG4.relocate(258, 52);
                            imgG4.setVisible(true);
                            number2 = 7;
                        } else if (rdCard[1] == 29) {
                            imgH1.relocate(258, 52);
                            imgH1.setVisible(true);
                            number2 = 8;
                        } else if (rdCard[1] == 30) {
                            imgH2.relocate(258, 52);
                            imgH2.setVisible(true);
                            number2 = 8;
                        } else if (rdCard[1] == 31) {
                            imgH3.relocate(258, 52);
                            imgH3.setVisible(true);
                            number2 = 8;
                        } else if (rdCard[1] == 32) {
                            imgH4.relocate(258, 52);
                            imgH4.setVisible(true);
                            number2 = 8;
                        } else if (rdCard[1] == 33) {
                            imgI1.relocate(258, 52);
                            imgI1.setVisible(true);
                            number2 = 9;
                        } else if (rdCard[1] == 34) {
                            imgI2.relocate(258, 52);
                            imgI2.setVisible(true);
                            number2 = 9;
                        } else if (rdCard[1] == 35) {
                            imgI3.relocate(258, 52);
                            imgI3.setVisible(true);
                            number2 = 9;
                        } else if (rdCard[1] == 36) {
                            imgI4.relocate(258, 52);
                            imgI4.setVisible(true);
                            number2 = 9;
                        } else if (rdCard[1] == 37) {
                            imgI5.relocate(258, 52);
                            imgI5.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 38) {
                            imgI6.relocate(258, 52);
                            imgI6.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 39) {
                            imgI7.relocate(258, 52);
                            imgI7.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 40) {
                            imgI8.relocate(258, 52);
                            imgI8.setVisible(true);
                            number1 = 0;
                        } else if (rdCard[1] == 41) {
                            imgJ1.relocate(258, 52);
                            imgJ1.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 42) {
                            imgJ2.relocate(258, 52);
                            imgJ2.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 43) {
                            imgJ3.relocate(258, 52);
                            imgJ3.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 44) {
                            imgJ4.relocate(258, 52);
                            imgJ4.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 45) {
                            imgQ1.relocate(258, 52);
                            imgQ1.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 46) {
                            imgQ2.relocate(258, 52);
                            imgQ2.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 47) {
                            imgQ3.relocate(258, 52);
                            imgQ3.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 48) {
                            imgQ4.relocate(258, 52);
                            imgQ4.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 49) {
                            imgK1.relocate(258, 52);
                            imgK1.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 50) {
                            imgK2.relocate(258, 52);
                            imgK2.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 51) {
                            imgK3.relocate(258, 52);
                            imgK3.setVisible(true);
                            number2 = 0;
                        } else if (rdCard[1] == 52) {
                            imgK4.relocate(258, 52);
                            imgK4.setVisible(true);
                            number2 = 0;
                        }
                        imgFlot1.setVisible(true);
                    }
                    if (count == 3) {
                        if (rdCard[2] == 1) {
                            imgA1.relocate(357, 410);
                            imgA1.setVisible(true);
                            number3 = 1;
                        } else if (rdCard[2] == 2) {
                            imgA2.relocate(357, 410);
                            imgA2.setVisible(true);
                            number3 = 1;
                        } else if (rdCard[2] == 3) {
                            imgA3.relocate(357, 410);
                            imgA3.setVisible(true);
                            number3 = 1;
                        } else if (rdCard[2] == 4) {
                            imgA4.relocate(357, 410);
                            imgA4.setVisible(true);
                            number3 = 1;
                        } else if (rdCard[2] == 5) {
                            imgB1.relocate(357, 410);
                            imgB1.setVisible(true);
                            number3 = 2;
                        } else if (rdCard[2] == 6) {
                            imgB2.relocate(357, 410);
                            imgB2.setVisible(true);
                            number3 = 2;
                        } else if (rdCard[2] == 7) {
                            imgB3.relocate(357, 410);
                            imgB3.setVisible(true);
                            number3 = 2;
                        } else if (rdCard[2] == 8) {
                            imgB4.relocate(357, 410);
                            imgB4.setVisible(true);
                            number3 = 2;
                        } else if (rdCard[2] == 9) {
                            imgC1.relocate(357, 410);
                            imgC1.setVisible(true);
                            number3 = 3;
                        } else if (rdCard[2] == 10) {
                            imgC2.relocate(357, 410);
                            imgC2.setVisible(true);
                            number3 = 3;
                        } else if (rdCard[2] == 11) {
                            imgC3.relocate(357, 410);
                            imgC3.setVisible(true);
                            number3 = 3;
                        } else if (rdCard[2] == 12) {
                            imgC4.relocate(357, 410);
                            imgC4.setVisible(true);
                            number3 = 3;
                        } else if (rdCard[2] == 13) {
                            imgD1.relocate(357, 410);
                            imgD1.setVisible(true);
                            number3 = 4;
                        } else if (rdCard[2] == 14) {
                            imgD2.relocate(357, 410);
                            imgD2.setVisible(true);
                            number3 = 4;
                        } else if (rdCard[2] == 15) {
                            imgD3.relocate(357, 410);
                            imgD3.setVisible(true);
                            number3 = 4;
                        } else if (rdCard[2] == 16) {
                            imgD4.relocate(357, 410);
                            imgD4.setVisible(true);
                            number3 = 4;
                        } else if (rdCard[2] == 17) {
                            imgE1.relocate(357, 410);
                            imgE1.setVisible(true);
                            number3 = 5;
                        } else if (rdCard[2] == 18) {
                            imgE2.setVisible(true);
                            imgE2.relocate(357, 410);
                            number3 = 5;
                        } else if (rdCard[2] == 19) {
                            imgE3.relocate(357, 410);
                            imgE3.setVisible(true);
                            number3 = 5;
                        } else if (rdCard[2] == 20) {
                            imgE4.relocate(357, 410);
                            imgE4.setVisible(true);
                            number3 = 5;
                        } else if (rdCard[2] == 21) {
                            imgF1.relocate(357, 410);
                            imgF1.setVisible(true);
                            number3 = 6;
                        } else if (rdCard[2] == 22) {
                            imgF2.relocate(357, 410);
                            imgF2.setVisible(true);
                            number3 = 6;
                        } else if (rdCard[2] == 23) {
                            imgF3.relocate(357, 410);
                            imgF3.setVisible(true);
                            number3 = 6;
                        } else if (rdCard[2] == 24) {
                            imgF4.relocate(357, 410);
                            imgF4.setVisible(true);
                            number3 = 6;
                        } else if (rdCard[2] == 25) {
                            imgG1.relocate(357, 410);
                            imgG1.setVisible(true);
                            number3 = 7;
                        } else if (rdCard[2] == 26) {
                            imgG2.relocate(357, 410);
                            imgG2.setVisible(true);
                            number3 = 7;
                        } else if (rdCard[2] == 27) {
                            imgG3.relocate(357, 410);
                            imgG3.setVisible(true);
                            number3 = 7;
                        } else if (rdCard[2] == 28) {
                            imgG4.relocate(357, 410);
                            imgG4.setVisible(true);
                            number3 = 7;
                        } else if (rdCard[2] == 29) {
                            imgH1.relocate(357, 410);
                            imgH1.setVisible(true);
                            number3 = 8;
                        } else if (rdCard[2] == 30) {
                            imgH2.relocate(357, 410);
                            imgH2.setVisible(true);
                            number3 = 8;
                        } else if (rdCard[2] == 31) {
                            imgH3.relocate(357, 410);
                            imgH3.setVisible(true);
                            number3 = 8;
                        } else if (rdCard[2] == 32) {
                            imgH4.relocate(357, 410);
                            imgH4.setVisible(true);
                            number3 = 8;
                        } else if (rdCard[2] == 33) {
                            imgI1.relocate(357, 410);
                            imgI1.setVisible(true);
                            number3 = 9;
                        } else if (rdCard[2] == 34) {
                            imgI2.relocate(357, 410);
                            imgI2.setVisible(true);
                            number3 = 9;
                        } else if (rdCard[2] == 35) {
                            imgI3.relocate(357, 410);
                            imgI3.setVisible(true);
                            number3 = 9;
                        } else if (rdCard[2] == 36) {
                            imgI4.relocate(357, 410);
                            imgI4.setVisible(true);
                            number3 = 9;
                        } else if (rdCard[2] == 37) {
                            imgI5.relocate(357, 410);
                            imgI5.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 38) {
                            imgI6.relocate(357, 410);
                            imgI6.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 39) {
                            imgI7.relocate(357, 410);
                            imgI7.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 40) {
                            imgI8.relocate(357, 410);
                            imgI8.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 41) {
                            imgJ1.relocate(357, 410);
                            imgJ1.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 42) {
                            imgJ2.relocate(357, 410);
                            imgJ2.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 43) {
                            imgJ3.relocate(357, 410);
                            imgJ3.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 44) {
                            imgJ4.relocate(357, 410);
                            imgJ4.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 45) {
                            imgQ1.relocate(357, 410);
                            imgQ1.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 46) {
                            imgQ2.relocate(357, 410);
                            imgQ2.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 47) {
                            imgQ3.relocate(357, 410);
                            imgQ3.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 48) {
                            imgQ4.relocate(357, 410);
                            imgQ4.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 49) {
                            imgK1.relocate(357, 410);
                            imgK1.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 50) {
                            imgK2.relocate(357, 410);
                            imgK2.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 51) {
                            imgK3.relocate(357, 410);
                            imgK3.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[2] == 52) {
                            imgK4.relocate(357, 410);
                            imgK4.setVisible(true);
                            number3 = 0;
                        }
                    }

                    if (count == 4) {
                        if (rdCard[3] == 1) {
                            imgA1.relocate(357, 52);
                            imgA1.setVisible(true);
                            number4 = 1;
                        } else if (rdCard[3] == 2) {
                            imgA2.relocate(357, 52);
                            imgA2.setVisible(true);
                            number4 = 1;
                        } else if (rdCard[3] == 3) {
                            imgA3.relocate(357, 52);
                            imgA3.setVisible(true);
                            number4 = 1;
                        } else if (rdCard[3] == 4) {
                            imgA4.relocate(357, 52);
                            imgA4.setVisible(true);
                            number4 = 1;
                        } else if (rdCard[3] == 5) {
                            imgB1.relocate(357, 52);
                            imgB1.setVisible(true);
                            number4 = 2;
                        } else if (rdCard[3] == 6) {
                            imgB2.relocate(357, 52);
                            imgB2.setVisible(true);
                            number4 = 2;
                        } else if (rdCard[3] == 7) {
                            imgB3.relocate(357, 52);
                            imgB3.setVisible(true);
                            number4 = 2;
                        } else if (rdCard[3] == 8) {
                            imgB4.relocate(357, 52);
                            imgB4.setVisible(true);
                            number4 = 2;
                        } else if (rdCard[3] == 9) {
                            imgC1.relocate(357, 52);
                            imgC1.setVisible(true);
                            number4 = 3;
                        } else if (rdCard[3] == 10) {
                            imgC2.relocate(357, 52);
                            imgC2.setVisible(true);
                            number4 = 3;
                        } else if (rdCard[3] == 11) {
                            imgC3.relocate(357, 52);
                            imgC3.setVisible(true);
                            number4 = 3;
                        } else if (rdCard[3] == 12) {
                            imgC4.relocate(357, 52);
                            imgC4.setVisible(true);
                            number4 = 3;
                        } else if (rdCard[3] == 13) {
                            imgD1.relocate(357, 52);
                            imgD1.setVisible(true);
                            number4 = 4;
                        } else if (rdCard[3] == 14) {
                            imgD2.relocate(357, 52);
                            imgD2.setVisible(true);
                            number4 = 4;
                        } else if (rdCard[3] == 15) {
                            imgD3.relocate(357, 52);
                            imgD3.setVisible(true);
                            number3 = 4;
                        } else if (rdCard[3] == 16) {
                            imgD4.relocate(357, 52);
                            imgD4.setVisible(true);
                            number4 = 4;
                        } else if (rdCard[3] == 17) {
                            imgE1.relocate(357, 52);
                            imgE1.setVisible(true);
                            number4 = 5;
                        } else if (rdCard[3] == 18) {
                            imgE2.setVisible(true);
                            imgE2.relocate(357, 52);
                            number4 = 5;
                        } else if (rdCard[3] == 19) {
                            imgE3.relocate(357, 52);
                            imgE3.setVisible(true);
                            number4 = 5;
                        } else if (rdCard[3] == 20) {
                            imgE4.relocate(357, 52);
                            imgE4.setVisible(true);
                            number4 = 5;
                        } else if (rdCard[3] == 21) {
                            imgF1.relocate(357, 52);
                            imgF1.setVisible(true);
                            number4 = 6;
                        } else if (rdCard[3] == 22) {
                            imgF2.relocate(357, 52);
                            imgF2.setVisible(true);
                            number4 = 6;
                        } else if (rdCard[3] == 23) {
                            imgF3.relocate(357, 52);
                            imgF3.setVisible(true);
                            number4 = 6;
                        } else if (rdCard[3] == 24) {
                            imgF4.relocate(357, 52);
                            imgF4.setVisible(true);
                            number4 = 6;
                        } else if (rdCard[3] == 25) {
                            imgG1.relocate(357, 52);
                            imgG1.setVisible(true);
                            number4 = 7;
                        } else if (rdCard[3] == 26) {
                            imgG2.relocate(357, 52);
                            imgG2.setVisible(true);
                            number4 = 7;
                        } else if (rdCard[3] == 27) {
                            imgG3.relocate(357, 52);
                            imgG3.setVisible(true);
                            number4 = 7;
                        } else if (rdCard[3] == 28) {
                            imgG4.relocate(357, 52);
                            imgG4.setVisible(true);
                            number4 = 7;
                        } else if (rdCard[3] == 29) {
                            imgH1.relocate(357, 52);
                            imgH1.setVisible(true);
                            number4 = 8;
                        } else if (rdCard[3] == 30) {
                            imgH2.relocate(357, 52);
                            imgH2.setVisible(true);
                            number4 = 8;
                        } else if (rdCard[3] == 31) {
                            imgH3.relocate(357, 52);
                            imgH3.setVisible(true);
                            number4 = 8;
                        } else if (rdCard[3] == 32) {
                            imgH4.relocate(357, 52);
                            imgH4.setVisible(true);
                            number4 = 8;
                        } else if (rdCard[3] == 33) {
                            imgI1.relocate(357, 52);
                            imgI1.setVisible(true);
                            number4 = 9;
                        } else if (rdCard[3] == 34) {
                            imgI2.relocate(357, 52);
                            imgI2.setVisible(true);
                            number4 = 9;
                        } else if (rdCard[3] == 35) {
                            imgI3.relocate(357, 52);
                            imgI3.setVisible(true);
                            number4 = 9;
                        } else if (rdCard[3] == 36) {
                            imgI4.relocate(357, 52);
                            imgI4.setVisible(true);
                            number4 = 9;
                        } else if (rdCard[3] == 37) {
                            imgI5.relocate(357, 52);
                            imgI5.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 38) {
                            imgI6.relocate(357, 52);
                            imgI6.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 39) {
                            imgI7.relocate(357, 52);
                            imgI7.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 40) {
                            imgI8.relocate(357, 52);
                            imgI8.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 41) {
                            imgJ1.relocate(357, 52);
                            imgJ1.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 42) {
                            imgJ2.relocate(357, 52);
                            imgJ2.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 43) {
                            imgJ3.relocate(357, 52);
                            imgJ3.setVisible(true);
                            number3 = 0;
                        } else if (rdCard[3] == 44) {
                            imgJ4.relocate(357, 52);
                            imgJ4.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 45) {
                            imgQ1.relocate(357, 52);
                            imgQ1.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 46) {
                            imgQ2.relocate(357, 52);
                            imgQ2.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 47) {
                            imgQ3.relocate(357, 52);
                            imgQ3.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 48) {
                            imgQ4.relocate(357, 52);
                            imgQ4.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 49) {
                            imgK1.relocate(357, 52);
                            imgK1.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 50) {
                            imgK2.relocate(357, 52);
                            imgK2.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 51) {
                            imgK3.relocate(357, 52);
                            imgK3.setVisible(true);
                            number4 = 0;
                        } else if (rdCard[3] == 52) {
                            imgK4.relocate(357, 52);
                            imgK4.setVisible(true);
                            number4 = 0;
                        }
                        imgFlot2.setVisible(true);
                    }

                    if (count <= 4 && count >= 1) {
                        count++;

                    }

                }

            };
            tm.schedule(tt, 0, 1000);
        });

        imgBet.setOnMouseClicked(e -> {                                 // button calculate
            imgFlot1.setVisible(false);
            imgFlot2.setVisible(false);
            imgFlot3.setVisible(false);

            numberMe = number1 + number3 + number5;
            numberU = number2 + number4 + number6;

            if (numberMe >= 20) {
                numberMe = numberMe - 20;
            } else if (numberMe >= 10) {
                numberMe = numberMe - 10;
            }
            if (numberU >= 20) {
                numberU = numberU - 20;
            } else if (numberU >= 10) {
                numberU = numberU - 10;
            }
            System.out.println(numberMe);
            System.out.println(numberU);

            if (numberMe >= numberU) {
                System.out.println("you win");
                numberAll = Money + Integer.parseInt(txt.getText());
                Money = numberAll;
                txt.setText("");
                lblMoney.setText(Integer.toString(numberAll));
            } else {
                System.out.println("you lose");
                numberAll = Money - Integer.parseInt(txt.getText());
                Money = numberAll;
                txt.setText("");
                lblMoney.setText(Integer.toString(numberAll));
            }
            if (Money >= 2000) {
                imgGameOver.setVisible(true);
                imgWin.setVisible(true);
                lblMoney.setVisible(false);
                txt.setVisible(false);
                imgMoney.setVisible(false);
                btnBack.setVisible(true);

            } else if (Money <= 0) {
                imgGameOver.setVisible(true);
                imgLose.setVisible(true);
                lblMoney.setVisible(false);
                txt.setVisible(false);
                imgMoney.setVisible(false);
                btnBack.setVisible(true);
            }
        });

        imgDrawCard.setOnMouseClicked(e -> {

            if (rdCard[4] == 1) {
                imgA1.relocate(460, 410);
                imgA1.setVisible(true);
                number5 = 1;
            } else if (rdCard[4] == 2) {
                imgA2.relocate(460, 410);
                imgA2.setVisible(true);
                number5 = 1;
            } else if (rdCard[4] == 3) {
                imgA3.relocate(460, 410);
                imgA3.setVisible(true);
                number5 = 1;
            } else if (rdCard[4] == 4) {
                imgA4.relocate(460, 410);
                imgA4.setVisible(true);
                number5 = 1;
            } else if (rdCard[4] == 5) {
                imgB1.relocate(460, 410);
                imgB1.setVisible(true);
                number5 = 2;
            } else if (rdCard[4] == 6) {
                imgB2.relocate(460, 410);
                imgB2.setVisible(true);
                number5 = 2;
            } else if (rdCard[4] == 7) {
                imgB3.relocate(460, 410);
                imgB3.setVisible(true);
                number5 = 2;
            } else if (rdCard[4] == 8) {
                imgB4.relocate(460, 410);
                imgB4.setVisible(true);
                number5 = 2;
            } else if (rdCard[4] == 9) {
                imgC1.relocate(460, 410);
                imgC1.setVisible(true);
                number5 = 3;
            } else if (rdCard[4] == 10) {
                imgC2.relocate(460, 410);
                imgC2.setVisible(true);
                number5 = 3;
            } else if (rdCard[4] == 11) {
                imgC3.relocate(460, 410);
                imgC3.setVisible(true);
                number5 = 3;
            } else if (rdCard[4] == 12) {
                imgC4.relocate(460, 410);
                imgC4.setVisible(true);
                number5 = 3;
            } else if (rdCard[4] == 13) {
                imgD1.relocate(460, 410);
                imgD1.setVisible(true);
                number5 = 4;
            } else if (rdCard[4] == 14) {
                imgD2.relocate(460, 410);
                imgD2.setVisible(true);
                number5 = 4;
            } else if (rdCard[4] == 15) {
                imgD3.relocate(460, 410);
                imgD3.setVisible(true);
                number5 = 4;
            } else if (rdCard[4] == 16) {
                imgD4.relocate(460, 410);
                imgD4.setVisible(true);
                number5 = 4;
            } else if (rdCard[4] == 17) {
                imgE1.relocate(460, 410);
                imgE1.setVisible(true);
                number5 = 5;
            } else if (rdCard[4] == 18) {
                imgE2.setVisible(true);
                imgE2.relocate(460, 410);
                number5 = 5;
            } else if (rdCard[4] == 19) {
                imgE3.relocate(460, 410);
                imgE3.setVisible(true);
                number5 = 5;
            } else if (rdCard[4] == 20) {
                imgE4.relocate(460, 410);
                imgE4.setVisible(true);
                number5 = 5;
            } else if (rdCard[4] == 21) {
                imgF1.relocate(460, 410);
                imgF1.setVisible(true);
                number5 = 6;
            } else if (rdCard[4] == 22) {
                imgF2.relocate(460, 410);
                imgF2.setVisible(true);
                number5 = 6;
            } else if (rdCard[4] == 23) {
                imgF3.relocate(460, 410);
                imgF3.setVisible(true);
                number5 = 6;
            } else if (rdCard[4] == 24) {
                imgF4.relocate(460, 410);
                imgF4.setVisible(true);
                number5 = 6;
            } else if (rdCard[4] == 25) {
                imgG1.relocate(460, 410);
                imgG1.setVisible(true);
                number5 = 7;
            } else if (rdCard[4] == 26) {
                imgG2.relocate(460, 410);
                imgG2.setVisible(true);
                number5 = 7;
            } else if (rdCard[4] == 27) {
                imgG3.relocate(460, 410);
                imgG3.setVisible(true);
                number5 = 7;
            } else if (rdCard[4] == 28) {
                imgG4.relocate(460, 410);
                imgG4.setVisible(true);
                number5 = 7;
            } else if (rdCard[4] == 29) {
                imgH1.relocate(460, 410);
                imgH1.setVisible(true);
                number5 = 8;
            } else if (rdCard[4] == 30) {
                imgH2.relocate(460, 410);
                imgH2.setVisible(true);
                number5 = 8;
            } else if (rdCard[4] == 31) {
                imgH3.relocate(460, 410);
                imgH3.setVisible(true);
                number5 = 8;
            } else if (rdCard[4] == 32) {
                imgH4.relocate(460, 410);
                imgH4.setVisible(true);
                number5 = 8;
            } else if (rdCard[4] == 33) {
                imgI1.relocate(460, 410);
                imgI1.setVisible(true);
                number5 = 9;
            } else if (rdCard[4] == 34) {
                imgI2.relocate(460, 410);
                imgI2.setVisible(true);
                number5 = 9;
            } else if (rdCard[4] == 35) {
                imgI3.relocate(460, 410);
                imgI3.setVisible(true);
                number5 = 9;
            } else if (rdCard[4] == 36) {
                imgI4.relocate(460, 410);
                imgI4.setVisible(true);
                number5 = 9;
            } else if (rdCard[4] == 37) {
                imgI5.relocate(460, 410);
                imgI5.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 38) {
                imgI6.relocate(460, 410);
                imgI6.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 39) {
                imgI7.relocate(460, 410);
                imgI7.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 40) {
                imgI8.relocate(460, 410);
                imgI8.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 41) {
                imgJ1.relocate(460, 410);
                imgJ1.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 42) {
                imgJ2.setVisible(true);
                imgJ2.relocate(460, 410);

                number5 = 0;
            } else if (rdCard[4] == 43) {
                imgJ3.relocate(460, 410);
                imgJ3.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 44) {
                imgJ4.relocate(460, 410);
                imgJ4.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 45) {
                imgQ1.relocate(460, 410);
                imgQ1.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 46) {
                imgQ2.relocate(460, 410);
                imgQ2.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 47) {
                imgQ3.relocate(460, 410);
                imgQ3.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 48) {
                imgQ4.relocate(460, 410);
                imgQ4.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 49) {
                imgK1.relocate(460, 410);
                imgK1.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 50) {
                imgK2.relocate(460, 410);
                imgK2.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 51) {
                imgK3.relocate(460, 410);
                imgK3.setVisible(true);
                number5 = 0;
            } else if (rdCard[4] == 52) {
                imgK4.relocate(460, 410);
                imgK1.setVisible(true);
                number5 = 0;

            }

            if (numberU < 6) {
                if (rdCard[5] == 1) {
                    imgA1.relocate(460, 52);
                    imgA1.setVisible(true);
                    number6 = 1;
                } else if (rdCard[5] == 2) {
                    imgA2.relocate(460, 52);
                    imgA2.setVisible(true);
                    number6 = 1;
                } else if (rdCard[5] == 3) {
                    imgA3.relocate(460, 52);
                    imgA3.setVisible(true);
                    number6 = 1;
                } else if (rdCard[5] == 4) {
                    imgA4.relocate(460, 52);
                    imgA4.setVisible(true);
                    number6 = 1;
                } else if (rdCard[5] == 5) {
                    imgB1.relocate(460, 52);
                    imgB1.setVisible(true);
                    number6 = 2;
                } else if (rdCard[5] == 6) {
                    imgB2.relocate(460, 52);
                    imgB2.setVisible(true);
                    number6 = 2;
                } else if (rdCard[5] == 7) {
                    imgB3.relocate(460, 52);
                    imgB3.setVisible(true);
                    number6 = 2;
                } else if (rdCard[5] == 8) {
                    imgB4.relocate(460, 52);
                    imgB4.setVisible(true);
                    number6 = 2;
                } else if (rdCard[5] == 9) {
                    imgC1.relocate(460, 52);
                    imgC1.setVisible(true);
                    number6 = 3;
                } else if (rdCard[5] == 10) {
                    imgC2.relocate(460, 52);
                    imgC2.setVisible(true);
                    number6 = 3;
                } else if (rdCard[5] == 11) {
                    imgC3.relocate(460, 52);
                    imgC3.setVisible(true);
                    number6 = 3;
                } else if (rdCard[5] == 12) {
                    imgC4.relocate(460, 52);
                    imgC4.setVisible(true);
                    number6 = 3;
                } else if (rdCard[5] == 13) {
                    imgD1.relocate(460, 52);
                    imgD1.setVisible(true);
                    number6 = 4;
                } else if (rdCard[5] == 14) {
                    imgD2.relocate(460, 52);
                    imgD2.setVisible(true);
                    number6 = 4;
                } else if (rdCard[5] == 15) {
                    imgD3.relocate(460, 52);
                    imgD3.setVisible(true);
                    number6 = 4;
                } else if (rdCard[5] == 16) {
                    imgD4.relocate(460, 52);
                    imgD4.setVisible(true);
                    number6 = 4;
                } else if (rdCard[5] == 17) {
                    imgE1.relocate(460, 52);
                    imgE1.setVisible(true);
                    number6 = 5;
                } else if (rdCard[5] == 18) {
                    imgE2.setVisible(true);
                    imgE2.relocate(460, 52);
                    number6 = 5;
                } else if (rdCard[5] == 19) {
                    imgE3.relocate(460, 52);
                    imgE3.setVisible(true);
                    number6 = 5;
                } else if (rdCard[5] == 20) {
                    imgE4.relocate(460, 52);
                    imgE4.setVisible(true);
                    number6 = 5;
                } else if (rdCard[5] == 21) {
                    imgF1.relocate(460, 52);
                    imgF1.setVisible(true);
                    number6 = 6;
                } else if (rdCard[5] == 22) {
                    imgF2.relocate(460, 52);
                    imgF2.setVisible(true);
                    number6 = 6;
                } else if (rdCard[5] == 23) {
                    imgF3.relocate(460, 52);
                    imgF3.setVisible(true);
                    number6 = 6;
                } else if (rdCard[5] == 24) {
                    imgF4.relocate(460, 52);
                    imgF4.setVisible(true);
                    number6 = 6;
                } else if (rdCard[5] == 25) {
                    imgG1.relocate(460, 52);
                    imgG1.setVisible(true);
                    number6 = 7;
                } else if (rdCard[5] == 26) {
                    imgG2.relocate(460, 52);
                    imgG2.setVisible(true);
                    number6 = 7;
                } else if (rdCard[5] == 27) {
                    imgG3.relocate(460, 52);
                    imgG3.setVisible(true);
                    number6 = 7;
                } else if (rdCard[5] == 28) {
                    imgG4.relocate(460, 52);
                    imgG4.setVisible(true);
                    number6 = 7;
                } else if (rdCard[5] == 29) {
                    imgH1.relocate(460, 52);
                    imgH1.setVisible(true);
                    number6 = 8;
                } else if (rdCard[4] == 30) {
                    imgH2.relocate(460, 52);
                    imgH2.setVisible(true);
                    number6 = 8;
                } else if (rdCard[5] == 31) {
                    imgH3.relocate(460, 52);
                    imgH3.setVisible(true);
                    number6 = 8;
                } else if (rdCard[5] == 32) {
                    imgH4.relocate(460, 52);
                    imgH4.setVisible(true);
                    number6 = 8;
                } else if (rdCard[5] == 33) {
                    imgI1.relocate(460, 52);
                    imgI1.setVisible(true);
                    number6 = 9;
                } else if (rdCard[5] == 34) {
                    imgI2.relocate(460, 52);
                    imgI2.setVisible(true);
                    number6 = 9;
                } else if (rdCard[5] == 35) {
                    imgI3.relocate(460, 52);
                    imgI3.setVisible(true);
                    number6 = 9;
                } else if (rdCard[5] == 36) {
                    imgI4.relocate(460, 52);
                    imgI4.setVisible(true);
                    number6 = 9;
                } else if (rdCard[5] == 37) {
                    imgI5.relocate(460, 52);
                    imgI5.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 38) {
                    imgI6.relocate(460, 52);
                    imgI6.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 39) {
                    imgI7.relocate(460, 52);
                    imgI7.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 40) {
                    imgI8.relocate(460, 52);
                    imgI8.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 41) {
                    imgJ1.relocate(460, 52);
                    imgJ1.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 42) {
                    imgJ2.setVisible(true);
                    imgJ2.relocate(460, 52);

                    number6 = 0;
                } else if (rdCard[5] == 43) {
                    imgJ3.relocate(460, 52);
                    imgJ3.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 44) {
                    imgJ4.relocate(460, 52);
                    imgJ4.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 45) {
                    imgQ1.relocate(460, 52);
                    imgQ1.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 46) {
                    imgQ2.relocate(460, 52);
                    imgQ2.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 47) {
                    imgQ3.relocate(460, 52);
                    imgQ3.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 48) {
                    imgQ4.relocate(460, 52);
                    imgQ4.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 49) {
                    imgK1.relocate(460, 52);
                    imgK1.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 50) {
                    imgK2.relocate(460, 52);
                    imgK2.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 51) {
                    imgK3.relocate(460, 52);
                    imgK3.setVisible(true);
                    number6 = 0;
                } else if (rdCard[5] == 52) {
                    imgK4.relocate(460, 52);
                    imgK1.setVisible(true);
                    number6 = 0;

                }
                imgFlot3.setVisible(true);
            }

        });
        imgNext.setOnMouseClicked(e -> {
            imgFlot1.relocate(258, 52);
            imgFlot2.relocate(357, 52);
            imgFlot3.relocate(460, 52);
            imgA1.setVisible(false);
            imgA2.setVisible(false);
            imgA3.setVisible(false);
            imgA4.setVisible(false);

            imgB1.setVisible(false);
            imgB2.setVisible(false);
            imgB3.setVisible(false);
            imgB4.setVisible(false);

            imgC1.setVisible(false);
            imgC2.setVisible(false);
            imgC3.setVisible(false);
            imgC4.setVisible(false);

            imgD1.setVisible(false);
            imgD2.setVisible(false);
            imgD3.setVisible(false);
            imgD4.setVisible(false);

            imgE1.setVisible(false);
            imgE2.setVisible(false);
            imgE3.setVisible(false);
            imgE4.setVisible(false);

            imgF1.setVisible(false);
            imgF2.setVisible(false);
            imgF3.setVisible(false);
            imgF4.setVisible(false);

            imgG1.setVisible(false);
            imgG2.setVisible(false);
            imgG3.setVisible(false);
            imgG4.setVisible(false);

            imgH1.setVisible(false);
            imgH2.setVisible(false);
            imgH3.setVisible(false);
            imgH4.setVisible(false);

            imgI1.setVisible(false);
            imgI2.setVisible(false);
            imgI3.setVisible(false);
            imgI4.setVisible(false);

            imgI5.setVisible(false);
            imgI6.setVisible(false);
            imgI7.setVisible(false);
            imgI8.setVisible(false);

            imgJ1.setVisible(false);
            imgJ2.setVisible(false);
            imgJ3.setVisible(false);
            imgJ4.setVisible(false);

            imgK1.setVisible(false);
            imgK2.setVisible(false);
            imgK3.setVisible(false);
            imgK4.setVisible(false);

            imgQ1.setVisible(false);
            imgQ2.setVisible(false);
            imgQ3.setVisible(false);
            imgQ4.setVisible(false);

            imgFlot1.setVisible(false);
            imgFlot2.setVisible(false);
            imgFlot3.setVisible(false);
            count = 0;
            numberMe = 0;
            numberU = 0;
            number1 = 0;
            number2 = 0;
            number3 = 0;
            number4 = 0;
            number5 = 0;
            number6 = 0;
            randomCard();
        });

        imgStart.setOnMouseClicked(e -> {
            imgStart.setVisible(false);
            imgStartBg.setVisible(false);
            imgManual.setVisible(false);
            txtAr.setVisible(false);

        });
        imgManual.setOnMouseClicked(e -> {
            txtAr.setVisible(true);

        });

        stage.show();

    }

    public void randomCard() {
        rdCard[0] = -1;
        rdCard[1] = -1;
        rdCard[2] = -1;
        rdCard[3] = -1;
        rdCard[4] = -1;
        rdCard[5] = -1;
        while (rdCard[0] == -1 || rdCard[1] == -1 || rdCard[2] == -1 || rdCard[3] == -1 || rdCard[4] == -1 || rdCard[5] == -1) {
            if (rdCard[0] == -1) {
                rdCard[0] = rd.nextInt(52) + 1;
            } else if (rdCard[1] == -1 || rdCard[1] == rdCard[0]) {
                rdCard[1] = rd.nextInt(52) + 1;
            } else if (rdCard[2] == -1 || rdCard[2] == rdCard[0] || rdCard[2] == rdCard[1]) {
                rdCard[2] = rd.nextInt(52) + 1;
            } else if (rdCard[3] == -1 || rdCard[3] == rdCard[0] || rdCard[3] == rdCard[1] || rdCard[3] == rdCard[2]) {
                rdCard[3] = rd.nextInt(52) + 1;
            } else if (rdCard[4] == -1 || rdCard[4] == rdCard[0] || rdCard[4] == rdCard[1] || rdCard[4] == rdCard[2] || rdCard[4] == rdCard[3]) {
                rdCard[4] = rd.nextInt(52) + 1;
            } else if (rdCard[5] == -1 || rdCard[5] == rdCard[0] || rdCard[5] == rdCard[1] || rdCard[5] == rdCard[2] || rdCard[5] == rdCard[3] || rdCard[5] == rdCard[4]) {
                rdCard[5] = rd.nextInt(52) + 1;
            }
        }
    }

}
