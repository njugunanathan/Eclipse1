package contact;

class shape {
	void draw() {
		System.out.println("Drawing");

	}
}
class rectangle extends shape{
	void draw() {
		System.out.println("Drawing rectangle");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("drawing circle");}}
class triangle extends shape{
			void draw() {
				System.out.println("Drwaing triangle");
			}}
		class Hybridinheritance{
			public static void main(String[] args) { 
				shape s;
				s= new rectangle();
				s.draw();
				s= new circle();
				s.draw();
				s= new triangle();
				s.draw();
			}
		}
			