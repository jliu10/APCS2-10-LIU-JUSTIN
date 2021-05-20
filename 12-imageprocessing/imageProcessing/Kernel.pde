public class Kernel {
    float[][] kernel;

    /*Constructor takes the kernel that will be applied to the image
    This implementation only allows 3x3 kernels*/
    public Kernel(float[][] init) {
        kernel = init;
    }

    /*If part of the kernel is off of the image, return black, Otherwise
    Calculate the convolution of r/g/b separately, and return that color
    */
    color calcNewColor(PImage img, int x, int y) {
    //Hint: start by always returning black.
    //This will let you test your apply method right away!
        if(x == 0 || y == 0 || x == img.width - 1 || y == img.height - 1) {
            return 0;
        }
        float r, g, b;
        r = g = b = 0;
        for(int i = 0; i < 3; i++) for(int j = 0; j < 3; j++) {
            int pix = img.get(x - 1 + i, y - 1 + j);
            r += kernel[i][j] * red(pix);
            g += kernel[i][j] * green(pix);
            b += kernel[i][j] * blue(pix);
        }
        return color(r, g, b);
    }


    /*Assume the destination is the same dimensions as the source.
    */
    void apply(PImage source, PImage destination) {
        for(int x = 0; x < source.width; x++) {
            for(int y = 0; y < source.height; y++) {
                destination.set(x, y, calcNewColor(source, x, y));
            }
        }
    }

}
