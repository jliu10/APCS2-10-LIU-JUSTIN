public class Kernel {
    float[][] kernel;

    /*Constructor takes the kernel that will be applied to the image
    This implementation only allows 3x3 kernels*/
    public Kernel(float[][]init) {
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
        else return 255;
    }


    /*Assume the destination is the same dimensions as the source.

    */
    void apply(PImage source, PImage destination) {
    }

}
