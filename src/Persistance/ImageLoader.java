package Persistance;

import Model.Image;

public interface ImageLoader {
    Image load();
    Image next();
    Image prev();
}
