package sun.awt.peer.cacio;

import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.util.List;

class ScreenManagedWindowContainer extends AbstractManagedWindowContainer {

    private PlatformScreen screen;

    ScreenManagedWindowContainer(PlatformScreen ps) {
        screen = ps;
    }

    @Override
    public Graphics2D getClippedGraphics(List<Rectangle> clipRects) {
        return screen.getClippedGraphics(clipRects);
    }

    @Override
    public Rectangle getBounds() {
        return screen.getBounds();
    }

    @Override
    public ColorModel getColorModel() {
        return screen.getColorModel();
    }

    @Override
    public GraphicsConfiguration getGraphicsConfiguration() {
        return screen.getGraphicsConfiguration();
    }

}
