import org.testng.annotations.Test;

public class RecyclerTests extends TestBase {
    @Test//(enabled = false)
    public void testHorizontalSwipeRL() throws InterruptedException {

        app.recycler().selectItemSwipe();
        app.recycler().selectSwipebleBase();
        app.recycler().pause(2000);
        app.recycler().swipeFromRightToLeft();

    }

    @Test//(enabled = false)
    public void testHorizontalSwipeLR() throws InterruptedException {

        app.recycler().selectItemSwipe();
        app.recycler().selectSwipebleBase();
        app.recycler().pause(2000);
        app.recycler().swipeFromLeftToRight();
    }

    @Test//(enabled = false)
    public void testDragNDrop() throws InterruptedException {
        app.recycler().selectSwipebleBase();//selectDraggbleBase

        app.recycler().dropDawn();
    }

    @Test//(enabled = false)
    public void testDragNDrop2() throws InterruptedException {
        app.recycler().selectSwipebleBase();//selectDraggbleBase


        app.recycler().dropDawnWithCount(4);
    }


    @Test//(enabled = false)
    public void testDragNDrop3() throws InterruptedException {
        app.recycler().selectSwipebleBase();//selectDraggbleBase


        app.recycler().dropDawntoEndWin();
    }


    @Test(enabled = false)
    public void testDragNDrop4() throws InterruptedException {
        app.recycler().selectSwipebleBase();//selectDraggbleBase


        app.recycler().dropDawntoEnd();
    }


}

