package com.telran.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;

import java.util.List;

public class RecyclerHelper extends HelperBase {
    public RecyclerHelper(AppiumDriver driver) {
        super(driver);
    }

    public void selectItemSwipe() {
        MobileElement swipe = (MobileElement) driver.findElementByAccessibilityId("Swipe");
        //printDimensions(swipe);
        swipe.click();
    }

    public void selectSwipebleBase() {
        MobileElement dragg = (MobileElement) driver
                .findElementsById("com.h6ah4i.android.example.advrecyclerview:id/button").get(1);
        dragg.click();
    }

    public void swipeFromRightToLeft() {
        List<MobileElement> list =
                driver.findElements(By.id("com.h6ah4i.android.example.advrecyclerview:id/container"));
        MobileElement el = list.get(0);
        Rectangle rect = el.getRect();
        int xFrom = rect.getX() + rect.getWidth() - 20;
        int yFrom = rect.getY() + rect.getHeight() / 2;
        int xTo = rect.getX()+20;
        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xTo,yFrom))
                .release()
                .perform();
    }


    public void swipeFromLeftToRight() {
        List<MobileElement> list =
                driver.findElements(By.id("com.h6ah4i.android.example.advrecyclerview:id/container"));
        MobileElement el = list.get(0);
        Rectangle rect = el.getRect();
        int xTo = rect.getX() + rect.getWidth() - 20;
        int yFrom = rect.getY() + rect.getHeight() / 2;
        int xFrom = rect.getX()+20;
        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xTo,yFrom))
                .release()
                .perform();


    }

    public void dropDawn() {
        List<MobileElement> list =
                driver.findElements(By.id("com.h6ah4i.android.example.advrecyclerview:id/drag_handle"));
        MobileElement el = list.get(0);
        Rectangle rect = el.getRect();
        int yFrom = rect.getY() + rect.getHeight()/2;
        int yTo = yFrom + rect.getHeight() ;
        int xFrom = rect.getX()+rect.getWidth()/2;
        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xFrom,yTo))
                .release()
                .perform();

    }public void dropDawnWithCount(int count) {
        List<MobileElement> list =
                driver.findElements(By.id("com.h6ah4i.android.example.advrecyclerview:id/drag_handle"));
        MobileElement el = list.get(0);
        Rectangle rect = el.getRect();
        int yFrom = rect.getY() + rect.getHeight()/2;
        int yTo = yFrom + rect.getHeight()*count ;
        int xFrom = rect.getX()+rect.getWidth()/2;
        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xFrom,yTo))
                .release()
                .perform();

    }
    public void dropDawntoEndWin() {
        List<MobileElement> list =
                driver.findElements(By.id("com.h6ah4i.android.example.advrecyclerview:id/drag_handle"));
        MobileElement el = list.get(0);
        Rectangle rect = el.getRect();
        int yFrom = rect.getY() + rect.getHeight()/2;
                int xFrom = rect.getX()+rect.getWidth()/2;
        Dimension size = driver.manage().window().getSize();
        int hightWin = size.getHeight();
        int yTo = hightWin - yFrom;//yFrom + rect.getHeight() ;
        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xFrom,yTo))
                .release()
                .perform();

    }
    public void dropDawntoEnd() {//dopissat poslednuju tochku. proverku na ne nulevoj massiv
        List<MobileElement> list =
                driver.findElements(By.id("com.h6ah4i.android.example.advrecyclerview:id/drag_handle"));
        MobileElement el = list.get(0);
        Rectangle rect = el.getRect();
        int yFrom = rect.getY() + rect.getHeight()/2;
        int xFrom = rect.getX()+rect.getWidth()/2;
        Dimension size = driver.manage().window().getSize();
        int hightWin = size.getHeight();
        int yTo = hightWin - 20 ;//yFrom + rect.getHeight() ;
        TouchAction<?>touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xFrom,yTo))
                .release()
                .perform();

    }
}
