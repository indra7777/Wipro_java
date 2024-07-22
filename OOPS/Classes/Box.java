class Box {
        double width;
        double height;
        double depth;

        // This is the constructor for Box.
        Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
        }

        // This is the constructor for Box.
        Box() {
                width = 0;
                height = 0;
                depth = 0;
        }

        // compute and return volume
        double volume() {
                return width * height * depth;
        }

        public static void main(String[] args) {
                Box cuboid = new Box(10, 20, 30);
                System.out.println(cuboid.volume());
        }
}